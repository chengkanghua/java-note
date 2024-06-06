<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
      <script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#uname").blur(function(){
                //1.接收输入的信息
                var uname=$(this).val();
                //2.发送ajax
               /* $.ajax({
                    url:"/checkuname",
                    type:"post",
                    data:"username="+uname,
                    dataType:"text",
                    success:function(rs){
                        $("#rs").html(rs);
                    }
                });*/
              $.get("/checkuname","username="+uname,function(rs){
                  $("#rs").html(rs);
              });

            });

        })
    </script>
      <style type="text/css">
          #rs{ color:red}
      </style>
  </head>
  <body>
      <h1>注册</h1>
      username:<input type="text" id="uname" ><span id="rs" ></span>
  </body>
</html>
