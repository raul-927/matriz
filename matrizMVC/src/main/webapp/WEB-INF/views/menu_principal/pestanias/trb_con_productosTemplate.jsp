<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>  
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />  
    <title>Cómo crear un menú de pestañas elegante en jQuery</title>  
    <link rel="stylesheet" href="main.css" type="text/css" media="screen" />  
    <!--[if IE]>  
        <link rel="stylesheet" href="ie.css" type="text/css" media="screen" />  
    <![endif]--> 
    
    <link href="<s:url value="/resources" />/css/main.css" rel="stylesheet" type="text/css" />
    <link rel="shortcut icon" href="<s:url value="/resources" />/ICO/FaviconMatriz3.ico" /> 
    <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
	<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
</head>  
<script type="text/javascript">
$(document).ready(function(){  
    $(".menu > li").click(function(e){  
        var a = e.target.id;  
        //desactivamos seccion y activamos elemento de menu  
        $(".menu li.active").removeClass("active");  
        $(".menu #"+a).addClass("active");  
        //ocultamos divisiones, mostramos la seleccionada  
        $(".content").css("display", "none");  
        $("."+a).fadeIn();  
    });  
});  
</script>
<body>  
    <div class="wrapper">  
        <h1>Cómo crear un menú de pestañas elegante en jQuery</h1>  
        <br />  
        <div class="aux">  
            <div id="container">  
                <ul class="menu">  
                    <li id="noticias" class="active">Noticias</li>  
                    <li id="tutoriales">Tutoriales</li>  
                    <li id="enlaces">Enlaces</li>  
                </ul>  
                <span class="clear"></span>  
                <div class="content noticias">  
                    <h3>Últimas Noticias</h3>  
                    <ul>  
                        <li><img src="img/bullet.png" alt="-" /> Manifiesto por los Derechos en Internet </li>  
                        <li><img src="img/bullet.png" alt="-" /> Logos que Inspiran Volumen #5</li>  
                        <li><img src="img/bullet.png" alt="-" /> Erasmusu llega a los 6.000 usuarios</li>  
                        <li><img src="img/bullet.png" alt="-" /> Lanzamos web.ontuts.com!</li>  
                    </ul>  
                </div>  
                <div class="content tutoriales">  
                    <h3>Últimos Tutoriales</h3>  
                    <ul>  
                        <li><img src="img/bullet.png" alt="-" /> Cómo crear bordes redondeados en CSS3</li>  
                        <li><img src="img/bullet.png" alt="-" /> JSONP, llamadas entre dominios</li>  
                        <li><img src="img/bullet.png" alt="-" /> Introducción a Microsoft Silverlight</li>  
                        <li><img src="img/bullet.png" alt="-" /> Cómo aplicar sombra en textos con CSS3</li>  
                        <li><img src="img/bullet.png" alt="-" /> Creando capa de conexión abstracta a base de datos con PHP</li>  
                        <li><img src="img/bullet.png" alt="-" /> Mini Aplicaciones Web con Python y Juno</li>  
                    </ul>  
                </div>  
                <div class="content enlaces">  
                    <h3>Deberías Visitar...</h3>  
                    <ul>  
                        <li><img src="img/bullet.png" alt="-" /> <a href="http://www.plusmusica.com">www.plusmusica.com</a> - Online jukebox!</li>  
                        <li><img src="img/bullet.png" alt="-" /> <a href="http://www.cokidoo.com">www.cokidoo.com</a> - Nuestra startup! <img src="http://web.ontuts.com/wp-includes/images/smilies/icon_smile.gif" alt=":)" class="wp-smiley"> </li>  
                        <li><img src="img/bullet.png" alt="-" /> <a href="http://www.cokidoo.com">www.pixelartgames.com</a> - Te gustan los juegos pixel art? <img src="http://web.ontuts.com/wp-includes/images/smilies/icon_wink.gif" alt=";)" class="wp-smiley"> </li>  
                        <li><img src="img/bullet.png" alt="-" /> <a href="http://www.dmsconsulting.es">www.dmsconsulting.es</a> - Anterior empresa</li>  
                    </ul>  
                </div>  
            </div>  
        </div>  
    </div>  
    <script type="text/javascript" src="jquery.js"></script>  
    <script type="text/javascript" src="tabs.js"></script>  
</body>  