package uy.com.matriz.persistance;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import uy.com.matriz.clases.domain.jpa.Categoria;
import uy.com.matriz.interfaces.persistance.IntCategoriaDAO;

@Repository("categoriasDao")
@Transactional
public class JPACategoriaDAO implements IntCategoriaDAO
{
	private static final String ALL_CATEGORIAS ="SELECT c FROM Categoria c ORDER BY c.id";
	@PersistenceContext
	private EntityManager em; 
	

	public Categoria getCategoriaById(int cat)
	{
		return em.find(Categoria.class, cat); 
	}

	
	public Categoria getCategoria()
	{
		
		return  em.find(Categoria.class, null);
	}

	
	public void addCategoria(Categoria categoria)
	{
		em.persist(categoria); 
		
	}

	public void deleteCategoria(int cat)
	{
		try 
		{
			em.remove(getCategoriaById(cat));
		} 
		catch(DataAccessException e) {}

	}
	
	@SuppressWarnings("unchecked")
	public List<Categoria> findAllCategorias() 
	{
	    return (List<Categoria>) em.createQuery(ALL_CATEGORIAS).getResultList();
	}


	@Override
	public Categoria getCategoriaByNom(String cat_nom)
	{
		return em.find(Categoria.class, cat_nom); 
	}

	@Override
	public void saveCategoria(Categoria categoria)
	{
	    em.merge(categoria);
	    
	}
	

}
