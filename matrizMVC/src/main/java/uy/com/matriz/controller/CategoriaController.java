package uy.com.matriz.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import uy.com.matriz.clases.domain.jpa.Categoria;
import uy.com.matriz.interfaces.services.ServiceIntCategoria;

/**
 * @author r.hernandez
 *
 */
@Controller
@RequestMapping("/categorias")
public class CategoriaController
{

    private final ServiceIntCategoria categoriaservice;
    
    @Inject
    public CategoriaController(ServiceIntCategoria categoriaService)
    {
    	this.categoriaservice = categoriaService;
    }
    
  //-------------------------add---------------------------------------------
   @RequestMapping(method = RequestMethod.GET, params ="new")
    public String showCreateCategoria(Model model)
    {
	   model.addAttribute(new Categoria());
	   
	   model.addAttribute("cat",categoriaservice.getAllCategorias());
	
	   return "categoria/formCategorias";
    }
   
   
  @RequestMapping(method = RequestMethod.POST, params ="new")
   public String addCategoriaFromForm(Model model, @Valid Categoria categoria, BindingResult bindingResult)
   {
      if(bindingResult.hasErrors())
      {
	  System.out.println("Error en addCategoriaFromForm");
	  model.addAttribute("cat",categoriaservice.getAllCategorias());
	  return "categoria/formCategorias";
	  
      }
       categoriaservice.addCategoria(categoria);
       model.addAttribute("cat",categoriaservice.getAllCategorias());
       return "categoria/formCategorias";
   }
    
    
  //-------------------------update---------------------------------------------
  @RequestMapping(method = RequestMethod.GET, params ="update")
  public String showUpdateCategoria(Model model)
  {
	   model.addAttribute(new Categoria());
	   model.addAttribute("cat",categoriaservice.getAllCategorias());
	   return "categoria/formCategorias";
  }
  @RequestMapping(method = RequestMethod.POST, params ="update")
  public String updateCategoriaFromForm(Model model, @Valid Categoria categoria, BindingResult bindingResult)
  {
     if(bindingResult.hasErrors())
     {
	  System.out.println("Error en updateCategoriaFromForm");
	  model.addAttribute("cat",categoriaservice.getAllCategorias());
	  return "categoria/formCategorias";
	  
     }
      categoriaservice.saveCategoria(categoria);
      model.addAttribute("cat",categoriaservice.getAllCategorias());
      return "categoria/formCategorias";
  }
  
  //-----------------------delete-----------------------------------------------------------
  @RequestMapping(method = RequestMethod.GET, params ="delete")
  public String showDeleteCategoria(Model model)
  {
	   model.addAttribute(new Categoria());
	   
	   model.addAttribute("cat",categoriaservice.getAllCategorias());
	
	   return "categoria/formCategorias";
  }
  @RequestMapping(method = RequestMethod.POST, params ="delete")
  public String deleteCategoriaFromForm(Model model, @Valid Categoria categoria, BindingResult bindingResult)
  {
     if(bindingResult.hasErrors())
     {
	  System.out.println("Error en deleteCategoriaFromForm");
	  model.addAttribute("cat",categoriaservice.getAllCategorias());
	  return "categoria/formCategorias";
	  
     }
      categoriaservice.deleteCategoria(categoria.getId());
      model.addAttribute("cat",categoriaservice.getAllCategorias());
      return "categoria/formCategorias";
  }
    
   /* @RequestMapping(params ="new", method = RequestMethod.GET)
    public ModelAndView showCategoriaPage(Model model) 
    {
    	model.addAttribute(new Categoria());
    	
    	ModelAndView mav = new ModelAndView();
    	List<Categoria> categorias = categoriaservice.getAllCategorias();
    	mav.setViewName("categoria/edit");
    	mav.addObject("cat", categorias);
    	
    	return mav;
    }*/
    
    /*@RequestMapping(params ="new", method = RequestMethod.POST)
    public ModelAndView addCategoriaFromForm(@Valid Categoria categoria, BindingResult bindingResult)
    {
    	
    	ModelAndView mav = new ModelAndView();
    	if(bindingResult.hasErrors())
    	{
    		System.out.println("Error en addCategoriaFromForm");
    		List<Categoria> categorias = categoriaservice.getAllCategorias();
    		mav.setViewName("categoria/edit");
    		mav.addObject("cat", categorias);
    		return mav;
    	}
    	categoriaservice.addCategoria(categoria);
    	List<Categoria> categorias = categoriaservice.getAllCategorias();
    	mav.setViewName("categoria/edit");
    	mav.addObject("cat", categorias);
    	
    	return mav;
    }*/
 //------------------------------delete-----------------------------------------------------------------   
    
   /* @RequestMapping(params ="delete", method = RequestMethod.GET)
    public ModelAndView showdeleteCategoriaPage(Model model) 
    {
    	model.addAttribute(new Categoria());
    	
    	ModelAndView mav = new ModelAndView();
    	List<Categoria> categorias = categoriaservice.getAllCategorias();
    	mav.setViewName("categoria/edit");
    	mav.addObject("cat", categorias);
    	
    	return mav;
    }*/
    
    //@RequestMapping(params ="delete", method = RequestMethod.POST)
    /*public ModelAndView deleteCategoriaFromForm(@Valid Categoria categoria, BindingResult bindingResult)
    {
    	
    	ModelAndView mav = new ModelAndView();
    	if(bindingResult.hasErrors())
    	{
    		System.out.println("Error en deleteCategoriaFromForm");
    		mav.setViewName("/error");
    		return mav;
    	}
    	categoriaservice.deleteCategoria(categoria.getId());
    	List<Categoria> categorias = categoriaservice.getAllCategorias();
    	mav.setViewName("categoria/edit");
    	mav.addObject("cat", categorias);
    	
    	return mav;
    }*/
    
//-----------------------------------update-------------------------------------
    
    /*@RequestMapping(params ="update", method = RequestMethod.GET)
    public ModelAndView showupdateCategoriaPage(Model model) 
    {
    	model.addAttribute(new Categoria());
    	
    	ModelAndView mav = new ModelAndView();
    	List<Categoria> categorias = categoriaservice.getAllCategorias();
    	mav.setViewName("categoria/edit");
    	mav.addObject("cat", categorias);
    	
    	return mav;
    }*/
    
    /*@RequestMapping(params ="update", method = RequestMethod.POST)
    public ModelAndView updateCategoriaFromForm(@Valid Categoria categoria, BindingResult bindingResult)
    {
    	
    	ModelAndView mav = new ModelAndView();
    	if(bindingResult.hasErrors())
    	{
    	    System.out.println("Error en deleteCategoriaFromForm");
    	    mav.setViewName("/error");
    	    return mav;
    	}
    	categoriaservice.saveCategoria(categoria);
    	List<Categoria> categorias = categoriaservice.getAllCategorias();
    	mav.setViewName("categoria/edit");
    	mav.addObject("cat", categorias);
    	
    	return mav;
    }*/

}
