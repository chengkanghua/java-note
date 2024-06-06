<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script type="text/javascript">
        function checkname(){
          //1.获取用户名
          var uname=document.getElementById("uname").value;
          //2.异步发送到服务器
          //2.1 创建异步对象
          var xmlHttp;
          if (window.XMLHttpRequest) {
            //非IE
            xmlHttp = new XMLHttpRequest();
          } else if (window.ActiveXObject) {
            //IE
            xmlHttp = new ActiveXObject("Microsoft.XMLHTTP")
          }
          //2.2 指定方法
        //  xmlHttp.open("get","/checkuname?username="+uname,true);
            xmlHttp.open("post","/checkuname",true);
          //2.3 指定回调函数
          xmlHttp.onreadystatechange = function() {
            if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
              //接收服务器返回的内容
               var txt=xmlHttp.responseText;
               document.getElementById("rs").innerHTML=txt;
            }
          }
          //2.4 发送请求
          //xmlHttp.send(null);
            //post
            xmlHttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded;charset=UTF-8");
          xmlHttp.send("username="+uname);
        }

    </script>
  </head>
  <body>
      <h1>注册</h1>
      username:<input type="text" id="uname" onblur="checkname()"><span id="rs" color="red"></span>
  </body>
</html>
