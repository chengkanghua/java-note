<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>success.jsp,username=${username}</h1>
    <a href="/downimg?filename=${imgname}">下载</a><br>
   <img src="myuploadfile/${imgname}">
</body>
</html>
