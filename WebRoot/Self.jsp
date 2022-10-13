<%@ page language="java" import="java.util.*,com.ascent.po.*,com.opensymphony.xwork2.ActionContext" pageEncoding="UTF-8"%>
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
    <title>家庭辅导系统</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/carousel/">

    <!-- Bootstrap core CSS -->
    
<link href="assets/dist/css/bootstrap.min.js" rel="stylesheet">
<link href="assets/dist/css/bootstrap.css" rel="stylesheet">
<link href="assets/dist/css/carousel.css" rel="stylesheet">
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
    <link href="assets/dist/css/carousel.css" rel="stylesheet">
  </head>
  
  <body>
    <header>
  <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
    <a class="navbar-brand" href="#">家庭辅导</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarCollapse">
      <ul class="navbar-nav mr-auto">
               <li class="nav-item active">
          <a class="nav-link" href="Home.jsp">主页 <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item active">
          <a class="nav-link" href="showTea.action">优质师资 <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item active">
          <a class="nav-link" href="showCou.action"> 公开课<span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item active">
          <a class="nav-link" href="About.jsp">关于我们 <span class="sr-only">(current)</span></a>
        </li>
        <% String name = (String)ActionContext.getContext().getSession().get("User"); %>
        
       <li class="nav-item active">
          <div class="dropdown">
    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" style=" color:white">
      个人中心
    </button>

    <div class="dropdown-menu">
        <a class="dropdown-item" href="Show.action?username=<%=name %>">查看个人信息</a>
      <a class="dropdown-item" href="Show.action?username=<%=name %>&&id=2">修改个人信息</a>
      <a class="dropdown-item" href="showUc.action?username=<%=name %>">选课信息</a>
      <a class="dropdown-item" href="showUc.action?username=<%=name %>&&type=2">选课管理</a>
      <a class="dropdown-item" href="Delete.action?username=<%=name %>">注销账号</a>
    </div>
  </div>
  </li>
        
      </ul>
        <span style="font-size: 20px; color: #54c0f6"> 
        
           <%
    String username = (String)ActionContext.getContext().getSession().get("User");
    if (username != null){
        out.println("您好，"+username+"&nbsp;<a href='logout.jsp'>退出登陆</a>&nbsp;&nbsp;");
    }
    else{
         username="游客";
        out.println("您还未登陆&nbsp;<a href='Login.jsp'>点此登陆</a>&nbsp;&nbsp;");
    }
                        %>
        
         
	  </span>           
	
	
	
    </div>
  </nav>
</header>

<main role="main">
<br><br><br>

<center>
<div class="container" style="width:700px">
  
  <ul class="list-group">
 <s:iterator value="# request.info">
    <li class="list-group-item active"><h3>个人信息</h3></li>
    <li class="list-group-item">用户名： <s:property  value="username"></s:property></li>
    <li class="list-group-item">真实姓名：    <s:property  value="realname"></s:property></li>
    <li class="list-group-item">年龄：<s:property  value="age"></s:property></li>
    <li class="list-group-item">性别：<s:property  value="sex"></s:property></li>
    <li class="list-group-item">联系电话： <s:property  value="phone"></s:property></li>
    <li class="list-group-item">邮箱：   <s:property  value="email"></s:property></li>
    <li class="list-group-item">地址：   <s:property  value="address"></s:property></li>
    </s:iterator>
  </ul>
</div>

    
  


  </center>
  

  <!-- /.container -->
<br><br><br>
    <p class="float-right"><a href="#"><img class="mb-4" src="assets/brand/backtotop.svg" alt="" width="30" height="30" ></a></p>
  <!-- FOOTER -->
  <footer class="container">

  
  <div class="jumbotron text-center" style="margin-bottom:0">
<center> 软件1902班 09 李梦婷</center>
<center> &copy; 2021</center>
</div>

</main>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
      <script>window.jQuery || document.write('<script src="../assets/js/vendor/jquery.slim.min.js"><\/script>')</script><script src="assets/dist/js/bootstrap.bundle.js"></script></body>
    
  </body>

</html>

























