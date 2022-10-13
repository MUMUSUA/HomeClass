<%@ page language="java" import="java.util.*,com.ascent.po.*,com.opensymphony.xwork2.ActionContext" pageEncoding="gbk"%>
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
    <title>��ͥ����ƽ̨</title>
 <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/carousel/">

    <!-- Bootstrap core CSS -->
    
<link href="assets/dist/css/bootstrap.min.js" rel="stylesheet">
<link href="assets/dist/css/bootstrap.css" rel="stylesheet">
<link href="assets/dist/css/carousel.css" rel="stylesheet">
    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/sign-in/">


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
      <header>
  <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
    <a class="navbar-brand" href="#">��ͥ����</a>
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
        <% String name = (String)ActionContext.getContext().getSession().get("User"); %>
        
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
  
  <% UserInfo u=(UserInfo)ActionContext.getContext().getSession().get("Info"); %>
  
  
  <br><br><br>
     <form class="form-regist" action="Update.action">

 
 <h1 class="h3 mb-3 font-weight-normal" align="center">�޸���Ϣ</h1> 
  <br><label for="inputUsername" class="sr-only">Username</label>�û�����
  <input type="text" name="username" class="form-control" value="<%=u.getUsername() %>"  readonly required autofocus>
  <label for="inputPassword" class="sr-only">Password</label>���룺
  <input type="password" name="password" class="form-control" value="<%=u.getPassword() %>" required>
  <label for="inputUsername" class="sr-only">Realname</label>��ʵ����:
  <input type="text" name="realname" class="form-control" value="<%=u.getRealname() %>" required autofocus>
  <label for="inputUsername" class="sr-only">age</label>����:
  <input type="text" name="age" class="form-control" value="<%=u.getAge() %>" required autofocus>

   <label for="inputUsername" class="sr-only">email</label>����:
  <input type="text" name="email" class="form-control" value="<%=u.getEmail() %>" required autofocus>
  <label for="inputUsername" class="sr-only">phone</label>��ϵ�绰:
  <input type="text" name="phone" class="form-control" value="<%=u.getPhone() %>" required autofocus>
  <label for="inputUsername" class="sr-only">address</label>��ַ:
  <input type="text" name="address" class="form-control" value="<%=u.getAddress() %>" required autofocus>
  
  <button class="btn btn-lg btn-primary btn-block" type="submit">ȷ���޸�</button>
 <!--  <ul class="list-group">
 <s:iterator value="# request.info">
    <li class="list-group-item active"><h3>������Ϣ</h3></li>
    <li class="list-group-item">�û����� <s:property  value="username"></s:property></li>
    <li class="list-group-item">��ʵ������    <s:property  value="realname"></s:property></li>
    <li class="list-group-item">���䣺<s:property  value="age"></s:property></li>
    <li class="list-group-item">�Ա�<s:property  value="sex"></s:property></li>
    <li class="list-group-item">��ϵ�绰�� <s:property  value="phone"></s:property></li>
    <li class="list-group-item">���䣺   <s:property  value="email"></s:property></li>
    <li class="list-group-item">��ַ��   <s:property  value="address"></s:property></li>
    </s:iterator>
  </ul> -->

</form>

<br><br><br>
    <p class="float-right"><a href="#"><img class="mb-4" src="assets/brand/backtotop.svg" alt="" width="30" height="30" ></a></p>
  <!-- FOOTER -->
  <footer class="container">

  
  <div class="jumbotron text-center" style="margin-bottom:0">
<center> ���1902�� 09 ������</center>
<center> &copy; 2021</center>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
      <script>window.jQuery || document.write('<script src="../assets/js/vendor/jquery.slim.min.js"><\/script>')</script><script src="assets/dist/js/bootstrap.bundle.js"></script>
  </body>
</html>
