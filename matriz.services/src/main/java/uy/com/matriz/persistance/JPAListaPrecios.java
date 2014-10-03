package uy.com.matriz.persistance;
/*
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import uy.com.matriz.clases.domain.jpa.IdListaPrecios;
import uy.com.matriz.clases.domain.jpa.ListaPrecios;
import uy.com.matriz.interfaces.persistance.IntListaPreciosDAO;

@Repository("listaPreciosDAO")
@Transactional
public class JPAListaPrecios implements IntListaPreciosDAO 
{
	
	private static final String ALL_LISTA_PRECIOS ="SELECT l FROM ListaPrecios l";
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addListaPrecios(ListaPrecios listaPrecios) 
	{
		em.persist(listaPrecios);

	}

	@Override
	public void updateListaPrecios(ListaPrecios listaPrecios) 
	{
		em.merge(listaPrecios);

	}

	@Override
	public void updateListaPreciosById(IdListaPrecios idListaPrecios) 
	{
		em.merge(getListaPreciosById(idListaPrecios));

	}

	@Override
	public void deleteListaPrecios(ListaPrecios listaPrecios) 
	{
		try
		{
			em.remove(listaPrecios);
		}
		catch(DataAccessException e){}

	}

	@Override
	public void deleteListaPreciosById(IdListaPrecios idListaPrecios) 
	{
		try
		{
			em.remove(getListaPreciosById(idListaPrecios));
		}
		catch(DataAccessException e){}

	}

	@Override
	public ListaPrecios getListaPreciosById(IdListaPrecios idListaPrecios) 
	{
		return em.find(ListaPrecios.class, idListaPrecios);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ListaPrecios> getAllListaPrecios() 
	{
		return (List<ListaPrecios>) em.createQuery(ALL_LISTA_PRECIOS).getResultList();
	}

}
*/