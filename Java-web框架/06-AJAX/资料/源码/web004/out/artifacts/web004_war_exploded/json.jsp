
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#uid").blur(function(){
                var uid=$(this).val();
                //ajax发送给服务器，并进行查询
                $.post("/getuserbyid","uid="+uid,function(rs){
                        //将rs的数据进行转换
                      rs=eval("("+rs+")");
                      $("#uname").val(rs.username);
                      $("#sex").val(rs.sex);
                });
            });
        })
    </script>
</head>
<body>
  userid:<input type="text" id="uid"><br>
username:<input type="text" id="uname"><br>
sex:<input type="text" id="sex">
</body>
</html>
