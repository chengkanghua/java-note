
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>处理器参数处理</title>
</head>
<body>

    <h3>8.1、获取集合类型的参数</h3>
    <form action="/param/test08" method="post">
        球队name1：<input name="teamName" /><br/>
        球队name2：<input name="teamName" /><br/>
        球队name3：<input name="teamName" /><br/>
        <button type="submit">提交</button>
    </form>
    <h3>8.2、获取对象集合类型的参数</h3>
    <form action="/param/test09" method="post">
        球队ID1：<input name="teamList[0].teamId" /><br/>
        球队ID2：<input name="teamList[1].teamId" /><br/>
        球队ID3：<input name="teamList[2].teamId" /><br/>
        球队name1：<input name="teamList[0].teamName" /><br/>
        球队name2：<input name="teamList[1].teamName" /><br/>
        球队name3：<input name="teamList[2].teamName" /><br/>
        <button type="submit">提交</button>
    </form>

    <h3>7、获取数组类型的参数</h3>
    <form action="/param/test07" method="post">
        球队name1：<input name="teamName" /><br/>
        球队name2：<input name="teamName" /><br/>
        球队name3：<input name="teamName" /><br/>
        <button type="submit">提交</button>
    </form>
    <h3>6、获取日期类型的参数</h3>
    <form action="/param/test06" method="post">
        球队ID：<input name="teamId" /><br/>
        球队name：<input name="teamName" /><br/>
        球队location：<input name="location" /><br/>
        日期：<input  name="createDate" /><br/>
        <button type="submit">提交</button>
    </form>
    <h3>5、直接使用URL地址传参</h3>
    <h3>4、使用 HttpServletRequest 对象获取参数</h3>
    <form action="/param/test04" method="post">
        球队ID：<input name="teamId" /><br/>
        球队name：<input name="teamName" /><br/>
        球队location：<input name="location" /><br/>
        <button type="submit">提交</button>
    </form>

    <h3>3、请求参数和方法名称的参数不一致</h3>
    <form action="/param/test03" method="post">
        球队ID：<input name="id" /><br/>
        球队name：<input name="name" /><br/>
        球队location：<input name="location" /><br/>
        <button type="submit">提交</button>
    </form>

    <h3>2、使用对象接收多个参数</h3>
    <form action="/param/test02" method="post">
        球队ID：<input name="teamId" /><br/>
        球队name：<input name="teamName" /><br/>
        球队location：<input name="location" /><br/>
        <button type="submit">提交</button>
    </form>

    <h3>1、直接使用方法的参数逐个接受</h3>
    <form action="/param/test01" method="post">
        球队ID：<input name="teamId" /><br/>
        球队name：<input name="teamName" /><br/>
        球队location：<input name="teamLocation" /><br/>
        <button type="submit">提交</button>
    </form>
</body>
</html>
