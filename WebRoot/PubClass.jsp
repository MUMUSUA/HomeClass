
<%@ page language="java" import="java.util.*,com.ascent.po.*,com.opensymphony.xwork2.ActionContext" pageEncoding="GBK"%>
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
    <title>��ͥ����ϵͳ</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/carousel/">
	
    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/jumbotron/">
    <!-- Bootstrap core CSS -->
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
    <a class="navbar-brand" href="Home.jsp">��ͥ����ƽ̨</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarCollapse">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
          <a class="nav-link" href="Home.jsp">��ҳ <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item active">
          <a class="nav-link" href="showTea.action">����ʦ�� <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item active">
          <a class="nav-link" href="showCou.action"> ������<span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item active">
          <a class="nav-link" href="About.jsp">�������� <span class="sr-only">(current)</span></a>
        </li>
        <% 
       
        String name = (String)ActionContext.getContext().getSession().get("User"); %>
        
       <li class="nav-item active">
          <div class="dropdown">
    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" style=" color:white">
      ��������
    </button>

    <div class="dropdown-menu">
        <a class="dropdown-item" href="Show.action?username=<%=name %>">�鿴������Ϣ</a>
      <a class="dropdown-item" href="Show.action?username=<%=name %>&&id=2">�޸ĸ�����Ϣ</a>
      <a class="dropdown-item" href="showUc.action?username=<%=name %>">ѡ����Ϣ</a>
      <a class="dropdown-item" href="showUc.action?username=<%=name %>&&type=2">ѡ�ι���</a>
      <a class="dropdown-item" href="Delete.action?username=<%=name %>">ע���˺�</a>
    </div>
  </div>
  </li>
        
        

        
      </ul>
        <span style="font-size: 20px; color: #54c0f6"> 
        
           <%
    String username = (String)ActionContext.getContext().getSession().get("User");
    if (username != null){
        out.println("���ã�"+username+"&nbsp;<a href='logout.jsp'>�˳���½</a>&nbsp;&nbsp;");
    }
    else{
         username="�ο�";
        out.println("����δ��½&nbsp;<a href='Login.jsp'>��˵�½</a>&nbsp;&nbsp;");
    }
                        %>
        
         
	  </span>           
	
	
	
    </div>
  </nav>
</header>

<main role="main">

  <div class="jumbotron">
    <div class="container">
    <img src="assets/brand/7.png"/>
      <h3 class="display-2">��ͥ��������������</h3>
      <p></p>
       </div>
  </div>

  <div class="container">
  <form action="findCourse.action">

  <input type="text" name="cid" class="form-control" placeholder="������Ҫ�����Ŀγ̺�" required autofocus>
 <button class="btn btn-lg btn-primary btn-block" type="submit">����</button>
 </form>
  <s:iterator value="# request.allInfo">
    <!-- Example row of columns -->
    <div class="row">
      <div class="col-md-8" style="border-bottom:1px solid #000">
        <h2><s:property  value="Cname"></s:property></h2>
        <p>������<s:property  value="cteaid"></s:property></p>
        <p>����ʱ�䣺<s:property  value="time"></s:property></p>
        <p>�γ̽��ܣ�<s:property  value="introduction"></s:property></p>

        <p align="right"><a class="btn btn-primary" href="addUc.action?username=<%=username %>
        &&Cid=<s:property  value="Cid"></s:property>
        &&Cname=<s:property  value="Cname"></s:property>
        &&Ctea=<s:property  value="Ctea"></s:property>
        &&time=<s:property  value="time"></s:property>"
         role="button">����γ� &raquo;</a></p>
      </div>
    </div>
   
</s:iterator>
  </div> <!-- /container -->
 

  <br><br><br>

    <!-- /END THE FEATURETTES -->

  </main><!-- /.container -->

    <p class="float-right"><a href="PubClass.jsp"><img class="mb-4" src="assets/brand/backtotop.svg" alt="" width="30" height="30" ></a></p>
  <!-- FOOTER -->
  <footer class="container">

  
  <div class="jumbotron text-center" style="margin-bottom:0">
<center> ���1902�� 09 ������</center>
<center> &copy; 2021</center>
</div>

</main>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
      <script>window.jQuery || document.write('<script src="../assets/js/vendor/jquery.slim.min.js"><\/script>')</script><script src="assets/dist/js/bootstrap.bundle.js"></script></body>
    
  </body>

</html>
