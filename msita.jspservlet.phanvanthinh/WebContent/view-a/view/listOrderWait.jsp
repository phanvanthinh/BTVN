   <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
      
</head>
<body>
   <jsp:include page="headerAdmin.jsp" />
  <div class="container"> 
   <br>
  
		  <h1>List Order</h1>
		    <form >
		       <table border="1" style="text-align:center" >
				      <tr> 
						       <th>Id</th>
						       <th>Custome Name</th>
						       <th>Address</th>
						       <th>Phone</th>
						       <th>Product_Id</th>
						       <th>Total</th>
						       <th>Status</th>
						       <th>Action</th>
						       <th>Cancel</th>
				       </tr>
		       <c:forEach items="${listOrder}" var="list">
		      
				       <tr>
				               
						       <td>${list.id}</td>
						       <td>${list.customerName}</td>
						       <td>${list.address}</td>
						       <td>${list.phoneNumber}</td>
						       <td>${list.productId}</td>
						       <td style="color: red">${list.total} VND</td>
						       <td>${list.status}</td> 
				              <!--  <input type="hidden" name="orderId" value=" ${list.id}" />
							        <input type="hidden" name="ProductId" value=" ${list.productId}" />  -->
						        
						       <td>
								     <a href="/msita.jspservlet.phanvanthinh/setStatusOrderAndProduct?id=${list.id}&productId=${list.productId}">Accept</a>
						       </td>
						       <td>
							         <a href="/msita.jspservlet.phanvanthinh/editStatusOrderIsCancel?id=${list.id}&productId=${list.productId}">Cancel</a>
						       </td>
				       </tr>
		       </c:forEach>  
		      
		       </table>
       </form>
 <!--       <form action="/JspPetShop/editStatusOrderIsCancel"> 
			         <input type="text" name="orderId" value="${list.id}" />
			         <button type="submit">Cancel</button>
		         </form>
 		       -->  
       <br>
       <br>
       <br>
       <br>
       <br>
       <br>
       <br>
       <br>
       <br>
       <br>
       <br>
       <br>
   </div>       
       <jsp:include page="footer.jsp" />
</body>
</html>