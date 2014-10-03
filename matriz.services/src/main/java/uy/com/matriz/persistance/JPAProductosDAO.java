package uy.com.matriz.persistance;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import uy.com.matriz.clases.domain.jpa.Categoria;
import uy.com.matriz.clases.domain.jpa.Productos;
import uy.com.matriz.interfaces.persistance.IntProductosDAO;


@Repository("productosDAO")
@Transactional
public class JPAProductosDAO implements IntProductosDAO
{
	
	private static final String ALL_PRODUCTOS ="SELECT p FROM Productos p";
	private static final String ALL_PRODUCTOS_BY_CATEGORIA ="SELECT p FROM Productos p, Categoria c WHERE p.prdCat.id = c.id AND c.id =:id";
	private static final String All_CATEGORIAS ="SELECT c FROM Categoria c";
	
	@PersistenceContext
	private EntityManager em;


	@Override
	public void addProductos(Productos producto) 
	{
		em.persist(producto);
		
	}

	@Override
	public void updateProductos(Productos producto) 
	{
		
		em.merge(producto);
		
	}

	@Override
	public void deleteProductos(int prdId)
	{
		try 
		{
			em.remove(getProdById(prdId));
		} 
		catch(DataAccessException e) {}
		
	}

	@Override
	public Productos getProdById(int prdId) 
	{
		return em.find(Productos.class, prdId);
	}

	@Override
	public Productos getProductoByNom(String prdNom) 
	{
		return em.find(Productos.class, prdNom);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Productos> findAllProductos() 
	{
		return (List<Productos>) em.createQuery(ALL_PRODUCTOS).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Productos> findProductosByCategoria(Categoria cat) 
	{
		return (List<Productos>) em.createQuery(ALL_PRODUCTOS_BY_CATEGORIA).
				 setParameter("cat",cat).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Productos> findProductosByIdCategoria(int catId) 
	{
		return (List<Productos>) em.createQuery(ALL_PRODUCTOS_BY_CATEGORIA).
				 setParameter("id",catId).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Categoria> findAllCategorias() 
	{
		return (List<Categoria>) em.createQuery(All_CATEGORIAS).getResultList();
	}

}
