package uy.com.matriz.persistance;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import uy.com.matriz.clases.domain.jpa.Direccion;
import uy.com.matriz.interfaces.persistance.IntDireccionDAO;


@Repository("direccionDAO")
@Transactional
public class JPADireccionDAO implements IntDireccionDAO
{
	private static final String ALL_DIRECCION ="SELECT d FROM Direccion d";
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Direccion getDireccionById(int dir)
	{
		return  em.find(Direccion.class, dir);
	}

	@Override
	public Direccion getDireccion()
	{
		return  em.find(Direccion.class, null);
	}

	@Override
	public void addDireccion(Direccion direccion)
	{
		em.persist(direccion); 

	}

	@Override
	public void saveDireccion(Direccion direccion)
	{
		em.merge(direccion);

	}

	@Override
	public void deleteDireccion(int dirId)
	{
		
		try 
		{
			em.remove(getDireccionById(dirId));
		} 
		catch(DataAccessException e) {}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Direccion> findAllDireccion()
	{
		return (List<Direccion>) em.createQuery(ALL_DIRECCION).getResultList();
	}

	@Override
	public Direccion getDireccionByNom(String dirNom)
	{
		return em.find(Direccion.class, dirNom); 
	}

}
