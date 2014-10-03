<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

	<sf:form id ="frmCAT" 
		method ="POST" 
		
		modelAttribute ="productos" >
		 <fieldset style="width:700px;">
		 	<legend>&nbsp;ALTA DE PRODUCTOS&nbsp;</legend>
	        <br />
		 	<sf:label path="prdId" for ="prdId"> Codigo</sf:label>
		 	<sf:input path="prdId" size ="10" id="codCAT"/>
		 	<sf:errors path ="prdId" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="prdNom" for ="prdNom">Nombre</sf:label>
		 	<sf:input path="prdNom" size ="20" id="descCAT"/>
		 	<sf:errors path ="prdNom" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="prdCat.id" for ="prdCat.id">Categoria</sf:label>
		 	<sf:select path="prdCat.id" size ="1" id="descCAT">
		 		
		 		<sf:options items="${cat}" itemLabel="nombre" itemValue="id" />
		 		
		 	</sf:select>
		 	<sf:errors path ="prdCat.id" cssClass ="error"/>
		 	
		 	<br /> <br />
		 </fieldset>
		 <div class="botonForm">
		 	<input type ="submit" value ="Aceptar"/>
		 	<input type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
