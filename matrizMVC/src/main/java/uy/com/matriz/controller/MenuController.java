package uy.com.matriz.controller;

import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.matriz.clases.domain.jpa.Productos;
import uy.com.matriz.clases.domain.jpa.Usuarios;
import uy.com.matriz.interfaces.services.ServiceIntMenu;

@Controller
@RequestMapping("/menu")
public class MenuController 
{
	private final ServiceIntMenu menuService;
	
	@Inject
	public MenuController(ServiceIntMenu menuService)
	{
		this.menuService = menuService;
	}
	
	@RequestMapping(method = RequestMethod.GET, params ="new")
	public String showMenu(Model model)
	{
		model.addAttribute(new Productos());
		model.addAttribute(new Usuarios());
		model.addAttribute("categ", menuService.getAllCategorias());
		model.addAttribute("result", menuService.getAllResult());
		
		return "menu/formMenu";
	}
}
