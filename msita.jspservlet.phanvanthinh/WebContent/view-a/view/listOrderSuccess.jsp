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
  <div class="container">
   <h1>List Order Success</h1>
    <form>
		       <table border="1" style="text-align:center" >
				      <tr> 
					       <th>Id</th>
					       <th>Custome Name</th>
					       <th>Address</th>
					       <th>Phone</th>
					       <th>Product_Id</th>
					       <th>Total</th>
					       <th>Status</th>
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
					       
				       </tr>
		       			</c:forEach>
		       </table>
       </form>
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