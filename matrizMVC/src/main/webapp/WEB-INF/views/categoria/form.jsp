<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

	<sf:form id ="frmCAT" 
		method ="POST" 
		modelAttribute ="categoria" >
		 <fieldset style="width: 350px;">
		 	<legend>&nbsp;ALTA DE CATEGORIAS&nbsp;</legend>
	        <br />
		 	<sf:label path="id" for ="cat_id"> Id de categoria</sf:label>
		 	<sf:input path="id" size ="10" id="codCAT"/>
		 	<sf:errors path ="id" cssClass ="error"/>
		 	
		 	 <br /> <br />
		 	<sf:label path="nombre" for ="cat_nom">Nombre de categoria</sf:label>
		 	<sf:input path="nombre" size ="20" id="descCAT"/>
		 	<sf:errors path ="nombre" cssClass ="error"/>
		 	<br /> <br />
		 	
		 </fieldset>
		 <div class="botonForm">
		 	<input type ="submit" value ="Aceptar"/>
		 	<input type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
