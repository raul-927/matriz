<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

  <head>
    <title>Matriz</title>
    <link href="<s:url value="/resources" />/css/css2.css" rel="stylesheet" type="text/css" />
  </head>

  <body>
    <div id="Contenedor">
    	<div id="Cabecera">
    		<span class="TituloLogo">Delivery Matriz</span>
    		
    	</div>
    	<div id="Izquierda">
    	
    	<t:insertAttribute name ="flash"/>
    	</div>
    	<div id="Contenido">
    		<t:insertAttribute name="content" />
            <div id= "Principal">
            	<div class='Centro'>
            		<div class ="Tabla">
    					<t:insertAttribute name ="table"/>
    				</div>
    			</div>
    		</div>
      	</div>
      	<div id="Derecha">
                <form  id="FrmPedido">
                    <fieldset>
                        <legend>Pedido</legend>
                        <span>
                        		fsdlfkjsdlfsdlfksdfklsfklssdfklsdksdfskldfjsdklfjsdkj<br/>
                        		sdflhsdfljksdhfsdjkfhsdkfjhsdfkjsdhfkjsdhfskdjfhsdkjfshdkjsd<br/>
                        </span>
                    </fieldset>
                </form>
        </div>
        <div id= "Pie">
	    	<input type="button" value="Prueba">
	    	<span>fsdfljksdlkfjsdlkfjsdlfkjsdflkj</span><br/>
	    	<span>fsldkfjsdlfkjsdfsldkfjsdlfkjsdf</span>
       	</div>
     </div>
  </body>

