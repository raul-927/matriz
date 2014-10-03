<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>


	<a href ="http://localhost:8091/matrizMVC/listaprecios?new" >Ingresar una nueva lista de precios</a> <br />
	<span> |</span>
	<a href = "http://localhost:8091/matrizMVC/listaprecios?update" >Modificar una lista de precios</a>  <br />
	<span>|</span>
	<a href ="http://localhost:8091/matrizMVC/listaprecios?delete">Anular una lista de precios</a>  <br />
	<input type = "button" value ="Ingresar una nueva lista de precios"/>