
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
   <head>
  
      
   </head>
   <body>
    
	    <jsp:include page="header.jsp" />
	    <br>		 
		 <form action ="/msita.jspservlet.phanvanthinh/seachProduct" > 
			  <table> 
				    <tr> 
					      <td> 
							      <h4>Nhập giống chó bạn muốn tìm :</h4>
					      </td> 
					      <td>
							      <input type ="text" name = "dogBreed" />
							      <input type ="submit" value ="Search"/>
					      </td>
				    </tr> 
			  </table>   
		 </form>   
		  
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
											              <h6>Mã sản phẩm: ${product.id}</h6>
											              <h6>Giống chó: ${product.dogBreed}</h6>
											              <h6>Giới tính: ${product.gender}</h6>
											              <h6>Tuổi: ${product.age}</h6>
											              <h6 style="color: red">Giá: ${product.price} VND</h6>
										                  <hr>
										                 <h5 style="text-align: center"><a href="order?id=${product.id}" >Đặt hàng</a></h5>
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