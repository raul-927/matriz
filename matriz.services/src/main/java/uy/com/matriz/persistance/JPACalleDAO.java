package uy.com.matriz.persistance;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



import uy.com.matriz.clases.domain.jpa.Calles;
import uy.com.matriz.interfaces.persistance.IntCalleDAO;

@Repository("callesDAO")
@Transactional
public class JPACalleDAO implements IntCalleDAO
{
	
	private static final String ALL_CALLES ="SELECT c FROM Calles c";
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Calles getCalleById(int call)
	{
		
		return  em.find(Calles.class, call);
	}

	@Override
	public Calles getCalle()
	{
		
		return  em.find(Calles.class, null);
	}

	@Override
	public void addCalle(Calles calle)
	{
		em.persist(calle); 
		
	}

	@Override
	public void saveCalle(Calles calle)
	{
		em.merge(calle);
		
	}


	@Override
	public void deleteCalle(int call)
	{
		try 
		{
			em.remove(getCalleById(call));
		} 
		catch(DataAccessException e) {}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Calles> findAllCalles()
	{
		return (List<Calles>) em.createQuery(ALL_CALLES).getResultList();
	}

	@Override
	public Calles getCalleByNom(String call_nom)
	{
		return em.find(Calles.class, call_nom); 
	}

}
