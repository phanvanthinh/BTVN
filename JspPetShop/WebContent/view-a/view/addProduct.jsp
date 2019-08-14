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
           <input type="text" name="dogName" /> <br>
           <label>Gender &nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;</label>
           <input type="text" name="gender" />  <br>
           <label>Age :&nb&nbsp;&nbsp;&nbsp;</label>
           <input type="text" name="age" />      <br>
           <label>Health :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
           <input type="text" name="health" />   <br>
           <label>Price :&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label> 
           <input type="text" name="price" />    <br>
           <label>Status :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
           <input type="text" name="status" />    <br>
           <label>Avatar :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
           <input type ="text" name="avatar" />    <br>
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type ="submit" value ="ADD"/>
       </form>
       
       
       <jsp:include page="footer.jsp" />
  
</body>
</html>