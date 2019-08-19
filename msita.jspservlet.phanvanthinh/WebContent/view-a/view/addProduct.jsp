<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
      
</head>
<body>
       <jsp:include page="header.jsp" />
       <br>
       <form action ="/msita.jspservlet.phanvanthinh/addProduct" method = "post" style="text-align: center">
        <table style="text-align: center">
		        <tr>
			        <td>Dog Breed:</td>
			        <td><input type="text" name="dogBreed" /></td>
		        </tr>
		        <tr>
			        <td>Gender:</td>
			         <td><input type="text" name="gender" /></td>
		        </tr>
		        <tr>
			        <td>Age:</td>
			         <td><input type="text" name="age" /></td>
		        </tr>
		        <tr>
			        <td>Price:</td>
			       <td><input type="number" name="price" /></td>
		        </tr>
		        <tr>
			        <td>Avatar:</td>
			        <td><input type ="text" name="avatar" /></td>
		        </tr>
       
		        <tr>
				     <td></td><td style="text-align: center"><input type ="submit" value ="ADD"/></td>
		        </tr>
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
       <br>
       <br>
       
       <jsp:include page="footer.jsp" />
  
</body>
</html>