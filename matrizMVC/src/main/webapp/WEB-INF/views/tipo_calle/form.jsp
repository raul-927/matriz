<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

	<sf:form id ="frmTipoCalle" 
		method ="POST" 
		modelAttribute ="tipoCalle" >
		 <fieldset style="width: 350px;">
		 	<legend>&nbsp;TIPOS DE CALLES&nbsp;</legend>
	        <br />
		 	<sf:label path="idTpoCalle" for ="idTpoCalle"> Id de Tipo de calle</sf:label>
		 	<sf:input path="idTpoCalle" size ="10" id="codTpoCalle"/>
		 	<sf:errors path ="idTpoCalle" cssClass ="error"/>
		 	
		 	 <br /> <br />
		 	<sf:label path="descTpoCalle" for ="descTpoCalle">Nombre de tipo de calle </sf:label>
		 	<sf:input path="descTpoCalle" size ="20" id="descTpoCalle"/>
		 	<sf:errors path ="descTpoCalle" cssClass ="error"/>
		 	<br /> <br />
		 	
		 </fieldset>
		 <div class="botonForm">
		 	<input type ="submit" value ="Aceptar"/>
		 	<input type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
