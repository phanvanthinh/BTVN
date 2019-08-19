<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    
</head>
<body>
      <jsp:include page="header.jsp" />
      
      <form action="/msita.jspservlet.phanvanthinh/login" method ="post" style="text-align: center">
      
     <h3>Login failed</h3>
	 <h3>Please login again</h3> 
	 
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