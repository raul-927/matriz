package uy.com.matriz.controller;


import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.matriz.clases.domain.jpa.Direccion;


import uy.com.matriz.interfaces.services.ServiceIntDireccion;
import uy.com.matriz.interfaces.services.ServiceIntCalle;



@Controller
@RequestMapping("/direccion")
public class DireccionController
{
	
	
	private final ServiceIntDireccion direccionService;
	private final ServiceIntCalle calleService;
	
	@Inject
    public DireccionController(ServiceIntDireccion direccionService, ServiceIntCalle calleService)
    {
    	this.direccionService = direccionService;
    	this.calleService = calleService;
    }
	
	//-------------------------add---------------------------------------------
	   @RequestMapping(method = RequestMethod.GET, params ="new")
	    public String showCreateDireccion(Model model)
	    {
		   model.addAttribute(new Direccion());
		   
		   model.addAttribute("dir",direccionService.getAllDireccion());
		   model.addAttribute("calles", calleService.getAllCalles());
		
		   return "direccion/formDireccion";
	    }
	   
	  @RequestMapping(method = RequestMethod.POST, params ="new")
	   public String addDireccion(Model model, @Valid Direccion direccion, BindingResult bindingResult)
	   {
	      if(bindingResult.hasErrors())
	      {
	    	  System.out.println("Error en addCategoriaFromForm");
	    	  model.addAttribute("dir",direccionService.getAllDireccion());
			  model.addAttribute("calles", calleService.getAllCalles());
			
			   return "direccion/formDireccion";
		  
	      }
	       direccionService.addDireccion(direccion);
	       model.addAttribute("dir",direccionService.getAllDireccion());
		   model.addAttribute("calles", calleService.getAllCalles());
		   
		   return "direccion/formDireccion";
	   }
	  
	//-------------------------update---------------------------------------------
	  @RequestMapping(method = RequestMethod.GET, params ="update")
	  public String showUpdateDireccion(Model model)
	  {
		   model.addAttribute(new Direccion());
		   model.addAttribute("dir",direccionService.getAllDireccion());
		   model.addAttribute("calles", calleService.getAllCalles());
		   
		   return "direccion/formDireccion";
	  }
	  @RequestMapping(method = RequestMethod.POST, params ="update")
	  public String updateDireccion(Model model, @Valid Direccion direccion, BindingResult bindingResult)
	  {
	     if(bindingResult.hasErrors())
	     {
		  System.out.println("Error en updateCategoriaFromForm");
		  model.addAttribute("dir",direccionService.getAllDireccion());
		  model.addAttribute("calles", calleService.getAllCalles());
		   
		   return "direccion/formDireccion";
		  
	     }
	      direccionService.saveDireccion(direccion);
	      model.addAttribute("dir",direccionService.getAllDireccion());
		  model.addAttribute("calles", calleService.getAllCalles());
		   
		   return "direccion/formDireccion";
	  }
	   
	//-----------------------delete-----------------------------------------------------------
	  @RequestMapping(method = RequestMethod.GET, params ="delete")
	  public String showDeleteDireccion(Model model)
	  {
		   model.addAttribute(new Direccion());
		   
		   model.addAttribute("dir",direccionService.getAllDireccion());
		   model.addAttribute("calles", calleService.getAllCalles());
		   
		   return "direccion/formDireccion";
	  }
	  @RequestMapping(method = RequestMethod.POST, params ="delete")
	  public String deleteDireccion(Model model, @Valid Direccion direccion, BindingResult bindingResult)
	  {
	     if(bindingResult.hasErrors())
	     {
		  System.out.println("Error en deleteCategoriaFromForm");
		  model.addAttribute("dir",direccionService.getAllDireccion());
		  model.addAttribute("calles", calleService.getAllCalles());
		   
		   return "direccion/formDireccion";
		  
	     }
	     direccionService.deleteDireccion(direccion.getDirId());
	     model.addAttribute("dir",direccionService.getAllDireccion());
		 model.addAttribute("calles", calleService.getAllCalles());
		  
		 return "direccion/formDireccion";
	  }
	
	
	
}
