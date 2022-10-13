<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <meta charset="utf-8">
   
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.0.1">
    <title>家庭辅导平台</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/sign-in/">

    <!-- Bootstrap core CSS -->
<link href="assets/dist/css/bootstrap.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="assets/dist/css/regist.css" rel="stylesheet">

  </head>
  
  <body>
     <form class="form-regist" action="Regist.action">

  <center><img class="mb-4" src="assets/brand/logo.svg" alt="" width="72" height="72" ></center>
 <h1 class="h3 mb-3 font-weight-normal" align="center">注册</h1> 
  <label for="inputUsername" class="sr-only">Username</label>
  <input type="text" name="username" class="form-control" placeholder="请输入用户名" required autofocus>
  <label for="inputPassword" class="sr-only">Password</label>
  <input type="password" name="password" class="form-control" placeholder="请输入密码" required>
  <label for="inputUsername" class="sr-only">Realname</label>
  <input type="text" name="realname" class="form-control" placeholder="请输入真实姓名" required autofocus>
  <label for="inputUsername" class="sr-only">age</label>
  <input type="text" name="age" class="form-control" placeholder="请输入年龄" required autofocus>

  <select id="sex" name="sex" class="form-control" value="请选择性别">
	<option value="female">女</option>
	<option value="male">男</option>
</select>
   <label for="inputUsername" class="sr-only">email</label>
  <input type="text" name="email" class="form-control" placeholder="请输入邮箱" required autofocus>
  <label for="inputUsername" class="sr-only">phone</label>
  <input type="text" name="phone" class="form-control" placeholder="请输入联系电话" required autofocus>
  <label for="inputUsername" class="sr-only">address</label>
  <input type="text" name="address" class="form-control" placeholder="请输入地址" required autofocus>
  
  
  <button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
  <a href="Login.jsp">已经注册了，点击去登录</a>
  <p class="mt-5 mb-3 text-muted" align="center">&copy; 2021</p>
</form>
  </body>
</html>
