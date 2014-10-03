package uy.com.matriz.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import uy.com.matriz.clases.domain.jpa.Categoria;
import uy.com.matriz.interfaces.services.ServiceIntCategoria;
/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController 
{
	private ServiceIntCategoria categoriaservice;
	
	
	@Inject
	public HomeController(ServiceIntCategoria categoriaservice)
	{
		this.categoriaservice = categoriaservice;
	}
	
	/*@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView showHomePage() 
	{
	    ModelAndView mav = new ModelAndView();
	    
	    //List<Categoria> categorias = categoriaservice.getAllCategorias();
	    mav.setViewName("/home");
	   // mav.addObject("cat", categorias);
	    
	    return mav;
	}*/
	
	@RequestMapping({"/","/home"})
	public String showHomePage2(Model model) 
	{	
		model.addAttribute(new Categoria());
	    model.addAttribute("cat", categoriaservice.getAllCategorias());
	    return "home";
	}
	
	/*@RequestMapping(method = RequestMethod.GET, params = "new")
    public String createCategoria(Model model)
    {
		model.addAttribute(new Categoria());
	
		return "categoria/edit";
    }*/
	
}
