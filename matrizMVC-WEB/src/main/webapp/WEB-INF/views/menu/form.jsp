<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

	<sf:form id ="Imagen2" 
		method ="POST" 
		modelAttribute ="usuarios" >
		 <fieldset style="width:700px;">
		 	<legend>&nbsp;Login&nbsp;</legend>
	        <br />
		 	<sf:label path="usrNic" for ="usrNic"> Usuario</sf:label>
		 	<sf:input path="usrNic" size ="10" id="usrNic"/>
		 	<sf:errors path ="usrNic" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="usrPass" for ="usrPass">Contraseña</sf:label>
		 	<sf:input path="usrPass" size ="20" id="usrPass"/>
		 	<sf:errors path ="usrPass" cssClass ="error"/>
		 	<br /> <br />
		 </fieldset>
		 <div class="botonForm">
		 	<input type ="submit" value ="Aceptar"/>
		 	<input type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
