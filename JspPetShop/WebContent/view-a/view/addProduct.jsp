<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
       <br>
       <form action ="/JspPetShop/addProduct" method = "post" >
           <label>Dog Name:</label>
           <input type = "text" name="dogName" >
           <label>Gender :</label>
           <input type = "text" name="gender" >
           <label>Age :</label>
           <input type = "text" name="age" >
           <label>Health :</label>
           <input type = "text" name="health" >
           <label>Price :</label>
           <input type = "text" name="price" >
           <label>Status :</label>
           <input type = "text" name="status" >
           <label>Avatar :</label>
           <input type = "text" name="avatar" > 
           <input type = "submit" value = "ADD">
       </form>
       
       
       <jsp:include page="footer.jsp" />
  
</body>
</html>