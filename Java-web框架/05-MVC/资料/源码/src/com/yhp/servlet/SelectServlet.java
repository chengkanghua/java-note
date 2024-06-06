package com.yhp.servlet;

import com.yhp.bean.Student;
import com.yhp.service.StudentService;
import com.yhp.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

// 处理请求的过程：
// 请求->servlet->调取service(业务逻辑代码)->调取dao层(持久化层)->db(mysql)
//MVC     M-javabean*(bean,dao,dao.impl,service)    V- jsp,html   C-servlet

@WebServlet(urlPatterns = {"/select"})
public class SelectServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.接收参数

        //2.调取逻辑方法
        StudentService studentService=new StudentServiceImpl();
        List<Student> getall = studentService.getall();
        //3.跳转页面
        req.setAttribute("stulist",getall);
        req.getRequestDispatcher("show.jsp").forward(req,resp);
    }
}
