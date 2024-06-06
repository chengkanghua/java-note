<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>result</title>
    <script src="/js/jquery-1.11.1.js"></script>
</head>
<body>
   <h1>result---------------------</h1>
    <H3>test01-----------${teamName}</H3>
    <H3>test02---------request作用域：--${requestScope.team.teamId}-${requestScope.team.teamName}-${requestScope.team.location}</H3>
    <H3>test02---------session作用域：--${requestScope.team.teamId}-${requestScope.team.teamName}-${requestScope.team.location}</H3>

<div>
    <button type="button" id="btn1">ajax请求自定义对象</button>
    <h3>ajax请求自定义对象的结果展示</h3>
    <p id="res"></p>
</div>

   <div>
       <button type="button" id="btn2">ajax请求对象--List</button>
       <h3>ajax请求自定义对象--list的结果展示</h3>
       <p id="res2"></p>
   </div>

   <div>
       <button type="button" id="btn3">ajax请求对象-Map</button>
       <h3>ajax请求对象--Map的结果展示</h3>
       <p id="res3"></p>
   </div>
<script>
    $(function (){
        $("#btn1").click(
            function(){
                $.ajax({
                    type:"POST",
                    url:"/result/test03-3",
                    data:"",
                    success:function (msg){
                        //alert(msg);
                        var name=msg.teamName;
                        var id=msg.teamId;
                        var location=msg.location;
                        $("#res").html("name:"+name+",id:"+id+",location:"+location);
                    }
                });
            }
        );

        $("#btn2").click(
            function(){
                $.ajax({
                    type:"POST",
                    url:"/result/test03-4",
                    data:"",
                    success:function (list) {
                        //alert(msg);
                        var str = "";
                        for (var i = 0; i < list.length; i++) {
                            var msg=list[i];
                            var name = msg.teamName;
                            var id = msg.teamId;
                            var location = msg.location;
                            str+="name:" + name + ",id:" + id + ",location:" + location+"<br/>";
                        }
                        $("#res2").html(str);
                    }
                });
            }
        );

        $("#btn3").click(
            function(){
                $.ajax({
                    type:"POST",
                    url:"/result/test03-5",
                    data:"",
                    success:function (map) {
                        //alert(msg);
                        var str = "";
                        $.each(map,function (i,obj){
                            str+="name:" + obj.teamName + ",id:" + obj.teamId + ",location:" + obj.location+"<br/>";
                        });
                        $("#res3").html(str);
                    }
                });
            }
        );
    });
</script>
</body>
</html>
