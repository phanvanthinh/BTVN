<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <meta charset="utf-8">

  <title>PetShop</title>

  <!-- Bootstrap core CSS -->
  <link href="${pageContext.request.contextPath}/view-a/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/view-a/css/shop-homepage.css" rel="stylesheet">
  <script src="${pageContext.request.contextPath}/view-a/vendor/jquery/jquery.min.js"></script>
  <script src="${pageContext.request.contextPath}/view-a/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</head>
<body>
         <nav class="navbar navbar-expand-lg navbar-dark bg-danger fixed-top">
    <div class="container">
      <a class="navbar-brand" href="/JspPetShop/home"><h4>Pet Shop</h4></a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="/JspPetShop/home">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item dropdown">
                   <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
               Product
                   </a>
			    <div class="dropdown-menu">
                   <a class="dropdown-item" href="#">Husky</a>
                   <a class="dropdown-item" href="#">Alaska</a>
                   <a class="dropdown-item" href="#">Golden</a>
				 </div>
				</li>
          <li class="nav-item">
            <a class="nav-link" href="/JspPetShop/login">Login</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="http://localhost:8080/JspPetShop/view-a/view/home.jsp"></a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  
  
</body>
</html>