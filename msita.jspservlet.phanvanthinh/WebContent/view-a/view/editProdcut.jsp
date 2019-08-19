<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
   <head>
  
     
   </head>
   <body>
     <jsp:include page="headerAdmin.jsp" />	

		
	  <form action="/msita.jspservlet.phanvanthinh/editProduct" method="post" style="text-align: center">
	    <table> 
	      <tr>
	        <td>Dog Breed:</td>
	        <td><input type="text" name="dogBreed" value="${prodcut.dogBreed}" /></td>
	      </tr> 
	       <tr>
	        <td>Gender:</td>
	        <td><input type="text" name="gender" value="${prodcut.gender}" /></td>
	      </tr> 
	       <tr>
	        <td>Age:</td>
	        <td><input type="text" name="age" value="${prodcut.age}" /></td>
	      </tr> 
	       <tr>
	        <td>Price:</td>
	        <td><input type="number" name="price" value="${prodcut.price}" /></td>
	      </tr> 
	       <tr>
	        <td>Status:</td>
	        <td><select name="status" style="width: 183px">
				  <option value="Available">Available</option>
				  <option value="Sold" selected>Sold</option>
				  <option value="Error" selected>Error</option>
				</select>
		    </td>
	        
	         <br>
	      </tr> 
	       <tr>
	        <td>Avatar:</td>
	        <td><input type="text" name="avatar" value="${prodcut.avatar}" /></td>
	      </tr> 
	      <tr>
	        <td></td>
	        <td><input type="hidden" name="id" value="${prodcut.id}" /></td>
	      </tr>
	      <tr>
	        <td></td>
	        <td style="text-align: center"><input type="submit" value="Edit" style="width: 80px"/></td>
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
	  
	<jsp:include page="footer.jsp" />
   </body>
 
</html>