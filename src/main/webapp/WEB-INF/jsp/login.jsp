<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>登录 - 12315投诉举报处理系统</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="keywords" content="Simple Login Form Widget Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design" />
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
</head>
<body>
    <h1>12315投诉举报处理系统 后台登录系统</h1>
    <div class="container w3">
        <h2>现在登录</h2>
		<form action="${pageContext.request.contextPath }/syslogin" method="post">
			<div class="username">
				<span class="username" style="height:19px">用户:</span>
				<input type="text" name="username" class="name" placeholder="" required="">
				<div class="clear"></div>
			</div>
			<div class="password-agileits">
				<span class="username"style="height:19px">密码:</span>
				<input type="password" name="password" class="password" placeholder="" required="">
				<div class="clear"></div>
			</div>
			<%-- <div><span style="font: 20px;">${errorInfo }</span></div> --%>
			<font style="font: 20px; color: white;">${errorInfo }</font>
			<br />
			</div>
			<div class="login-w3">
					<input type="submit" class="login" value="登录">
			</div>
			<div class="clear"></div>
		</form>
	</div>
	<div class="footer-w3l">
		<p> 12315投诉举报处理系统 后台登录系统</p>
	</div>
</body>
</html>