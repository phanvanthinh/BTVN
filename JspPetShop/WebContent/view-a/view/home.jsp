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
     
    <jsp:include page="header.jsp" />
			 <h1>Sản phẩm</h1>
	     
	   
     <div class="container">
    

    <div class="row">

  
 

      <div class="col-lg-12">


       
       
        <div class="row">
        
   
         <c:forEach items="${product}" var="product">
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
        <!-- /.row -->

      </div>
      <!-- /.col-lg-9 -->

    </div>
    <!-- /.row -->

  </div>
	      
	     
	<jsp:include page="footer.jsp" />
   </body>
 
</html>