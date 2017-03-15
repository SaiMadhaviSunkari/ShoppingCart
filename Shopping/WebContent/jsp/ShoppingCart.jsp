<%@ page language="java" import="java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="org.myProject.shoppingOnline.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p><b>shopping cart</b></p>
<form action="Target.jsp" method="get">
<table border=1>
<tbody>
<tr>
			<th>Item no.</th>
			<th>Name</th>
			<th>Quantity</th>
			<th>Price per unit</th>
</tr>
 
    
	<%  	Collection collection = (Collection)request.getAttribute("items");
	  	for(Iterator iter=collection.iterator();iter.hasNext();)
        {
        	shoppingCartItem shoppingcart=(shoppingCartItem)iter.next();
        	out.println("<tr>");
        	out.println("<td>"+shoppingcart.getItemno()+"</td>");
        	out.println("<td>"+shoppingcart.getItemName()+"</td>");
        	out.println("<td><input type=\"text\" name=\"quantity\" id=\"quantity \"></td>");
        	out.println("<td>"+shoppingcart.getPricePerUnit()+"</td>");
        	out.println("</tr>");
        	out.println("<script type='text/javascript' shoppingcart.setQuantity(Integer.parseInt(document.getElementById('quantity').value));</script>");
        	//i am not able to access text box value
       }
	  	%>
	  	<tr>
<td><input type="submit" value="submit"/></td>
</tr>

</tbody>
</table>
</form>
</body>
</html>