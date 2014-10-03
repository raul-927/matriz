<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="TituloTabla">
	<tr class="labelForm">
		<td>Codigo</td>
		<td>Nombre</td>
		<td>categoria</td>
		<td>Precio</td>
	</tr>
	<% int count = 2;%>
	<c:forEach var="prod" items="${prod}">
	<%
		if(count % 2 == 0) 
		{ %>
			<tr class ="filaImpar">
	  <%}
		else 
		{%>
			<tr class ="filaPar">
	  <%} %>
		<td>${prod.prdId}</td>
		<td>${prod.prdNom}</td>
		<td>${prod.prdCat.nombre}</td>
		<td>${prod.prdPrec}</td>
		</tr>
		<%count ++; %>
	</c:forEach>	
</table>
