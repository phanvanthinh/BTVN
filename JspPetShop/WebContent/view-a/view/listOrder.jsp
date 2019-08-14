<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
      <meta charset="ISO-8859-1">
      <meta charset="utf-8">
      <title>Order</title>
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
            <a class="nav-link" href="homeAdmin">Hello Admin</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/JspPetShop/logout">Logout</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  <from style="text-align:center">
  <h1>List Order</h1>
       <table border="1" style="text-align:center" >
      <tr> 
       <th>Id</th>
       <th>Custome Name</th>
       <th>Age</th>
       <th>Address</th>
       <th>Phone</th>
       <th>Status</th>
       </tr>
         <c:forEach items="${listOrder}"  var="list">
       <tr>
       <td>${list.id}</td>
       <td>${list.customerName}</td>
       <td>${list.age}</td>
       <td>${list.address}</td>
       <td>${list.phoneNumber}</td>
       <td>${list.status}</td>
       </tr>
       </c:forEach>
       </table>
       </from>
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