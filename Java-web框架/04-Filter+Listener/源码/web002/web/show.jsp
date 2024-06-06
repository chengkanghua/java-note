<%--
  Created by IntelliJ IDEA.
  User: xiaomi
  Date: 2021/5/25
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <%
       String value ="";
       Cookie[] cookies = request.getCookies();
       if(cookies!=null){
           for (Cookie cookie : cookies) {
               if(cookie.getName()!=null&&cookie.getName().equals("uname")){
                    value = cookie.getValue();
                    pageContext.setAttribute("val",value);
                    break;
               }
           }
       }
   %>

    获取cookie的值，key=uname,value=${val}

   <h1>show.jsp---登录成功,欢迎:${sessionScope.username}</h1>
</body>
</html>
