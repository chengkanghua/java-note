<%@ page import="java.util.HashSet" %>
<%@ page import="java.util.Set" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: xiaomi
  Date: 2021/5/23
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <c:out value="abc"></c:out><br>
  <c:set var="u1"  value="testu1" scope="page"></c:set>
u1=${u1}
<%
 int age=20;
 pageContext.setAttribute("myage",age);
%>
<c:if test="${myage<18}">
    未成年
</c:if>
<c:if test="${myage>=18}">
    成年
</c:if>

<%
   Set set=new HashSet<>();
   set.add("qqq1");
    set.add("qqq2");
    set.add("qqq3");
    set.add("qqq4");
    pageContext.setAttribute("myset",set);
%>set=
<c:forEach items="${myset}" var="ageu1">
    ${ageu1}<br>
</c:forEach>
<c:choose>
    <c:when test=""></c:when>
    <c:when test=""></c:when>
    <c:otherwise></c:otherwise>
</c:choose>

<%
    Date date = new Date();
    pageContext.setAttribute("mydate",date);
%>
${mydate}<br>
<fmt:formatDate value="${mydate}" pattern="yyyy-MM-dd hh:mm:ss"></fmt:formatDate>
</body>
</html>
