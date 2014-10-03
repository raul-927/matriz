<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="TituloTabla">
	<tr class="labelForm">
		<td>Nombre de Lista</td>
		<td>Codigo de Lista</td>
		<td>Codigo Producto</td>
		<td>Nombre Producto</td>
		<td>Precio</td>
		
		
	</tr>
	<% int count = 2;%>
	<c:forEach var="prod" items="${showNewLP}">
	<%
		if(count % 2 == 0) 
		{ %>
			<tr class ="filaImpar">
	  <%}
		else 
		{%>
			<tr class ="filaPar">
	  <%} %>
		<td>${prod[0]}</td>
		<td>${prod[1]}</td>
		<td>${prod[2]}</td>
		<td>${prod[3]}</td>
		<td>${prod[4]}</td>
		
		</tr>
		<%count ++; %>
	</c:forEach>	
</table>
