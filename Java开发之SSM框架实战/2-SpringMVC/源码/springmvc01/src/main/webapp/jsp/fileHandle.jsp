<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件操作</title>
</head>
<body>

    <form action="/file/upload" method="post" enctype="multipart/form-data">
        请选择文件：<input type="file" name="myFile" /><br/>
        <button type="submit">上传文件</button>
    </form>

    <form action="/file/download" method="post" enctype="multipart/form-data">
        <button type="submit">下载图片--09a1e256877042a0aa196d77a6be6401.jpg</button>
    </form>
</body>
</html>
