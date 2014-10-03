<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

	<sf:form id ="frmCAT" 
		method ="POST" 
		
		modelAttribute ="direccion" >
		 <fieldset style="width:700px;">
		 	<legend>&nbsp;ALTA DE DUSUARIO&nbsp;</legend>
	        <br />
		 	<sf:label path="dirId" for ="dirId"> Codigo</sf:label>
		 	<sf:input path="dirId" size ="10" id="codCAT"/>
		 	<sf:errors path ="dirId" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="dirCalle.calleId" for ="dirCalle.calleId">Calle</sf:label>
		 	<sf:select path="dirCalle.calleId" size ="1" id="descCAT">
		 		
		 		<sf:options items="${calles}" itemLabel="calleNom" itemValue="calleId" />
		 		
		 	</sf:select>
		 	<sf:errors path ="dirCalle.calleId" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="dirNum" for ="dirNum">Numero de direccion</sf:label>
		 	<sf:input path="dirNum" size ="20" id="descCAT"/>
		 	<sf:errors path ="dirNum" cssClass ="error"/>
		 	<br /> <br />
		 	
		 	<sf:label path="dirAp" for ="dirAp">Apartamento o casa</sf:label>
		 	<sf:select path="dirAp" size ="1" id="descCAT">
		 		<sf:option value ="Apartamento"/>
		 		<sf:option value="Casa"/>
		 	</sf:select>
		 	<sf:errors path ="dirAp" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="dirNumAp" for ="dirNumAp">Numero de Apartamento</sf:label>
		 	<sf:input path="dirNumAp" size ="20" id="descCAT"/>
		 	<sf:errors path ="dirNumAp" cssClass ="error"/>
		 	
		 	
		 	<br /> <br />
		 	<sf:label path="dirCalle1.calleId" for ="dirCalle1.calleId">Calle 1</sf:label>
		 	<sf:select path="dirCalle1.calleId" size ="1" id="descCAT">
		 		
		 		<sf:options items="${calles}" itemLabel="calleNom" itemValue="calleId" />
		 		
		 	</sf:select>
		 	<sf:errors path ="dirCalle1.calleId" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="dirCalle2.calleId" for ="dirCalle2.calleId">Calle 2</sf:label>
		 	<sf:select path="dirCalle2.calleId" size ="1" id="descCAT">
		 		
		 		<sf:options items="${calles}" itemLabel="calleNom" itemValue="calleId" />
		 		
		 	</sf:select>
		 	<sf:errors path ="dirCalle2.calleId" cssClass ="error"/>
		 	
		 	<br /> <br />
		 </fieldset>
		 <div class="botonForm">
		 	<input type ="submit" value ="Aceptar"/>
		 	<input type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
