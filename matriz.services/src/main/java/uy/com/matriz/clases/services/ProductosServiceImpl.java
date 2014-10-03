package uy.com.matriz.clases.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import uy.com.matriz.clases.domain.jpa.Categoria;
import uy.com.matriz.clases.domain.jpa.Productos;

import uy.com.matriz.interfaces.persistance.IntCategoriaDAO;
import uy.com.matriz.interfaces.persistance.IntProductosDAO;
import uy.com.matriz.interfaces.services.ServiceIntProductos;

@Transactional(propagation = Propagation.REQUIRED)
public class ProductosServiceImpl implements ServiceIntProductos 
{
	@Autowired
	IntProductosDAO intProductosDAO;
	
	@Autowired
	IntCategoriaDAO intCategoriaDAO;
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void addProductos(Productos productos) 
	{
		intProductosDAO.addProductos(productos);

	}

	@Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void updateProductos(Productos productos) 
	{
		
		intProductosDAO.updateProductos(productos);

	}

	@Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void deleteProductos(int prdId) 
	{
		intProductosDAO.deleteProductos(prdId);

	}

	@Override
	public Productos getProductos(String prdNom) 
	{
		
		return intProductosDAO.getProductoByNom(prdNom);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Productos getProductosById(int prdId) 
	{
		
		return intProductosDAO.getProdById(prdId);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Productos> getAllProductos() 
	{
		List<Productos> productos = intProductosDAO.findAllProductos();
		return productos;
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Productos> getProductosByCategoria(Categoria cat) 
	{
		List<Productos> productos = intProductosDAO.findProductosByCategoria(cat);
		return productos;
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Productos> getProductosByIdCategoria(int catId) 
	{
		List<Productos> productos = intProductosDAO.findProductosByIdCategoria(catId);
		return productos;
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Categoria> getAllCategorias() 
	{
		List<Categoria> categoria = intProductosDAO.findAllCategorias();
		return categoria;
	}

}
