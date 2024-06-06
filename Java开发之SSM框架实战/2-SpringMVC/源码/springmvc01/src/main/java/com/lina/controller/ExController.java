package com.lina.controller;

import com.lina.exceptions.TeamException;
import com.lina.exceptions.TeamIDException;
import com.lina.exceptions.TeamNameException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 测试异常处理的控制器
 */
@Controller
@RequestMapping("ex")
public class ExController {

    @RequestMapping("test01/{id}/{name}/{loc}")
    public ModelAndView test01(
            @PathVariable("id") Integer teamId,
            @PathVariable("name")String teamName,
            @PathVariable("loc")String loc) throws TeamException {
        ModelAndView mv=new ModelAndView();
        if(teamId<=1000){
            throw new TeamIDException("teamId不合法！必须在1000之上！");
        }
        if("test".equalsIgnoreCase(teamName)){
            throw new TeamNameException("teamName不合法！不能使用test");
        }
        if("test".equalsIgnoreCase(loc)){
            throw  new TeamException("team出现了异常！");
        }
        //System.out.println(10/0);
        mv.setViewName("OK");
        return mv;
    }


}
