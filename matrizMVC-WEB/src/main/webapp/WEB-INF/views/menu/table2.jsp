<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<br>			
<table class ="tablaProd">
	<tr >
		<c:forEach var="cat" items="${categ}">
			<td class='TituloTablaPedido2'><span class='TituloTablaPedido2'>${cat.nombre}</span></td>
	</tr class ="tablaProd">	
			<c:set var ="aux" value ="${cat.id}"/>
			<c:forEach var ="menn" items ="${result}">
				<c:if test ="${menn[1] == aux}">
					<tr class ="TituloTablaPedido">
						<td class ="TituloTablaPedido"><span class ="ItemTabla"><a href=''>${menn[0]}</a> </span> <span class ="precio"><span>$</span><a href=''>${menn[2]}</a> </span></td>
				</c:if>
			</c:forEach>
					</tr>
						
		</c:forEach>
</table>
<br>			