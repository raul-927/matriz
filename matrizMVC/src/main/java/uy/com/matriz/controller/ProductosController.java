package uy.com.matriz.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uy.com.matriz.clases.domain.jpa.Productos;
import uy.com.matriz.interfaces.services.ServiceIntCategoria;
import uy.com.matriz.interfaces.services.ServiceIntProductos;

@Controller
@RequestMapping("/productos")
public class ProductosController 
{
	
	private final ServiceIntProductos productosService;
	private final ServiceIntCategoria categoriaService;
		
	@Inject
	public ProductosController (ServiceIntProductos productosService, ServiceIntCategoria categoriaService)
	{
	   this.productosService = productosService;
	   this.categoriaService = categoriaService;
	}
		
		
	//-------------------------add---------------------------------------------
	@RequestMapping(method = RequestMethod.GET, params ="new")
	public String showCreateProductos(Model model)
	{
		
		model.addAttribute(new Productos());	   
		model.addAttribute("prod",productosService.getAllProductos());
		model.addAttribute("cat", categoriaService.getAllCategorias());
			
		return "productos/formProductos";
	}
		   
	@RequestMapping(method = RequestMethod.POST, params ="new")
	public String addProductos(Model model, @Valid Productos productos, BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
		{
		  System.out.println("Error en addProductos");
		  model.addAttribute("prod",productosService.getAllProductos());
		  model.addAttribute("cat", categoriaService.getAllCategorias());
		  return "productos/formProductos";
			  
		}
		productosService.addProductos(productos);
		model.addAttribute("prod",productosService.getAllProductos());
		model.addAttribute("cat", categoriaService.getAllCategorias());
		return "productos/formProductos";
	}
		  
	//-------------------------update---------------------------------------------
	@RequestMapping(method = RequestMethod.GET, params ="update")
	public String showUpdateProductos(Model model)
	{
		model.addAttribute(new Productos());
		model.addAttribute("prod", productosService.getAllProductos());
		model.addAttribute("cat", categoriaService.getAllCategorias());
		return "productos/formProductos";
	}
		  
	@RequestMapping(method = RequestMethod.POST, params ="update")
	public String updateProductos(Model model, @Valid Productos productos, BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
		{
			System.out.println("Error en updateProductos");
			model.addAttribute("prod",productosService.getAllProductos());
			model.addAttribute("cat", categoriaService.getAllCategorias());
			return "productos/formProductos";
			  
		}
		productosService.updateProductos(productos);
		model.addAttribute("prod",productosService.getAllProductos());
		model.addAttribute("cat", categoriaService.getAllCategorias());
		return "productos/formProductos";
	}
		   
	//-----------------------delete-----------------------------------------------------------
	@RequestMapping(method = RequestMethod.GET, params ="delete")
	public String showDeleteProductos(Model model)
	{
		model.addAttribute(new Productos());
			   
		model.addAttribute("prod", productosService.getAllProductos());
		model.addAttribute("cat", categoriaService.getAllCategorias());
		return "productos/formProductos";
	}
	@RequestMapping(method = RequestMethod.POST, params ="delete")
	public String deleteProductos(Model model, @Valid Productos productos, BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
		{
			System.out.println("Error en deleteProductos");
			model.addAttribute("prod",productosService.getAllProductos());
			model.addAttribute("cat", categoriaService.getAllCategorias());
			return "productos/formProductos";
			  
		}
		    productosService.deleteProductos(productos.getPrdId());
		    model.addAttribute("prod",productosService.getAllProductos());
		    model.addAttribute("cat", categoriaService.getAllCategorias());
		    return "productos/formProductos";
	}
		
}


