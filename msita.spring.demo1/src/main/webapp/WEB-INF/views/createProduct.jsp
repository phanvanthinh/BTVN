<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
      
</head>
<body>
       <jsp:include page="header.jsp" />
       <br>
       <form:form method="POST" action="${pageContext.request.contextPath}/product/create" modelAttribute="product" style="text-align: center">
        <table style="text-align: center">
		        <tr>
			        <td>Dog Breed:</td>
			        <td><form:input type="text" path="dogBreed" /></td>
		        </tr>
		        <tr>
			        <td>Gender:</td>
			         <td><form:input type="text" path="gender" /></td>
		        </tr>
		        <tr>
			        <td>Age:</td>
			         <td><form:input type="text" path="age" /></td>
		        </tr>
		        <tr>
			        <td>Price:</td>
			       <td><form:input type="number" path="price" /></td>
		        </tr>
		        <tr>
			        <td>Avatar:</td>
			        <td><form:input type ="text" path="avatar" /></td>
		        </tr>
		        <tr>
			        <td>Status:</td>
			        <td><form:input type ="text" path="status" /></td>
		        </tr>
       
		        <tr>
				     <td></td><td style="text-align: center"><input type ="submit" value ="ADD"/></td>
		        </tr>
        </table>
           
       </form:form>
       
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