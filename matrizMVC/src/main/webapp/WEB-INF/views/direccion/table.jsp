<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="TituloTabla">
	<tr class="labelForm">
		<td>Codigo</td>
		<td>Nombre Calle</td>
		<td>Tipo</td>
		<td>Nro de puerta</td>
		<td>Casa/Ap</td>
		<td>Nro Ap</td>
		<td>Entre Calle 1</td>
		<td>Tipo</td>
		<td>Entre Calle 2</td>
		<td>Tipo</td>
	</tr>
	<% int count = 2;%>
	<c:forEach var="direc" items="${dir}">
	<%
		if(count % 2 == 0) 
		{ %>
			<tr class ="filaImpar">
	  <%}
		else 
		{%>
			<tr class ="filaPar">
	  <%} %>
		<td>${direc.dirId}</td>
		<td>${direc.dirCalle.calleNom}</td>
		<td>${direc.dirCalle.tipoCalle.descTpoCalle}</td>
		<td>${direc.dirNum}</td>
		<td>${direc.dirAp}</td>
		<td>${direc.dirNumAp}</td>
		<td>${direc.dirCalle1.calleNom}</td>
		<td>${direc.dirCalle1.tipoCalle.descTpoCalle}</td>
		<td>${direc.dirCalle2.calleNom}</td>
		<td>${direc.dirCalle2.tipoCalle.descTpoCalle}</td>
		</tr>
		<%count ++; %>
	</c:forEach>	
</table>
