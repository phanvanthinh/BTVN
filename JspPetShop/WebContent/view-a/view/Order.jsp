<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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


<c:url value="/imeg?fname=${product.avatar}" var="imgUrl">	 </c:url>    
			<img height="70" width="90" src="${imgUrl}"/> 
			
			
 
 <form action="/JspPetShop/order" method="post" style="text-align: center">
  <label>Custome_Name:</label>
  <input type="text" name="customeName" /> <br>
  <label>Gender &nbsp;:&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
  <input type="text" name="gender" /> <br>
  <label>Age :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
  <input type="text" name="age" /> <br>
  <label>Phone: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
  <input type="text" name="phoneNumber" /> <br>
  <label>Address : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
  <input type="text" name="address" /><br>
  <label>Status :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
  <input type="text" name="status" /> <br>
  <br>
  <br>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Order" />
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>

  
  <jsp:include page="footer.jsp" />
  
 </form>
</body>
</html>