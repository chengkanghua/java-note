package com.lina.controller;

import com.github.pagehelper.PageInfo;
import com.lina.pojo.Team;
import com.lina.service.TeamService;
import com.lina.vo.QueryVO;
import com.lina.vo.ResultVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@ResponseBody
@RequestMapping("team")
public class TeamController {
    @Resource
    private TeamService teamService;

    //多条件分页查询
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ResultVO<Team> queryByPage(@RequestParam(value = "pageNum",required = false,defaultValue = "1") int pageNum,
                                      @RequestParam(value = "pageSize",required = false,defaultValue = "5") int pageSize,
                                      QueryVO vo){
        if(pageNum<=0){
            pageNum=1;
        }
        if(pageSize<=0){
            pageSize=5;
        }
        PageInfo<Team> teamPageInfo = teamService.queryByPage(pageNum, pageSize, vo);
        return new ResultVO<>(teamPageInfo);
    }

    /**
     * 添加一个球队
     * @param team
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ResultVO<Team> add(Team team){
        System.out.println(team);
        int res = teamService.add(team);
        if(res==1){
            return new ResultVO<>();
        }else{
            return new ResultVO<>(500,"服务器内容异常！程序员小哥哥在努力修复中.......请稍后再试！");
        }
    }

    /**
     * 根据主键查询
     * @param teamId
     * @return
     */
    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public ResultVO<Team> queryByID(@PathVariable("id") int teamId){
        Team team = teamService.queryById(teamId);
        return new ResultVO<>(team);
    }

    /**
     * 根据主键更新
     * @param teamId
     * @param team
     * @return
     */
    @RequestMapping(value = "{id}",method = RequestMethod.PUT)
    public ResultVO<Team> update(@PathVariable("id") int teamId,Team team){
        team.setTeamId(teamId);
        int update = teamService.update(team);
        if(update==1){
            return new ResultVO<>();
        }else{
            return new ResultVO<>(500,"服务器内容错误！请稍后再试！");
        }
    }

    /**
     * 根据主键删除--逻辑删除
     * @param teamId
     * @return
     */
    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public ResultVO<Team> del(@PathVariable("id")int teamId){
        int res = teamService.del(teamId);
        if(res==1){
            return new ResultVO<>();
        }else{
            return new ResultVO<>(500,"服务器错误！请稍后再试！");
        }
    }

    /**
     * 文件上传
     * @param myFile
     * @param request
     * @return
     */
    @RequestMapping(value = "{id}",method = RequestMethod.POST)
    public ResultVO<Team> upload(@PathVariable("id")int teamId,@RequestParam("logo")MultipartFile myFile, HttpServletRequest request){
        //上传文件到指定位置
        String path=request.getServletContext().getRealPath("/img/uploadFile");
        //文件原始名称
        String originalFilename = myFile.getOriginalFilename();
        //自定义文件名称=随机生成的字符串名称+原始文件的名称后缀
        int index=originalFilename.lastIndexOf(".");
        String hz=originalFilename.substring(index);
        String fileName= UUID.randomUUID().toString().replace("-","")+hz;
        int res=0;
        try {
            myFile.transferTo(new File(path+"/"+fileName));
            System.out.println("上传成功！"+path+"/"+fileName);
            //更新数据库表中额图片的位置
            Team team=new Team();
            team.setTeamId(teamId);
            team.setTeamLogo(fileName);
             res = teamService.update(team);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(res==1){
            return new ResultVO<>();
        }else{
            return new ResultVO<>(500,"服务器内容出错！请稍后再试！");
        }
    }
}
