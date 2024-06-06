<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: xiaomi
  Date: 2021/5/22
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" errorPage="err.jsp" language="java" pageEncoding="UTF-8" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
     <%
  /*     //request   在单次请求中存储
        request.getAttribute("");
        request.setAttribute("","");
        request.setCharacterEncoding("utf-8");
        //response
       response.sendRedirect("");
       //session  会话  包含了多次request  在多次请求中，但是属于同一个会话期间
       session.setAttribute("","");
       session.getAttribute("");
       //application 服务器运行期间，包含了多个session   在服务器运行期间，数据都可以进行获取
       application.setAttribute("","");
       application.getAttribute("");
       //pageContext  在当前页面有存储数据
       pageContext.setAttribute("","");
       pageContext.getAttribute("");
       //四个内置对象，其实也是四个作用域，作用域从小到大顺序是:
       //pageContext  request  session   application
       //page  相当于this
       //page
       //config  获得配置信息
       config.getInitParameter("");
       //out 输出对象
       PrintWriter writer = response.getWriter();
       out.print("");//往页面进行输出
       System.out.println("");//控制台输出
       //exception

*/

     %>

    <%=5/0%>

    <%!   //java代码
      List list=null;
      int a=10;
      String b="abc";%>
     <%!  public String test(){
       return   b;
     }  %>
  a=<%=a%><br>
  btest=<%=test()%>
  <%=request.getAttribute("aaa")%>

  <!--  注释内容-->

  <%--  jsp 注释--%>

  <%@ include file="success.html"%>
  </body>
</html>
