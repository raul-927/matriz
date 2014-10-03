<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
	
	<sf:form id ="frmCAT" 
		method ="POST" 
		modelAttribute ="auxPrecios">
		 <fieldset style="width:700px;">
		 	<legend>&nbsp;INGRESA FECHAS DE INICIO Y FINAL&nbsp;</legend>
	        <br/>
	        <fmt:formatDate pattern="dd/MM/yyyy" value="${idAuxPrecios.auxPrecFechIni}"/>
		 	<sf:label size ="100" path="idAuxPrecios.auxPrecFechIni" for ="idAuxPrecios.auxPrecFechIni">FECHA INICIO</sf:label> 
		 	<sf:input type ="" path="idAuxPrecios.auxPrecFechIni" id="descCAT"/>
		 	<sf:errors path ="idAuxPrecios.auxPrecFechIni" cssClass ="error"/>
		 	
		 	<br/><br/>
		 	<fmt:formatDate pattern="dd/MM/yyyy" value="${idAuxPrecios.auxPrecFechFin}"/>
			<sf:label path="idAuxPrecios.auxPrecFechFin" for ="idAuxPrecios.auxPrecFechFin">FECHA_FINAL</sf:label> 
		 	<sf:input path="idAuxPrecios.auxPrecFechFin" id="descCAT" />
		 	<sf:errors path ="idAuxPrecios.auxPrecFechFin" cssClass ="error"/>
		 	<br /> <br />
		 
			 <sf:form id ="frmCAT" 
				method ="POST" 
				modelAttribute ="listaPrecios">
			 	
			 		<legend>&nbsp;ALTA DE LISTA DE PRECIOS&nbsp;</legend>
		        
			 	<sf:label path="idListaPrecios.idProducto" for ="idListaPrecios.idProducto">Productos</sf:label> <br/>
			 	<sf:select path="idListaPrecios.idProducto" id="descCAT" items ="${productos}" itemLabel="prdNom" itemValue="prdId" multiple="false"/>
			 	<sf:errors path ="idListaPrecios.idProducto" cssClass ="error"/>
			 	
			 	<br/>
			 	<sf:label path="listPrecMonto" for ="listPrecMonto">Importe</sf:label> <br/>
			 	<sf:input path="listPrecMonto" size ="20" id="descCAT"/>
			 	<sf:errors path ="listPrecMonto" cssClass ="error"/>
			 	<br /> <br />
			 
		 </sf:form>
	 </fieldset>
		 <div class="botonForm">
		 	<input type ="submit" value ="Aceptar"/>
		 	<input type ="reset" value ="Cancelar"/>
		 </div>
		 
	 </sf:form>
	
