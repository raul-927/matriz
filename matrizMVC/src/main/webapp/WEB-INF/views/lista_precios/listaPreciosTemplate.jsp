<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

  <head>
    <title>Matriz</title>
    <link href="<s:url value="/resources" />/css/AltaCategorias.css" 
          rel="stylesheet" 
          type="text/css" />
  </head>

  <body>
    <div id ="PrincipalAltaCategorias">
    	<div id="content1">
    		<t:insertAttribute name="content" />
      	</div>
      	<div id="form">
       		<t:insertAttribute name="form" />
      	</div>
      	<div id ="table">
      		
      	</div>
     </div>
  </body>

