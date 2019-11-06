 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
   <head>
   </head>
   <body>
	<jsp:include page="headerAdmin.jsp" />		 
	<br>
	<br>
	<br>
	
     <div class="container">
		 <a href="${pageContext.request.contextPath}/product/create" > ADD PRODUCT </a> 
		    <div class="row">
			      <div class="col-lg-12"> 
				        <div class="row">
				         <c:forEach items="${product}" var="product">
					    
				          <div class="col-lg-3 col-md-6 mb-4">
					            <div class="card h-100">
					              <img class="card-img-top" height="200px"  src="D:\IMEG\_${product.avatar}" alt="">
					              <div class="card-body">
						               <h6>Giống chó: ${product.dogBreed}</h6>
						               <h6>Giới tính: ${product.gender}</h6>
						               <h6>Tuổi: ${product.age}</h6>
						               <h6 style="color: red">Giá: ${product.price} VND</h6>
						               <h6>Tình trạng: ${product.status}</h6>
						               <hr>
						               <a href="update?id=${product.id}">Edit</a> 
						               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						               <a href="delete?id=${product.id}">Delete</a>
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