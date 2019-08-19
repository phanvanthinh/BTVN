<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
   <head>
    <script>  
		function validate(){  
		var num=document.myform.phoneNumber.value;  
		var name=document.myform.customeName.value; 
		var dc=document.myform.address.value; 
		 
		if (name==null || name=="" ){
			alert("Tên không được để trống");
			return false;
		}else if (dc==null || dc=="" ){
			alert("Địa chỉ không được để trống");
			return false;
		}else if (isNaN(phoneNumber)){  
		  document.getElementById("numLoc").innerHTML="Enter Numeric value only";  
		  return false;  
		}else{  
		  return true;  
		  }  
		}  
   </script>
   </head> 
<body>
    <jsp:include page="header.jsp" />
    <br>
    <c:url value="/imeg?fname=${product.avatar}" var="imgUrl">	 </c:url> 
     <div class="ii"> 
	    <form>
				<h4> Thông tin sản phẩm</h4>
				<table style="text-align: center" border="1"> 
				<tr>
				    
				    <th>Mã sản phẩm</th>
				    <th>Tổng tiền</th>
				    <th></th>
				 </tr>
				
				 <tr> 
				    <td>${product.id}</td>
				    <td style="color: red">${product.price} VND</td>
				    <td><img height="120" width="150" src="${imgUrl}"/></td>
				 </tr>
				</table>
	   
	    </form>	
   </div>				
			
 <div class="ii1">
    
		 <form name="myform" action="/msita.jspservlet.phanvanthinh/order" method="post" onsubmit="return validate()">
		    <h4>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Thông tin giao hàng</h4>
		    <br>
			 <table style="text-align: center">
				 <tr> 
					 <td>Tên đầy đủ:</td>
					 <td><input type="text" name="customeName" /> </td>
				 </tr>
				  <tr> 
					 <td>Số điện thoại:</td>
					 <td><input type="number" name="phoneNumber" /><span id=numLoc></span> </td>
				 </tr>
				  <tr> 
					 <td>Địa chỉ :</td>
					 <td><input type="text" name="address" /></td>
					 <td></td>
					 <td><input type="hidden" name="productid" value="${product.id}" /></td>
					 <td></td>
					 <td><input type="hidden" name="total" value="${product.price}" /></td>
				 
				 </tr>
				 <tr> 
				   <td></td>
				   <td><input type="submit" value="Đặt hàng" /></td>
				 </tr>
			 
			 </table>
		  </form>
  </div>
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
  <br>
  <br>
  <br>
  <br>
  <br>
  
  <jsp:include page="footer.jsp" />
  
 
</body>
</html>