package uy.com.matriz.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.matriz.clases.domain.jpa.Usuarios;
import uy.com.matriz.interfaces.services.ServiceIntDireccion;
import uy.com.matriz.interfaces.services.ServiceIntUsuarios;
import uy.com.matriz.interfaces.services.ServiceIntCategoriaUsuarios;



@Controller
@RequestMapping("/usuarios")
public class UsuariosController
{
	private final ServiceIntUsuarios usuariosService;
	private final ServiceIntDireccion direccionService;
	private final ServiceIntCategoriaUsuarios categoriaUsuarioService;
	
	@Inject
	public UsuariosController(ServiceIntUsuarios usuariosService, ServiceIntDireccion direccionService, ServiceIntCategoriaUsuarios categoriaUsuarioService)
	{
		this.usuariosService =  usuariosService;
		this.direccionService = direccionService;
		this.categoriaUsuarioService = categoriaUsuarioService;
	}
	
	//-------------------------add---------------------------------------------
	   @RequestMapping(method = RequestMethod.GET, params ="new")
	    public String showCreateUsuario(Model model)
	    {
		   model.addAttribute(new Usuarios());
		   
		   model.addAttribute("user",usuariosService.getAllUsuarios());
		   model.addAttribute("dir", direccionService.getAllDireccion());
		   model.addAttribute("catUsr", categoriaUsuarioService.getAllCategoriasUsuario());
		   
		   return "usuario/formUsuario";
	    }
	   
	  @RequestMapping(method = RequestMethod.POST, params ="new")
	   public String addUsuario(Model model, @Valid Usuarios usuarios, BindingResult bindingResult)
	   {
	      if(bindingResult.hasErrors())
	      {
	    	  System.out.println("Error en addCategoriaFromForm");
	    	  model.addAttribute("user",usuariosService.getAllUsuarios());
	    	  model.addAttribute("dir", direccionService.getAllDireccion());
	    	  model.addAttribute("catUsr", categoriaUsuarioService.getAllCategoriasUsuario());
			  
	    	  return "usuario/formUsuario";  
	      }
	       usuariosService.addUsuarios(usuarios);
	       model.addAttribute("user",usuariosService.getAllUsuarios());
	       model.addAttribute("dir", direccionService.getAllDireccion());
	       model.addAttribute("catUsr", categoriaUsuarioService.getAllCategoriasUsuario());
	       
	       return "usuario/formUsuario";
	   }
	  
	//-------------------------update---------------------------------------------
	  @RequestMapping(method = RequestMethod.GET, params ="update")
	  public String showUpdateUsuario(Model model)
	  {
	      model.addAttribute(new Usuarios());
	      model.addAttribute("user",usuariosService.getAllUsuarios());
	      model.addAttribute("dir", direccionService.getAllDireccion());
	      model.addAttribute("catUsr", categoriaUsuarioService.getAllCategoriasUsuario());
		   
	      return "usuario/formUsuario";
	  }
	  @RequestMapping(method = RequestMethod.POST, params ="update")
	  public String updateUsuario(Model model, @Valid Usuarios usuarios, BindingResult bindingResult)
	  {
	     if(bindingResult.hasErrors())
	     {
	    	 System.out.println("Error en updateCategoriaFromForm");
	    	 model.addAttribute("user",usuariosService.getAllUsuarios());
	    	 model.addAttribute("dir", direccionService.getAllDireccion());
	    	 model.addAttribute("catUsr", categoriaUsuarioService.getAllCategoriasUsuario());
	    	 
	    	 return "usuario/formUsuario";
		  
	     }
	     usuariosService.saveUsuarios(usuarios);
	     model.addAttribute("user",usuariosService.getAllUsuarios());
	     model.addAttribute("dir", direccionService.getAllDireccion());
	     model.addAttribute("catUsr", categoriaUsuarioService.getAllCategoriasUsuario());
		   
	     return "usuario/formUsuario";
	  }
	   
	//-----------------------delete-----------------------------------------------------------
	  @RequestMapping(method = RequestMethod.GET, params ="delete")
	  public String showDeleteUsuario(Model model)
	  {
	      model.addAttribute(new Usuarios());
	      model.addAttribute("user",usuariosService.getAllUsuarios());
	      model.addAttribute("dir", direccionService.getAllDireccion());
	      model.addAttribute("catUsr", categoriaUsuarioService.getAllCategoriasUsuario());
		   
	      return "usuario/formUsuario";
	  }
	  @RequestMapping(method = RequestMethod.POST, params ="delete")
	  public String deleteUsuario(Model model, @Valid Usuarios usuarios, BindingResult bindingResult)
	  {
	     if(bindingResult.hasErrors())
	     {
		  System.out.println("Error en deleteCategoriaFromForm");
		  model.addAttribute("user",usuariosService.getAllUsuarios());
		  model.addAttribute("dir", direccionService.getAllDireccion());
		  model.addAttribute("catUsr", categoriaUsuarioService.getAllCategoriasUsuario());
		   
		  return "usuario/formUsuario";
		  
	     }
	     usuariosService.deleteUsuarios(usuarios.getUsrId());
	     model.addAttribute("user",usuariosService.getAllUsuarios());
	     model.addAttribute("dir", direccionService.getAllDireccion());
	     model.addAttribute("catUsr", categoriaUsuarioService.getAllCategoriasUsuario());
		  
	     return "usuario/formUsuario";
	  }
	
}
