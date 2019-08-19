<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html>
<head>
      
      <title>Pet Shop</title>
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	  <link href="${pageContext.request.contextPath}/view-a/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
      <link href="${pageContext.request.contextPath}/view-a/css/shop-homepage.css" rel="stylesheet">
      <script src="${pageContext.request.contextPath}/view-a/vendor/jquery/jquery.min.js"></script>
      <script src="${pageContext.request.contextPath}/view-a/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</head>
<body>
		  <nav class="navbar navbar-expand-lg navbar-dark bg-danger fixed-top">
			    <div class="container">
			       <a class="navbar-brand" href="homeAdmin"><h4>Pet Shop</h4></a>
			       <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
			       <span class="navbar-toggler-icon"></span>
			      </button>
				      <div class="collapse navbar-collapse" id="navbarResponsive">
				        <ul class="navbar-nav ml-auto">
						       <li class="nav-item active">
						           <a class="nav-link" href="homeAdmin">Home
						             <span class="sr-only">(current)</span>
						           </a>
						       </li>
						        <li class="nav-item">
					            	<a class="nav-link" href="listProductError">Product Error</a>
					          </li>
					           <li class="nav-item">
					            	<a class="nav-link" href="listOrderWait">Order Wait</a>
					          </li>
					          <li class="nav-item">
					            	<a class="nav-link" href="listOrderSuccess">Order Success</a>
					          </li>
					          <li class="nav-item">
					            	<a class="nav-link" href="listOrderCancel">Order Cancel</a>
					          </li>
					          <li class="nav-item">
					            	<a class="nav-link" href="logout">Logout</a>
					          </li>
				        </ul>
				      </div>
			    </div>
		  </nav>
</body>
</html>