package com.lina.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("navigation")
public class NavigationController {
    //页面导航、资源跳转
    //1、返回字符串
    //2、使用ModelAndView
    //springMVC使用不同的前缀
    // 转发： forward:url  默认方式
    // 重定向  redirect：url

    //转发向到一个jsp页面
    @RequestMapping("test01-1")
    public String test011(HttpServletRequest request){
        System.out.println("test01-1--------------");
        request.setAttribute("teamName","湖人队");
        return "OK";//默认方式:由视图解析器处理之后将逻辑视图转为物理资源路径
        //return "forward:/jsp/OK.jsp";//当添加了forward前缀之后，视图解析器中的前后缀就失效了，必须自己编写绝对路径
    }

    @RequestMapping("test01-2")
    public ModelAndView test012(HttpServletRequest request){

        ModelAndView mv=new ModelAndView();
        mv.addObject("teamName","热火队");
       // mv.setViewName("forward:/jsp/OK.jsp");//默认方式:由视图解析器处理之后将逻辑视图转为物理资源路径
        mv.setViewName("OK");//当添加了forward前缀之后，视图解析器中的前后缀就失效了，必须自己编写绝对路径
        return mv;
    }
    //重定向到一个jsp页面
    @RequestMapping("test02-1")
    public String test021(HttpServletRequest request){
        System.out.println("test02-1--------------");//页面上无法获取到存储在request作用域中的值，请求中断了
        request.setAttribute("teamName","勇士队");//当添加了redirect前缀之后，视图解析器中的前后缀就失效了，必须自己编写绝对路径
        return "redirect:/jsp/OK.jsp";
    }
    @RequestMapping("test02-2")
    public ModelAndView test022(HttpServletRequest request){
        System.out.println("test02-2--------------");
        ModelAndView mv=new ModelAndView();
        //存储在request作用域中的值以参数的形式追加在URL后面  http://localhost:8080/jsp/OK.jsp?teamName=热火队&teamId=1001
        mv.addObject("teamName","热火队");
        mv.addObject("teamId","1001");
        mv.setViewName("redirect:/jsp/OK.jsp");//当添加了redirect前缀之后，视图解析器中的前后缀就失效了，必须自己编写绝对路径
        return mv;
    }
    //重定向或者转发到控制器
    @RequestMapping("test03-1")
   public ModelAndView test031(){
        System.out.println("test03-1----转发到控制");
        ModelAndView mv=new ModelAndView();
        mv.addObject("teamName","小牛");
        mv.setViewName("forward:/navigation/test02-2");
        return mv;
   }

    @RequestMapping("test03-2")
    public ModelAndView test032(){
        System.out.println("test03-2----重定向到控制");
        ModelAndView mv=new ModelAndView();
        mv.addObject("teamName","凯尔特人");
        mv.addObject("teadmId","1003");
        mv.setViewName("redirect:/navigation/test01-1");//参数值直接追加到URL后面
        return mv;
    }

}
