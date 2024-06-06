package com.lina.controller;

import com.lina.exceptions.TeamException;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;

/**
 * 文件操作
 */
@Controller
@RequestMapping("file")
public class FileController {

    @RequestMapping("download")
    public ResponseEntity<byte[]> download(HttpServletRequest request) throws IOException {
        //指定要下载文件的路径
        String path=request.getServletContext().getRealPath("/uploadFile")+"/09a1e256877042a0aa196d77a6be6401.jpg";
        //创建响应的头信息
        HttpHeaders headers=new HttpHeaders();
        //标记以流的方式做出响应
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        //标记以附件的形式响应给用户
        headers.setContentDispositionFormData("accachment", URLEncoder.encode("09a1e256877042a0aa196d77a6be6401.jpg","utf-8"));

        File file=new File(path);
        ResponseEntity<byte[]> resp=new ResponseEntity<>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);
        return resp;
    }

    @RequestMapping("upload")
    public String upload(@RequestParam("myFile") MultipartFile myFile, HttpServletRequest request) throws Exception {
        //获取文件的原始名称  d:\aa.ss\img\cat.jpg
        String originalFilename = myFile.getOriginalFilename();
        //实际开发中，一般都需要将文件名称重新命名存储
        //存储到服务器的文件名称=随机的字符串+根据实际名称获取到的源文件的后缀
        String fileName= UUID.randomUUID().toString().replace("-","")+originalFilename.substring(originalFilename.lastIndexOf("."));
        System.out.println(fileName);
        //存储路径
        String realPath=request.getServletContext().getRealPath("/uploadFile")+"/";
        System.out.println(realPath);
        //文件上传
        try {
            myFile.transferTo(new File(realPath+fileName));
        } catch (IOException e) {
            e.printStackTrace();
            throw  new TeamException("文件上传出现问题！"+e.getMessage());
        }
        return "OK";
    }

    @RequestMapping("hello")
    public String hello(){
        return "fileHandle";
    }

}
