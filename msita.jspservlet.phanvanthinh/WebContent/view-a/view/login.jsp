  <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html>
<head>
   <meta charset="utf-8"> 
    	<script>  
			function validateform(){  
			var name=document.myform.userName.value;  
			var password=document.myform.password.value;  
			  
			if (name=="thinh" && password=="123"){  
			  return true; 
			}else {  
			  alert("Sai tên đăng nhập hoặc mật khẩu");  
			  return false;  
			  }  
			}  
</script>  
     
</head>
<body>
      <jsp:include page="header.jsp" />
      
      <form name="myform" action="/msita.jspservlet.phanvanthinh/login" method ="post" style="text-align: center" onsubmit="return validateform()">

	 <h2>Please Login</h2> 
	 
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