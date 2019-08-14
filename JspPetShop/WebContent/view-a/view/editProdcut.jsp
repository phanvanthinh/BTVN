<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
   <head>
  
      <meta charset="ISO-8859-1">
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
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownBlog" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              Blog
            </a>
            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownBlog">
              <a class="dropdown-item" href="blog-home-1.html">Blog Home 1</a>
              <a class="dropdown-item" href="blog-home-2.html">Blog Home 2</a>
              <a class="dropdown-item" href="blog-post.html">Blog Post</a>
            </div>
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
            <a class="nav-link" href="homeAdmin">Hello Admin</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/JspPetShop/logout">Logout</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

		
	  <form action="/JspPetShop/editProduct" method="post">
	   <label>Dog Name : </label>
       <input type="text" name="dogName" value="${prodcut.dogName}"><br>
       <label>Gender : &nbsp;&nbsp;&nbsp;&nbsp;</label>
       <input type="text" name="gender" value="${prodcut.gender}"><br>
       <label>Age : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
       <input type="text" name="age" value="${prodcut.age}"><br>
       <label>Health :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </label>
       <input type="text" name="health" value="${prodcut.health}"><br>
       <label>Price :&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
       <input type="text" name="price" value="${prodcut.price}"><br>
       <label>Status : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
       <input type="text" name="status" value="${prodcut.status}"><br>
       <label>Avatar :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </label>
       <input type="text" name="avatar" value="${prodcut.avatar}">		<br><br>	
       <label>&nbsp; </label>		
       <input type="hidden" name="id" value="${prodcut.id}" />		   
	   <input type="submit" value="Edit"> 
	  </form>
	<jsp:include page="footer.jsp" />
   </body>
 
</html>