<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

  <head>
    <title>Matriz</title>
    <link href="<s:url value="/resources" />/css/mainListaPrecios.css"
          rel="stylesheet" 
          type="text/css" />
    
   <link rel="shortcut icon" href="<s:url value="/resources" />/ICO/FaviconMatriz3.ico" />
  </head>

  <body>
    <div id ="Contenedor">
    
    	<div id="Izquierda">
    		<t:insertAttribute name="mainIzquierda" />
      	</div>
      	
      	<div id="Derecha">
	    	<t:insertAttribute name = "mainDerecha"/>
	    </div>
 
	    <div id="Contenido">
	    	<t:insertAttribute name="mainContenido" />
	    </div>
	    <div id = "Derecha">
	    	<t:insertAttribute name = "mainDerecha"/>
	    </div>
	    <div id ="Pie">
	    	<t:insertAttribute name="mainPie" />
	    </div>
     </div>
  </body>

