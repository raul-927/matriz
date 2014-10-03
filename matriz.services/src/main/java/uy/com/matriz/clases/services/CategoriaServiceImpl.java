package uy.com.matriz.clases.services;

import static java.lang.Math.*;
import static java.util.Collections.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import uy.com.matriz.clases.domain.jpa.Categoria;
import uy.com.matriz.interfaces.persistance.IntCategoriaDAO;
import uy.com.matriz.interfaces.services.ServiceIntCategoria;


@Transactional(propagation = Propagation.REQUIRED)
public class CategoriaServiceImpl implements ServiceIntCategoria 
{

	@Autowired
	IntCategoriaDAO categoriasDao;
	
	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Categoria> getRecentCategorias(int count) 
	{
		List<Categoria> recentCategorias = (List<Categoria>) categoriasDao.getCategoria();
		reverse (recentCategorias);
		return recentCategorias.subList(0, min(1,recentCategorias.size()));
	}
	
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void saveCategoria(Categoria categoria) 
	{
		
		categoriasDao.saveCategoria(categoria);
		
	}

	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public Categoria getCategoria(int id) 
	{
		
		return categoriasDao.getCategoriaById(id);
	}

	@Override
	public void startFollowing(Categoria follower, Categoria followee) 
	{
		
	}

	@Override
	public Categoria getCategoria(String catnom) 
	{
		
		return categoriasDao.getCategoriaByNom(catnom);
	}
	
	@Override
	public Categoria getCategoriaById(int catid) 
	{
		return categoriasDao.getCategoriaById(catid);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void deleteCategoria(int catid) 
	{
		categoriasDao.deleteCategoria(catid);
	}

	@Override
	public List<Categoria> getAllCategorias() 
	{
	    List<Categoria> categorias = categoriasDao.findAllCategorias(); 
	    return categorias;
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void addCategoria(Categoria categoria)
	{
	    categoriasDao.addCategoria(categoria);
	    
	}

}
