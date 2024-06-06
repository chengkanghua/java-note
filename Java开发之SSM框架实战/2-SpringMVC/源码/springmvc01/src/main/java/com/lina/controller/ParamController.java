package com.lina.controller;
import com.lina.pojo.Team;
import com.lina.vo.QueryVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 处理器方法的参数
 */
@Controller
@RequestMapping("param")
public class ParamController {

    //8、获取集合类型的参数: 简单类型可以使用@RequestParam注解实现，但是对于对象的集合不支持,对象的集合必须封装在类中，作为一个属性操作
    @RequestMapping("test08")
    public ModelAndView test08(@RequestParam("teamName") List<String> nameList){
        System.out.println("test08--------------");
        for (String s : nameList) {
            System.out.println(s);
        }
        return new ModelAndView("OK");
    }

    @RequestMapping("test09")
    public ModelAndView test09(QueryVO vo){
        System.out.println("test09--------------");
        for (Team team: vo.getTeamList()) {
            System.out.println(team);
        }
        return new ModelAndView("OK");
    }


    //7、获取数组类型的参数
    @RequestMapping("test07")
    public ModelAndView test07(String[] teamName,HttpServletRequest request){
        System.out.println("test07--------------");
        //方式1：
        for (String s : teamName) {
            System.out.println(s);
        }
        //方式2：
        String[] teamNames = request.getParameterValues("teamName");
        for (String name : teamNames) {
            System.out.println(name);
        }
        return new ModelAndView("OK");
    }

    //6 、获取日期类型的参数 :对象类型中的日期属性上需要添加注解@DateTimeFormat(pattern = "yyyy-MM-dd")
    @RequestMapping("test06")
    public ModelAndView test06(Team team){
        System.out.println("test06--------------");
        System.out.println(team);
        return new ModelAndView("OK");
    }

    //5、直接使用URL地址传参: @PathVariable注解
    @RequestMapping("test05/{id}/{name}/{loc}")
    //http://localhost:8080/param/test05/1005/lacker/las
    public ModelAndView test05(@PathVariable("id") Integer teamId,
                               @PathVariable("name") String teamName,
                               @PathVariable("loc") String location){
        System.out.println("test05--------------");
        System.out.println(teamId);
        System.out.println(teamName);
        System.out.println(location);
        return new ModelAndView("OK");
    }

  // 4、使用 HttpServletRequest 对象获取参数:跟原来jservlet中使用的方式一样
// HttpServletResponse
// HttpSession
//请求中所携带的请求参数
  @RequestMapping("test04")
    public ModelAndView test04(HttpServletRequest request){
      System.out.println("test04--------------");
      String teamId = request.getParameter("teamId");
      String teamName = request.getParameter("teamName");
      String location = request.getParameter("location");
      if(teamId!=null)
         System.out.println(Integer.valueOf(teamId));
      System.out.println(teamName);
      System.out.println(location);
      return new ModelAndView("OK");
  }

    //3、请求参数和方法名称的参数不一致 使用注解@RequestParam(value="请求中的参数名称",
    // required=true/false--表示参数是否是必须的 true-默认值:必须赋值，否则报错 false:可以不赋值，默认是null
    //defaultValue=自定义默认值  如果没有从用户请求中获取到值，使用默认值
    @RequestMapping("test03")
    public ModelAndView test03(@RequestParam(value = "id",required = false,defaultValue = "1") Integer teamId,
                               @RequestParam(value = "name") String teamName,
                               @RequestParam(value = "location") String teamLocation){
        System.out.println("test03--------------");
        System.out.println(teamId);
        System.out.println(teamName);
        System.out.println(teamLocation);
        return new ModelAndView("OK");
    }
    //2：使用对象接收多个参数 要求：请求中携带的参数必须与对象属性名名称一致
    @RequestMapping("test02")
    public ModelAndView test01(Team team){
        System.out.println("test02--------------");
        System.out.println(team);
        return new ModelAndView("OK");
    }


    //1：直接使用方法的参数逐个接受 要求：方法参数的名称必须与请求中携带的参数名称一致
    //优势：不需要类型转换
    @RequestMapping("test01")
    public ModelAndView test01(Integer teamId,String teamName,String teamLocation){
        System.out.println("test01--------------");
        System.out.println(teamId);
        System.out.println(teamName);
        System.out.println(teamLocation);
        return new ModelAndView("OK");
    }

    @RequestMapping("hello")
    public ModelAndView hello(){
        System.out.println("param-----hello----------");
        return new ModelAndView("param");
    }
}

