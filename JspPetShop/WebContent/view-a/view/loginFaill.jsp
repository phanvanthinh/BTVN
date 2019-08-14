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
      
      <form action="/JspPetShop/login" method ="post" style="text-align: center">
      
     <h2>Login failed</h2>
	 <h2>Please Login Again</h2> 
	 
         <%= "Username:" %> 
         <input type="text" name="userName"/>
         <br>
   
         <%="Password :" %> 
		 <input type="password"  name="password"/>
         <br>
         <input type="submit" value="login"  style="text-align: center"/>
      

   
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
     <br>
     <br>
     <br>
     <br>
     <br>
     
     
      <jsp:include page="footer.jsp" />
</body>
</html>