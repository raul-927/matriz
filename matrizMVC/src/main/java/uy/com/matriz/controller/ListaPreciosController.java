package uy.com.matriz.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.matriz.clases.domain.jpa.AuxPrecios;
import uy.com.matriz.clases.domain.jpa.IdAuxPrecios;
import uy.com.matriz.clases.domain.jpa.ListaPrecios;
import uy.com.matriz.clases.domain.jpa.IdListaPrecios;
import uy.com.matriz.clases.domain.jpa.Productos;
import uy.com.matriz.interfaces.services.ServiceIntAuxPrecios;
import uy.com.matriz.interfaces.services.ServiceIntListaPrecios;
import uy.com.matriz.interfaces.services.ServiceIntProductos;

@Controller
@RequestMapping("/listaPrecios")
public class ListaPreciosController 
{
	
	private final ServiceIntListaPrecios listaPreciosService;
	private final ServiceIntProductos productosService;
	@SuppressWarnings("unused")
	private final ServiceIntAuxPrecios auxPreciosService;
	
	@Inject
	public ListaPreciosController(ServiceIntListaPrecios listaPreciosService, 
			ServiceIntProductos productosService,
			ServiceIntAuxPrecios auxPreciosService)
	{
		this.listaPreciosService = listaPreciosService;
		this.productosService = productosService;
		this.auxPreciosService = auxPreciosService;
	}
	
	
	//-------------------------add---------------------------------------------
	   @RequestMapping(method = RequestMethod.GET, params ="new")
	    public String showAddListaPrecios(Model model, IdListaPrecios idListaPrecios)
	    {
		   model.addAttribute(new IdListaPrecios());
		   model.addAttribute(new ListaPrecios());
		   model.addAttribute(new Productos());
		   model.addAttribute(new AuxPrecios());
		   model.addAttribute(new IdAuxPrecios());

		   model.addAttribute("listaP",listaPreciosService.getAllListaPrecios());
		   //model.addAttribute("idListaPrecios",listaPreciosService.getListaPrecios(idListaPrecios.getIdLista()));
		   model.addAttribute("productos",productosService.getAllProductos());
		   //model.addAttribute("auxPrec", auxPreciosService.getAllAuxPrecios());
		   return "listaPrecios/formListaPrecios";
	    }
	   
	   @RequestMapping(method = RequestMethod.POST, params ="new")
	   public String addListaPrecios(Model model, @Valid ListaPrecios listaPrecios, IdListaPrecios idListaPrecios ,BindingResult bindingResult)
	   {
	      if(bindingResult.hasErrors())
	      {
	    	  System.out.println("Error en addListaPrecios");
	    	  model.addAttribute(new IdListaPrecios());
	    	  model.addAttribute(new ListaPrecios());
	    	  model.addAttribute(new Productos());
	    	  
			  model.addAttribute("listaPrecios",listaPreciosService.getAllListaPrecios());
			 // model.addAttribute("idListaPrecios",listaPreciosService.getListaPrecios(idListaPrecios.getIdLista()));
			   
			  return "listaPrecios/formListaPrecios";
		  
	      }
	      listaPreciosService.addListaPrecios(listaPrecios);
	      model.addAttribute(new IdListaPrecios());
    	  model.addAttribute(new ListaPrecios());
    	  model.addAttribute(new Productos());
    	  
		  model.addAttribute("listaPrecios",listaPreciosService.getAllListaPrecios());
		  //model.addAttribute("idListaPrecios",listaPreciosService.getListaPrecios(idListaPrecios.getIdLista()));
		  
		  return "listaPrecios/formListaPrecios";
	   }
	  
	//-------------------------update---------------------------------------------
	  @RequestMapping(method = RequestMethod.GET, params ="update")
	  public String showUpdateListaPrecios(Model model, IdListaPrecios idListaPrecios)
	  {
		  model.addAttribute(new IdListaPrecios());
    	  model.addAttribute(new ListaPrecios());
    	  model.addAttribute(new Productos());
    	  
    	  model.addAttribute("listaPrecios",listaPreciosService.getAllListaPrecios());
		 // model.addAttribute("idListaPrecios",listaPreciosService.getListaPrecios(idListaPrecios.getIdLista()));
		  
		  return "listaPrecios/formListaPrecios";
	  }
	  
	  
	  @RequestMapping(method = RequestMethod.POST, params ="update")
	  public String updateListaPrecios(Model model, @Valid ListaPrecios listaPrecios, IdListaPrecios idListaPrecios, BindingResult bindingResult)
	  {
	     if(bindingResult.hasErrors())
	     {
	    	 System.out.println("Error en updateListaPrecios");
		  
	    	// model.addAttribute("listaPrecios",listaPreciosService.getAllListaPrecios());
	    	// model.addAttribute("idListaPrecios",listaPreciosService.getListaPrecios(idListaPrecios));
	    	 return "listaPrecios/formListaPrecios"; 
	     }
	     //listaPreciosService.updateListaPrecios(idListaPrecios);
	     model.addAttribute("listaPrecios",listaPreciosService.getAllListaPrecios());
		// model.addAttribute("idListaPrecios",listaPreciosService.getListaPrecios(idListaPrecios));
		 return "listaPrecios/formListaPrecios";
	  }
	   
	//-----------------------delete-----------------------------------------------------------
	  @RequestMapping(method = RequestMethod.GET, params ="delete")
	  public String showDeleteListaPrecios(Model model, IdListaPrecios idListaPrecios)
	  {
		  model.addAttribute(new IdListaPrecios());
    	  model.addAttribute(new ListaPrecios());
    	  model.addAttribute(new Productos());
    	  
    	  model.addAttribute("listaPrecios",listaPreciosService.getAllListaPrecios());
		 // model.addAttribute("idListaPrecios",listaPreciosService.getListaPrecios(idListaPrecios));
		  
		  return "listaPrecios/formListaPrecios";
	  }
	  @RequestMapping(method = RequestMethod.POST, params ="delete")
	  public String deleteListaPrecios(Model model, @Valid ListaPrecios listaPrecios, IdListaPrecios idListaPrecios, BindingResult bindingResult)
	  {
	     if(bindingResult.hasErrors())
	     {
	    	 System.out.println("Error en deleteListaPrecios");
	    	 model.addAttribute("listaPrecios",listaPreciosService.getAllListaPrecios());
	    	// model.addAttribute("idListaPrecios",listaPreciosService.getListaPrecios(idListaPrecios));
	    	 
	    	 return "listaPrecios/formListaPrecios";  
	     }
	   //  listaPreciosService.deleteListaPreciosById(idListaPrecios);
	   //  model.addAttribute("listaPrecios",listaPreciosService.getAllListaPrecios());
		// model.addAttribute("idListaPrecios",listaPreciosService.getListaPrecios(idListaPrecios));
		 
		 return "listaPrecios/formListaPrecios";
	  }
}
