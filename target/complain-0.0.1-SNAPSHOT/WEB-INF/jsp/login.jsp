<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
request.setAttribute("ctx", basePath);
%>
<!DOCTYPE html>
<html lang="en" class="no-js">
    <head>
        <meta charset="utf-8">
        <title>登录 - 12315投诉举报处理系统</title>
		<meta name="keywords" content="12315系统,武汉市12315" />
		<meta name="description" content="" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link rel="stylesheet" href="${ctx }/css/reset.css">
        <link rel="stylesheet" href="${ctx }/css/supersized.css">
        <link rel="stylesheet" href="${ctx }/css/style.css">      
    </head>
    <body>
        <div class="page-container">
            <h1>12315后台处理系统 登录</h1>
            <form action="${ctx }/syslogin" method="post">
                <input type="text" name="username" class="username" placeholder="用户名" value="">
                <input type="password" name="password" class="password" placeholder="密码" value="">
                <button type="submit">登录</button>
                <div class="error"><span><font color="red" id="errMsg">${errorInfo }</font></span></div>
            </form>		
        </div>
		<br/>
		<br/>
		<br/>
		<div>
			<p  style="color:red;text-align:right"></p>
		</div>
        <!-- Javascript -->
        <script src="${ctx }/js/jquery-1.8.2.min.js"></script>
        <script src="${ctx }/js/supersized.3.2.7.min.js"></script>
        <script src="${ctx }/js/supersized-init.js"></script>
        <script src="${ctx }/js/scripts.js"></script>
    </body>
</html>


