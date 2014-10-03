<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

	<sf:form id ="frmCAT" 
		method ="POST" 
		modelAttribute ="calles" >
		 <fieldset style="width: 350px;">
		 	<legend>&nbsp;ALTA DE CALLES&nbsp;</legend>
	        <br />
	        
		 <sf:label path="calleId" for ="calleId"> Id de calle</sf:label>
		 	<sf:input path="calleId" size ="10" id="codCAT"/>
		 	<sf:errors path ="calleId" cssClass ="error"/>
		 	
		 	 <br /> <br />
		 	 
		 	<sf:label path="calleNom" for ="calleNom">Nombre de calle</sf:label>
		 	<sf:input path="calleNom" size ="30" id="descCAT"/>
		 	<sf:errors path ="calleNom" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="tipoCalle.idTpoCalle" for ="tipoCalle.idTpoCalle">Tipo de calle</sf:label>
		 	<sf:select path="tipoCalle.idTpoCalle" size ="1" id="descCAT">
		 		
		 		<sf:options items="${tpc}" itemLabel="descTpoCalle" itemValue="idTpoCalle" />
		 		
		 	</sf:select>
		 	<sf:errors path ="tipoCalle.idTpoCalle" cssClass ="error"/>
		 	
		 	
		 	<br /> <br />
		 	
		 </fieldset>
		 <div class="botonForm">
		 	<input type ="submit" value ="Aceptar"/>
		 	<input type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
