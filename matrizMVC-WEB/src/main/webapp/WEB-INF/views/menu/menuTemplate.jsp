<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<!DOCTYPE html>
  <head>
     <t:insertAttribute name ="heads"/>
  </head>
  <body>
  <aside id ="Contenedor">
		<header id = "Cabecera">
			<img  id ="Imagen" src="<s:url value="/resources" />/Images/LogoMatriz.png"/>
		
			<a href='' class ="login">Login&nbsp;</a> <span class ="login"> |&nbsp; </span><a href='' class ="login">Registrarse&nbsp;</a>
			<t:insertAttribute name ="titulo"/>
		</header>
	    
	    <aside id ="Izquierda">
	    	
	    </aside>
	    
	   	<aside id ="Contenido">
	    
		    <aside id= "Principal">
		    
		    	<aside class='Centro'>
		    		<t:insertAttribute name ="table"/>
		    	</aside>
		    	
		    	<footer id= "Pie">
		        	<input type="button" value="Prueba">
			    	<span>fsdfljksdlkfjsdlkfjsdlfkjsdflkj</span><br/>
			    	<span>fsldkfjsdlfkjsdfsldkfjsdlfkjsdf</span>
		        </footer>
		        
		    </aside>
		    
	    </aside>
	    
    </aside>
  </body>

