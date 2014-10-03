package uy.com.matriz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/menup")
public class MenuPrincipalController 
{

	public MenuPrincipalController() 
	{
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String showMenuPrincipal(Model model)
	{
		 return "/principal";
	}
	
	@RequestMapping(value = "/fsdfsdf" ,method = RequestMethod.GET, params ="prod")
	public String showTrabajarConProductos( Model model)
	{
		return "/productos";
	}
	
}
