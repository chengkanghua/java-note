package com.lina.controller;

import com.lina.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @RequestMapping(value = "add.do",method = RequestMethod.GET)
    public ModelAndView addTeam(){
        System.out.println("TeamController----addTeam----");
        ModelAndView mv=new ModelAndView();
        mv.setViewName("team/add");//映射为物理的资源路径：/jsp/team/add.jsp
        return mv;
    }
    @RequestMapping(value = "update.do",method = RequestMethod.POST)
    public ModelAndView updateTeam(){
        System.out.println("TeamController----updateTeam----");
        ModelAndView mv=new ModelAndView();
        mv.setViewName("team/update");//映射为物理的资源路径：/jsp/team/update.jsp
        return mv;
    }

    //定义了处理器对于请求的映射规则
    @RequestMapping("hello")
    public ModelAndView add(){
        System.out.println("TeamController----add----");
        teamService.add();
        ModelAndView mv=new ModelAndView();
        //相当于原来request.setAttrubuite("teamName","湖人");
        mv.addObject("teamName","湖人");
        //转化完毕的路径就是 /jsp/index.jsp
        mv.setViewName("index");//未来要经过视图解析器处理,转化为物力资源路径,相当于request.getRequestDispatcher("index.jsp").forward(.....)
        return mv;
    }

}
