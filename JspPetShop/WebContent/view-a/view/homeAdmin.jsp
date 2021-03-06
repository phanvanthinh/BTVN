<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
   <head>
  
      <meta charset="utf-8">
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
            <a class="nav-link" href="listOrder">OrDer</a>
          </li>
          
          <li class="nav-item">
            <a class="nav-link" href="#">Hello Admin</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/JspPetShop/logout">Logout</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
			 
	<br>


	
	
	   
     <div class="container">
    <a href="/JspPetShop/addProduct" > ADD PRODUCT </a> 

    <div class="row">

  
 

      <div class="col-lg-12">


       
       
        <div class="row">
        
   
         <c:forEach items="${listproduct}" var="product">
	     <c:url value="/imeg?fname=${product.avatar}" var="imgUrl">	 </c:url>    
          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
            
              <img class="card-img-top" height="300"  src="${imgUrl}" alt="">
              <div class="card-body">
              <h6>Name: ${product.dogName}</h6>
              <h6>Gender: ${product.gender}</h6>
              <h6>Age: ${product.age}</h6>
              <h6>Health: ${product.health}</h6>
              <h6 style="color: red">Price: ${product.price}</h6>
              <h6>Status: ${product.status}</h6>
              
               <a href="editProduct?id=${product.id}">Edit</a> 
               <a href="deleteProduct?id=${product.id}">Delete</a>
               
               
                
              </div>
              <div class="card-footer">
                 <h4 class="card-title"  style="text-align: center">
                  <a href="#">Item One</a>
                </h4>
              </div>
            </div>
          </div>
            </c:forEach>
        
	  </div>
	  </div>
	  </div>
	  </div>
	  
	<jsp:include page="footer.jsp" />
   </body>
 
</html>