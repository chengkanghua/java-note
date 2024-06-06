<%@ page import="com.yhp.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: xiaomi
  Date: 2021/5/23
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> </title>
</head>
<body>
   <%
       //el表达式只能从四个作用域中取值
       //el表达式在取值时，从pageContext逐个范围取值
       pageContext.setAttribute("k1","pagecontext---aaaa");
       request.setAttribute("k1","req--aaa");
       session.setAttribute("k1","session-aaa");
       application.setAttribute("k1","app---aa");
   %>

reqeuest=<%=request.getAttribute("k1")%><br>
req2=${requestScope.k1}


   <% int a=20;
   pageContext.setAttribute("a1",a);%>
${1+2}<br>
${a1+10}<br>
${a1>30}<br>
${a1>30?"aa":"bb"}

<hr>
<%
    User user = new User();
    user.setAge(10);
    user.setName("abc");
    pageContext.setAttribute("u1",user);
    List list=new ArrayList();
    list.add("listaaa");
    list.add(user);
    pageContext.setAttribute("listtest",list);
    Map map=new HashMap();
    map.put("m1","mmmmm");
    map.put("mu1",user);
    pageContext.setAttribute("map1",map);
%>
${u1.name}--${u1.age}<br>
${listtest[0]}--${listtest[1].name}<br>
${map1.m1}-----${map1.mu1.name}<br>














</body>
</html>
