<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="TituloTabla">
	<tr class="labelForm">
		<td>Codigo</td>
		<td>Categoria</td>
		<td>DNI</td>
		<td>Nombre</td>
		<td>Apellido</td>
		<td>Telefono</td>
		<td>Celular</td>
		<td>Mail</td>
		<td>Nic</td>
		<td>Contraseña</td>
	</tr>
	<% int count = 2;%>
	<c:forEach var="usuar" items="${user}">
	<%
		if(count % 2 == 0) 
		{ %>
			<tr class ="filaImpar">
	  <%}
		else 
		{%>
			<tr class ="filaPar">
	  <%} %>
		<td>${usuar.usrId}</td>
		<td>${usuar.usrCat.catUsrNom}</td>
		<td>${usuar.dni}</td>
		<td>${usuar.usrNom}</td>
		<td>${usuar.usrAp}</td>
		<td>${usuar.usrTel}</td>
		<td>${usuar.usrCel}</td>
		<td>${usuar.usrMail}</td>
		<td>${usuar.usrNic}</td>
		<td>${usuar.usrPass}</td>
		</tr>
		<%count ++; %>
	</c:forEach>	
</table>
