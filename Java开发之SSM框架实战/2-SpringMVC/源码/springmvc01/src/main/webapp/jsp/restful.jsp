<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>restful</title>
    <script src="/js/jquery-1.11.1.js"></script>
</head>
<body>
    <form id="myForm" method="post">
        球队ID：<input name="teamId" id="teamId"/><br/>
        球队name：<input name="teamName" /><br/>
        球队location：<input name="location" /><br/>
        <button type="button" id="btnGetAll">查询所有GET</button>
        <button type="button" id="btnGetOne">查询单个GET</button>
        <button type="button" id="btnPost">添加POST</button>
        <button type="button" id="btnPut">更新PUT</button>
        <button type="button" id="btnDelete">删除delete</button>
    </form>
<p id="showResult"></p>
</body>
</html>
<script>
    $(function (){
        $("#btnGetAll").click(function (){
            $.ajax({
                type:"GET",
                url:"/teams",
                data:"",
                dataType:"json",
                success:function (list){
                    alert(list);
                    var str="";
                    for(var i=0;i<list.length;i++){
                        var obj=list[i];
                        str+=obj.teamId+"-----"+obj.teamName+"-----"+obj.location+"<br/>";
                    }
                    $("#showResult").html(str);
                }
            });
        });

        $("#btnGetOne").click(function (){
            alert($("#teamId").val());
            $.ajax({
                type:"GET",
                url:"/team/"+$("#teamId").val(),
                data:"",
                dataType:"json",
                success:function (obj){
                    var str="";
                        str=obj.teamId+"-----"+obj.teamName+"-----"+obj.location+"<br/>";
                    $("#showResult").html(str);
                }
            });
        });

        $("#btnPost").click(function (){
            $.ajax({
                type:"POST",
                url:"/team",
                data:$("#myForm").serialize(),
                dataType:"json",
                success:function (msg){
                    $("#showResult").html(msg);
                }
            });
        });

        $("#btnPut").click(function (){
            $.ajax({
                type:"POST",
                url:"/team/"+$("#teamId").val(),
                data:$("#myForm").serialize()+"&_method=PUT",
                dataType:"json",
                success:function (msg){
                    $("#showResult").html(msg);
                }
            });
        });

        $("#btnDelete").click(function (){
            $.ajax({
                type:"POST",
                url:"/team/"+$("#teamId").val(),
                data:"&_method=DELETE",
                dataType:"json",
                success:function (msg){
                    $("#showResult").html(msg);
                }
            });
        });
    });
</script>
