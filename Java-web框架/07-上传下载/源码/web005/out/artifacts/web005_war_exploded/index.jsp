
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <h1>上传</h1>
  <form action="/toupload" method="post" enctype="multipart/form-data">
      file:<input type="file" name="myfile"><br>
       username:<input type="text" name="uname"><br>
       <input type="submit" value="upload">
  </form>
  </body>
</html>
