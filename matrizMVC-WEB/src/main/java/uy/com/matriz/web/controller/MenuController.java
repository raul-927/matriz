package uy.com.matriz.web.controller;

import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import uy.com.matriz.clases.domain.jpa.Productos;
import uy.com.matriz.clases.domain.jpa.Usuarios;
import uy.com.matriz.interfaces.services.ServiceIntMenu;
import uy.com.matriz.interfaces.services.ServiceIntUsuarios;

@Controller
@RequestMapping("/menu")
public class MenuController 
{
	private final ServiceIntMenu menuService;
	private final ServiceIntUsuarios usuariosService;
	
	@Inject
	public MenuController(ServiceIntMenu menuService, ServiceIntUsuarios usuariosService)
	{
		this.menuService = menuService;
		this.usuariosService = usuariosService;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String showMenu(@RequestParam("show")String show,  String usrNom, Model model )
	{
		//usrNom = 1;
		model.addAttribute(new Productos());
		model.addAttribute(new Usuarios());
		model.addAttribute("categ", menuService.getAllCategorias());
		model.addAttribute("result", menuService.getAllResult());
		//model.addAttribute("usuario", usuariosService.getUsuarios(usrNom));
		
		return "menu/formMenu";
	}
}
