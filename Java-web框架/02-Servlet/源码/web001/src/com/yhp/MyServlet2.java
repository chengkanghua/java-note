package com.yhp;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet2 extends HttpServlet {

    public MyServlet2(){
        System.out.println("无参构造被执行");
    }
   /* @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //ServletRequest,HttpServletRequest 请求对象
        ServletContext servletContext = req.getServletContext();
        ServletConfig servletConfig = getServletConfig();
        //ServletResponse, HttpServletResponse 响应对象

        System.out.println("service22---------");
    }*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("doGet()-----");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doPost()");
        req.setCharacterEncoding("utf-8");
        //1.接收参数
        String username = req.getParameter("username");
        String[] loves = req.getParameterValues("love");
        System.out.println(username);
        for (String love : loves) {
            System.out.println("love="+love);
        }
        //2.跳转页面
        req.getRequestDispatcher("success.html").forward(req,resp); //转发
       // resp.sendRedirect("success.html");  //重定向
        //3.服务器端保存数据给前台时使用
        req.setAttribute("uname",username);
        //前端获取数据
        Object uname = req.getAttribute("uname");
    }

    @Override
    public void destroy() {
        System.out.println("destroy2-----");
    }

   /* @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("init2------"+);
    }*/

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init-----初始化参数:"+config.getInitParameter("mycode"));
        System.out.println("context-init:"+config.getServletContext().getInitParameter("mycodeall"));
    }
}
