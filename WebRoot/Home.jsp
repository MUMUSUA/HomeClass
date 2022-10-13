<%@ page language="java" import="java.util.*,com.ascent.po.*,com.opensymphony.xwork2.ActionContext" pageEncoding="UTF-8"%>
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

    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/carousel/">

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
    <a class="navbar-brand" href="Home.jsp">家庭辅导平台</a>
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

  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner">
      <div class="carousel-item active">
        <img class="bd-placeholder-img" width="100%" height="100%" src="assets/brand/9.png" preserveAspectRatio="xMidYMid slice" focusable="false" role="img"><rect width="100%" height="100%" fill="#777"/>
        <div class="container">
          <div class="carousel-caption text-left" style="color:black">
            <h1>践行社会责任&nbsp关爱青少年健康成长</h1>
            <p>积极开展公益活动，推出各类素养课，为青少年健康成长护航</p>
             </div>
        </div>
      </div>
      <div class="carousel-item">
        <img class="bd-placeholder-img" width="100%" height="100%" src="assets/brand/8.png"  preserveAspectRatio="xMidYMid slice" focusable="false" role="img"><rect width="100%" height="100%" fill="#777"/>
        <div class="container">
          <div class="carousel-caption" style="color:black">
            <h1 >携手权威机构，致力家庭教育</h1>
            <p>与北师大、全国妇联等机构合作，提供优质教育资源服务</p>
           </div>
        </div>
      </div>
      <div class="carousel-item">
        <img class="bd-placeholder-img" width="100%" height="100%" src="assets/brand/7.png" preserveAspectRatio="xMidYMid slice" focusable="false" role="img"><rect width="100%" height="100%" fill="#777"/></svg>
        <div class="container">
          <div class="carousel-caption text-right" style="color:black">
            <h1>家庭教育领军品牌 千万家长信赖之选</h1>
            <p></p>
             </div>
        </div>
      </div>
    </div>
    <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>


  <!-- Marketing messaging and featurettes
  ================================================== -->
  <!-- Wrap the rest of the page in another container to center all the content. -->

  <div class="container marketing">

    <!-- START THE FEATURETTES -->

    <hr class="featurette-divider">

    <div class="row featurette">
      <div class="col-md-7">
        <h2 class="featurette-heading">18年教研经验</h2>
        <p class="lead">校验沉淀好方法</p>
      </div>
      <div class="col-md-5">
        <img class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto" width="500" height="500" src="assets/brand/10.jpg"  focusable="false" role="img" aria-label="Placeholder: 500x500"><rect width="100%" height="100%" fill="#eee"/><text x="50%" y="50%" fill="#aaa" dy=".3em"></text></svg>
      </div>
    </div>

    <hr class="featurette-divider">

    <div class="row featurette">
      <div class="col-md-7 order-md-2">
        <h2 class="featurette-heading">荣誉源于实力 </h2>
        <p class="lead">获得社会广泛认可</p>
      </div>
      <div class="col-md-5 order-md-1">
        <img class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto" width="500" height="500" src="assets/brand/24.jpg"   ><rect width="100%" height="100%" fill="#eee"/><text x="50%" y="50%" fill="#aaa" dy=".3em"></text>
      </div>
    </div>

    <hr class="featurette-divider">

    <div class="row featurette">
      <div class="col-md-7">
        <h2 class="featurette-heading">权威媒体多次报道关注 </h2>
        <p class="lead">多次被新闻联播、人民日报、CCTV、学习强国等权威媒体报道</p>
      </div>
      <div class="col-md-5">
        <img class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto" 
        width="500" height="500" src="assets/brand/35.jpg" 
        >
        <rect width="100%" height="100%" fill="#eee"/>
  
      </div>
    </div>

    <hr class="featurette-divider">

    <!-- /END THE FEATURETTES -->

  </div><!-- /.container -->

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
