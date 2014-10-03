<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

  <head>
    <title>Cerveceria Matriz</title>
    <link href="<s:url value="/resources" />/css/css2.css" rel="stylesheet" type="text/css" />
   <!--  <link href="<s:url value="/resources" />/css/AltaCategorias.css" rel="stylesheet" type="text/css" /> --> 
    <link rel="shortcut icon" href="<s:url value="/resources" />/ICO/FaviconMatriz3.ico" />
  </head>

  <body>
    <div id="PrincipalAltaCategorias">
    	<div id="Cabecera">
    		
    			<span class="TituloLogo2">Control de Sistema</span>
    		
    	</div>
    	<div id ="Botonera">
    		<t:insertAttribute name ="botonera"/>
    	</div>
    	
    	<div id="Izquierda">
    	
    	
    	</div>
    	<div id="Contenido">
    		
    		
      	</div>
      	<div id="Derecha">
      			
        </div>
        <div id= "Pie">
	    	
	    	
       	</div>
     </div>
  </body>

