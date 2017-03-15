<%@ page language="java" import="java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="org.myProject.shoppingOnline.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CheckOut</title>
</head>
<body>
<table border=1>
<tbody>
<tr>
			<th>Item no.</th>
			<th>Name</th>
			<th>Quantity</th>
			<th>Price per unit</th>
</tr>
 
     <%! Collection collection;
     String total=""; %>  
	<%  	collection = (Collection)request.getAttribute("items");
	  	for(Iterator iter=collection.iterator();iter.hasNext();)
        {
        	shoppingCartItem shoppingcart=(shoppingCartItem)iter.next();
        	out.println("<tr>");
        	out.println("<td>"+shoppingcart.getItemno()+"</td>");
        	out.println("<td>"+shoppingcart.getItemName()+"</td>");
        	out.println("<td>"+shoppingcart.getQuantity()+"</td>");
        	out.println("<td>"+shoppingcart.getPricePerUnit()+"</td>");
        	out.println("</tr>");
        	total=total+((shoppingcart.getQuantity())*(shoppingcart.getPricePerUnit()));
        	
        }
	  	%>	
	  	<tr>
<td>Total="+<%= total %>+"</td>
</tr>
	  	


</tbody>
</table>
</body>
</html>