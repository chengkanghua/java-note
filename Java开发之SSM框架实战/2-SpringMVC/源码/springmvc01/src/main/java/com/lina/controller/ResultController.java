package com.lina.controller;

import com.lina.pojo.Team;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@Controller
@RequestMapping("result")
public class ResultController {
    //4、 无返回值-- void
    @RequestMapping("test04-1")
    public void test041(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("直接使用HttpServletRequest进行服务器端转发");
        request.getRequestDispatcher("/jsp/OK.jsp").forward(request,response);
    }
    @RequestMapping("test04-2")
    public void test042(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("直接使用HttpServletResponse进行客户端重定向");
        response.sendRedirect("/jsp/OK.jsp");
    }

    @RequestMapping("test04-3")
    public void test043(HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        System.out.println("返回void类型测试---直接返回字符串");
        PrintWriter writer = response.getWriter();
        writer.write("返回void类型测试---直接返回字符串");
        writer.flush();
        writer.close();
    }
    @RequestMapping("test04-4")
    public void test044(HttpServletResponse response) throws ServletException, IOException {
        response.setStatus(302);//设置响应码  302表示重定向
        response.setHeader("Location","/jsp/OK.jsp");
    }


    //3、返回对象类型:任意对象类型都可以返回，但是不是作为逻辑试图，而是直接作为数据返回后直接展示。一般都是前段发起ajax异步请求的时候返回对象
    //返回的时候需要添加注解@ResponseBody ,将对象转化为json格式的数据放入到响应体
    @ResponseBody
    @RequestMapping("test03-1")
    public Integer test031(){
        return 666;
    }
    @ResponseBody
    @RequestMapping("test03-2")
    public String test032(){
        return "test";//直接返回数据，跟返回字符串区别开
    }
    @ResponseBody
    @RequestMapping("test03-3")
    public Team test033(){
        Team team=new Team();
        team.setLocation("迈阿密");
        team.setTeamId(1002);
        team.setTeamName("热火");
        return team;//直接返回数据，跟返回字符串区别开
    }

    @ResponseBody
    @RequestMapping("test03-4")
    public List<Team> test034(){
        List<Team> list=new ArrayList<>();
        for(int i=1;i<=5;i++) {
            Team team = new Team();
            team.setLocation("迈阿密"+i);
            team.setTeamId(1002+i);
            team.setTeamName("热火"+i);
            list.add(team);
        }
        return list;//直接返回数据，跟返回字符串区别开
    }

    @ResponseBody
    @RequestMapping("test03-5")
    public Map<String,Team> test035(){
        Map<String,Team> map=new HashMap<>();
        for(int i=1;i<=5;i++) {
            Team team = new Team();
            team.setLocation("金州"+i);
            team.setTeamId(1000+i);
            team.setTeamName("勇士"+i);
            team.setCreateDate(new Date());
            map.put(team.getTeamId()+"",team);
        }
        return map;//直接返回数据，跟返回字符串区别开
    }


    //2、返回字符串
    @RequestMapping("test02")
    public String test02(HttpServletRequest request){
        Team team=new Team();
        team.setLocation("迈阿密");
        team.setTeamId(1002);
        team.setTeamName("热火");
        //携带数据
        request.setAttribute("team",team);
        request.getSession().setAttribute("team",team);
        //资源跳转
        return "result";//经过InternalResourceViewResolver的处理，将字符串转换为物理资源路径 /jsp/result.jsp
    }

    //1、返回值 ModelAndView  这种方式既有数据的携带还有资源的跳转，可以选中这种方式
    @RequestMapping("test01")
    public ModelAndView test01(){
        ModelAndView mv=new ModelAndView();
        //携带数据
        mv.addObject("teamName","湖人队");//相当于request
        //页码跳转
        mv.setViewName("result");//经过视图解析器去处理 /jsp/result.jsp
        return mv;
    }

    @RequestMapping("hello")
    public String hello(){
        return "result";
    }



}
