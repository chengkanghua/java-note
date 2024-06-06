package com.lina.interceptor;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;
import java.util.Map;

public class FileInterceptor  implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag=true;
        //判断是否是文件上传的请求
        if(request instanceof MultipartHttpServletRequest){
            MultipartHttpServletRequest multipartRequest= (MultipartHttpServletRequest) request;
            Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
            //遍历文件集合
            Iterator<String> iterator = fileMap.keySet().iterator();
            while(iterator.hasNext()){
                String key = iterator.next();
                MultipartFile file = fileMap.get(key);
                //大小限制
                if(file.getBytes().length>512000){
                    request.setAttribute("msg","上传的文件大小超出了限制！最大是0。5M");
                }
                //类型的判定
                String originalFilename = file.getOriginalFilename();
                String hz=originalFilename.substring(originalFilename.lastIndexOf("."));
                if(!hz.toLowerCase().equals(".png") && !hz.toLowerCase().equals(".jpg")){
                    request.setAttribute("msg","文件上传类型有误！后缀必须是.png或者.jpg");
                    flag=false;
                }
                request.getRequestDispatcher("/jsp/fileTypeError.jsp").forward(request,response);
            }
        }
        return flag;
    }
}
