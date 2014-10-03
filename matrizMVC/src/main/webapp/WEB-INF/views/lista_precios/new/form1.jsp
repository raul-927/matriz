<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
<link rel="stylesheet" href="/resources/demos/style.css" />
<script>
	$(function() {
		$( "#datepicker").datepicker();
	});

	$(function() {
		$( "#datepickers").datepicker();
	});
</script>


<sf:form id ="frmCAT" 
		method ="POST" 
		modelAttribute ="auxPrecios">
		 <fieldset style="width:400px;">
		 	<legend>&nbsp;INGRESA FECHAS DE INICIO Y FINAL&nbsp;</legend>
	        <br/>
	        <fmt:formatDate pattern="dd/MM/yyyy" value="${idAuxPrecios.auxPrecFechIni}"/>
		 	<sf:label size ="100" path="idAuxPrecios.auxPrecFechIni" for ="idAuxPrecios.auxPrecFechIni">FECHA INICIO</sf:label> 
		 	<sf:input type ="text" path="idAuxPrecios.auxPrecFechIni" id="datepicker"/>
		 	<sf:errors path ="idAuxPrecios.auxPrecFechIni" cssClass ="error"/>
		 	
		 	<br/><br/>
		 	<fmt:formatDate pattern="dd/MM/yyyy" value="${idAuxPrecios.auxPrecFechFin}"/>
			<sf:label size ="100" path="idAuxPrecios.auxPrecFechFin" for ="idAuxPrecios.auxPrecFechFin">FECHA FINAL  </sf:label> 
		 	<sf:input type ="text" path="idAuxPrecios.auxPrecFechFin" id="datepickers" />
		 	<sf:errors path ="idAuxPrecios.auxPrecFechFin" cssClass ="error"/>
		 	<br /> <br />
		 </fieldset>
		 <sf:button type ="submit">prueba</sf:button>
		
</sf:form>