package uy.com.matriz.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import uy.com.matriz.clases.domain.jpa.TipoCalle;
import uy.com.matriz.interfaces.services.ServiceIntTipoCalle;


@Controller
@RequestMapping("/tipocalle")
public class TipoCalleController
{
  
    private final ServiceIntTipoCalle tipCalleService;
    
    @Inject
    public TipoCalleController(ServiceIntTipoCalle tipCalleService)
    {
	this.tipCalleService = tipCalleService;
    }
    
  //-------------------------add---------------------------------------------
    @RequestMapping(method = RequestMethod.GET, params ="new")
     public String showCreateTipoCalle(Model model)
     {
 	   model.addAttribute(new TipoCalle());
 	   
 	   model.addAttribute("tpc",tipCalleService.getAllTipoCalles());
 	
 	   return "tipo_calle/formTipoCalle";
     }
    
    @RequestMapping(method = RequestMethod.POST, params ="new")
    public String addTipoCalle(Model model, @Valid TipoCalle tpoCalle, BindingResult bindingResult)
    {
       if(bindingResult.hasErrors())
       {
    	   System.out.println("Error en addCategoriaFromForm");
    	   model.addAttribute("tpc",tipCalleService.getAllTipoCalles());
    	   return "tipo_calle/formTipoCalle";
       }
       	tipCalleService.addTipoCalle(tpoCalle);
        model.addAttribute("tpc",tipCalleService.getAllTipoCalles());
        return "tipo_calle/formTipoCalle";
    }
    
  //-------------------------update---------------------------------------------
    @RequestMapping(method = RequestMethod.GET, params ="update")
    public String showUpdateTipoCalle(Model model)
    {
  	   model.addAttribute(new TipoCalle());
  	   model.addAttribute("tpc",tipCalleService.getAllTipoCalles());
  	   return "tipo_calle/formTipoCalle";
    }
    @RequestMapping(method = RequestMethod.POST, params ="update")
    public String updateTipoCalle(Model model, @Valid TipoCalle tpoCalle, BindingResult bindingResult)
    {
       if(bindingResult.hasErrors())
       {
    	   System.out.println("Error en updateCategoriaFromForm");
    	   model.addAttribute("tpc",tipCalleService.getAllTipoCalles());
    	   return "tipo_calle/formTipoCalle";
       }
       tipCalleService.saveTipoCalle(tpoCalle);
       model.addAttribute("tpc",tipCalleService.getAllTipoCalles());
       return "tipo_calle/formTipoCalle";
    }
    
    
  //-----------------------delete-----------------------------------------------------------
    @RequestMapping(method = RequestMethod.GET, params ="delete")
    public String showDeleteTipoCalle(Model model)
    {
    	model.addAttribute(new TipoCalle());
	
    	model.addAttribute("tpc",tipCalleService.getAllTipoCalles());
  	
  	   return "tipo_calle/formTipoCalle";
    }
    @RequestMapping(method = RequestMethod.POST, params ="delete")
    public String deleteCategoriaFromForm(Model model, @Valid TipoCalle tpoCalle, BindingResult bindingResult)
    {
       if(bindingResult.hasErrors())
       {
    	   System.out.println("Error en deleteCategoriaFromForm");
    	   model.addAttribute("tpc",tipCalleService.getAllTipoCalles());
    	   return "tipo_calle/formTipoCalle";
       }
       	tipCalleService.deleteTipoCalle(tpoCalle.getIdTpoCalle());
        model.addAttribute("tpc",tipCalleService.getAllTipoCalles());
        return "tipo_calle/formTipoCalle";
    }
    
}
