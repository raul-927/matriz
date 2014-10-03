package uy.com.matriz.persistance;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import uy.com.matriz.clases.domain.jpa.Categoria;
import uy.com.matriz.interfaces.persistance.IntMenuDAO;


@Repository("menuDAO")
@Transactional
public class JPAMenuDAO implements IntMenuDAO 
{

	
	private static final String ALL_CATEGORIAS ="SELECT c FROM Categoria c ORDER BY c.id";
	
	private static final String PRODUCTOS_PRECIO_CATEGORIA =
			"SELECT p.prdNom, p.prdCat.id, l.listPrecMonto " +
			"FROM Productos p, Categoria c, AuxPrecios aux, ListaPrecios l " +
			"WHERE p.prdId = l.idListaPrecios.idProducto " +
			"AND p.prdCat.id = c.id " +
			"AND current_date() BETWEEN aux.idAuxPrecios.auxPrecFechIni AND aux.idAuxPrecios.auxPrecFechFin "+
			"OR current_date() > aux.idAuxPrecios.auxPrecFechIni " +
			"AND aux.idAuxPrecios.auxPrecFechFin = '0000-00-00'";
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Categoria> getAllCategorias() 
	{
		return (List<Categoria>) em.createQuery(ALL_CATEGORIAS).
				 getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> getAllResult()
	{
		List<Object[]> prodPrecCateg = em.createQuery(PRODUCTOS_PRECIO_CATEGORIA).getResultList();
		
		return prodPrecCateg;
	}
	
}
