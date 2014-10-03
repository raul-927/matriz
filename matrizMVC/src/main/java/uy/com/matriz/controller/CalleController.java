package uy.com.matriz.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.matriz.clases.domain.jpa.Calles;
import uy.com.matriz.interfaces.services.ServiceIntCalle;
import uy.com.matriz.interfaces.services.ServiceIntTipoCalle;


@Controller
@RequestMapping("/calles")
public class CalleController
{
	private final ServiceIntCalle calleService;
	private final ServiceIntTipoCalle tipCalleService;
	
	@Inject
    public CalleController(ServiceIntCalle calleService, ServiceIntTipoCalle tipCalleService)
    {
    	this.calleService = calleService;
    	this.tipCalleService = tipCalleService;
    }
	
	
	//-------------------------add---------------------------------------------
	   @RequestMapping(method = RequestMethod.GET, params ="new")
	    public String showCreateCalle(Model model)
	    {
		   model.addAttribute(new Calles());
		   
		   model.addAttribute("calls",calleService.getAllCalles());
		   model.addAttribute("tpc",tipCalleService.getAllTipoCalles());
		
		   return "calles/formCalles";
	    }
	   
	  @RequestMapping(method = RequestMethod.POST, params ="new")
	   public String addCalle(Model model, @Valid Calles calle, BindingResult bindingResult)
	   {
	      if(bindingResult.hasErrors())
	      {
	    	  System.out.println("Error en addCalleFromForm");
	    	  model.addAttribute("calls",calleService.getAllCalles());
	    	  model.addAttribute("tpc",tipCalleService.getAllTipoCalles());
	    	  return "calles/formCalles";
		  
	      }
	       calleService.addCalle(calle);
	       model.addAttribute("calls",calleService.getAllCalles());
	       model.addAttribute("tpc",tipCalleService.getAllTipoCalles());
	       return "calles/formCalles";
	   }
	  
	//-------------------------update---------------------------------------------
	  @RequestMapping(method = RequestMethod.GET, params ="update")
	  public String showUpdateCalle(Model model)
	  {
		   model.addAttribute(new Calles());
		   model.addAttribute("calls",calleService.getAllCalles());
		   model.addAttribute("tpc",tipCalleService.getAllTipoCalles());
		   return "calles/formCalles";
	  }
	  @RequestMapping(method = RequestMethod.POST, params ="update")
	  public String updateCalle(Model model, @Valid Calles calle, BindingResult bindingResult)
	  {
	     if(bindingResult.hasErrors())
	     {
		  System.out.println("Error en updateCategoriaFromForm");
		  model.addAttribute("calls",calleService.getAllCalles());
		  model.addAttribute("tpc",tipCalleService.getAllTipoCalles());
		  return "calles/formCalles";
		  
	     }
	      calleService.saveCalle(calle);
	      model.addAttribute("calls",calleService.getAllCalles());
	      model.addAttribute("tpc",tipCalleService.getAllTipoCalles());
	      return "calles/formCalles";
	  }
	   
	//-----------------------delete-----------------------------------------------------------
	  @RequestMapping(method = RequestMethod.GET, params ="delete")
	  public String showDeleteCalle(Model model)
	  {
		   model.addAttribute(new Calles());
		   
		   model.addAttribute("calls",calleService.getAllCalles());
		   model.addAttribute("tpc",tipCalleService.getAllTipoCalles());
		   return "calles/formCalles";
	  }
	  @RequestMapping(method = RequestMethod.POST, params ="delete")
	  public String deleteCalle(Model model, @Valid Calles calle, BindingResult bindingResult)
	  {
	     if(bindingResult.hasErrors())
	     {
		  System.out.println("Error en deleteCategoriaFromForm");
		  model.addAttribute("calls",calleService.getAllCalles());
		  model.addAttribute("tpc",tipCalleService.getAllTipoCalles());
		  return "calles/formCalles";
		  
	     }
	      calleService.deleteCalle(calle.getCalleId());
	      model.addAttribute("calls",calleService.getAllCalles());
	      model.addAttribute("tpc",tipCalleService.getAllTipoCalles());
	      return "calles/formCalles";
	  }
	
}
