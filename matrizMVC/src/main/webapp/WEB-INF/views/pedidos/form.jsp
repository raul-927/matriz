<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

	<sf:form id ="frmCAT" 
		method ="POST" 
		
		modelAttribute ="usuarios" >
		 <fieldset style="width:700px;">
		 	<legend>&nbsp;ALTA DE PEDIDOS&nbsp;</legend>
	        <br />
		 	<sf:label path="usrId" for ="usrId"> Codigo</sf:label>
		 	<sf:input path="usrId" size ="10" id="codCAT"/>
		 	<sf:errors path ="usrId" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="usrCat.catUsrId" for ="usrCat.catUsrId">Calle</sf:label>
		 	<sf:select path="usrCat.catUsrId" size ="1" id="descCAT">
		 		
		 		<sf:options items="${catUsr}" itemLabel="catUsrNom" itemValue="catUsrId" />
		 		
		 	</sf:select>
		 	<sf:errors path ="usrCat.catUsrId" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="dni" for ="dni">Numero de Cedula</sf:label>
		 	<sf:input path="dni" size ="20" id="descCAT"/>
		 	<sf:errors path ="dni" cssClass ="error"/>
		 
		 	
		 	<br /> <br/>
		 	<sf:label path="usrNom" for ="usrNom">Nombre</sf:label>
		 	<sf:input path="usrNom" size ="20" id="descCAT"/>
		 	<sf:errors path ="usrNom" cssClass ="error"/>
		 	
		 	
		 	<br /> <br />
		 	<sf:label path="usrAp" for ="usrAp">Apellido</sf:label>
		 	<sf:input path="usrAp" size ="20" id="descCAT"/>
		 	<sf:errors path ="usrAp" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="usrTel" for ="usrTel">Telefono</sf:label>
		 	<sf:input path="usrTel" size ="20" id="descCAT"/>
		 	<sf:errors path ="usrTel" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="usrCel" for ="usrCel">Celular</sf:label>
		 	<sf:input path="usrCel" size ="20" id="descCAT"/>
		 	<sf:errors path ="usrCel" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="usrMail" for ="usrMail">Mail</sf:label>
		 	<sf:input path="usrMail" size ="20" id="descCAT"/>
		 	<sf:errors path ="usrMail" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="usrNic" for ="usrNic">Nic</sf:label>
		 	<sf:input path="usrNic" size ="20" id="descCAT"/>
		 	<sf:errors path ="usrNic" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="usrPass" for ="usrPass">Contraseña</sf:label>
		 	<sf:password path="usrPass" size ="20" id="descCAT"/>
		 	<sf:errors path ="usrPass" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="" for ="usrPass">Repite Contraseña</sf:label>
		 	<sf:password path="" size ="20" id="descCAT"/>
		 	<sf:errors path ="" cssClass ="error"/>
		 	
		 	<br /> <br />
		 </fieldset>
		 <div class="botonForm">
		 	<input type ="submit" value ="Aceptar"/>
		 	<input type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
