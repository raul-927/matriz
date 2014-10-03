<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
	
	
		 
		 	<legend>&nbsp;INGRESAR PRODUCTOS&nbsp;</legend>
		 <fieldset style="width:400;">
			 <sf:form id ="frmCAT" 
				method ="POST" 
				modelAttribute ="listaPrecios">
				<fieldset style="width:400;">
				 	<sf:label path = "idListaPrecios.idLista" for="idListaPrecios.idLista">Codigo de lista </sf:label> <br/>
				 	<sf:input path="idListaPrecios.idLista" size = "20" id = "idListaPrecios.idLista" /> <br />
				 	<sf:errors path="idListaPrecios.idLista" cssClass ="error"/>
				 	
				 	<sf:label path = "listPrecDesc" for="listPrecDesc">Nombre de Lista</sf:label> <br/>
				 	<sf:input path="listPrecDesc" size = "20" id = "listPrecDesc" /> <br />
				 	<sf:errors path="listPrecDesc" cssClass ="error"/>
			 	</fieldset>
			 		
			 	<sf:label path="idListaPrecios.idProducto" for ="idListaPrecios.idProducto">Productos</sf:label> <br/>
			 	<sf:select path="idListaPrecios.idProducto" id="descCAT" items ="${productos}" itemLabel="prdNom" itemValue="prdId" multiple="false"/>
			 	<sf:errors path ="idListaPrecios.idProducto" cssClass ="error"/>
			 	
			 	<br/>
			 	<sf:label path="listPrecMonto" for ="listPrecMonto">Importe</sf:label> <br/>
			 	<sf:input path="listPrecMonto" size ="20" id="descCAT"/>
			 	<sf:errors path ="listPrecMonto" cssClass ="error"/>
			 	<br /> <br />
			 	
			 	 <div class="botonForm">
		 			<input type ="submit" value ="Aceptar"/>
		 			<input type ="reset" value ="Cancelar"/>
		 		</div>
		 </sf:form>
	 </fieldset>

		
		 
	
	
