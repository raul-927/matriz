package uy.com.matriz.persistance;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import uy.com.matriz.clases.domain.jpa.AuxPrecios;
import uy.com.matriz.clases.domain.jpa.IdAuxPrecios;
import uy.com.matriz.interfaces.persistance.IntAuxPreciosDAO;

@Repository("auxPreciosDAO")
@Transactional
public class JPAAuxPreciosDAO implements IntAuxPreciosDAO 
{
	
	private static final String ALL_AUX_PRECIOS ="SELETC a FROM AuxPrecios a";
	
	@PersistenceContext
	private EntityManager em;
	

	@Override
	public void addIdAuxPrecios(IdAuxPrecios idAuxPrecios) 
	{
		em.persist(idAuxPrecios);

	}

	@Override
	public void addAuxPrecios(AuxPrecios auxPrecios) 
	{
		em.persist(auxPrecios);

	}

	@Override
	public void updateIdAuxPrecios(IdAuxPrecios idAuxPrecios) 
	{
		em.merge(idAuxPrecios);

	}

	@Override
	public void updateAuxPrecios(AuxPrecios auxPrecios) 
	{
		em.merge(auxPrecios);

	}

	@Override
	public void deleteIdAuxPrecios(Date fechIn, Date fechFin)
	{
		try
		{
			em.remove(getIdAuxPreciosById(fechIn, fechFin));
		}
		catch(DataAccessException e){}
	}

	@Override
	public void deleteAuxPrecios(IdAuxPrecios idAuxPrecios)
	{
		try
		{
			em.remove(getAuxPreciosById(idAuxPrecios));
		}
		catch(DataAccessException e){}

	}

	@Override
	public AuxPrecios getAuxPreciosById(IdAuxPrecios idAuxPrecios) 
	{
		
		return em.find(AuxPrecios.class, idAuxPrecios);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AuxPrecios> getAllAuxPrecios() 
	{
		return (List<AuxPrecios>) em.createQuery(ALL_AUX_PRECIOS).getResultList();
	}

	@Override
	public IdAuxPrecios getIdAuxPreciosById(Date fechIn, Date fechFin) 
	{
		IdAuxPrecios idAuxPrecios = new IdAuxPrecios();
		idAuxPrecios.setAuxPrecFechIni(fechIn);
		idAuxPrecios.setAuxPrecFechFin(fechFin);
		
		return em.find(IdAuxPrecios.class, idAuxPrecios);
	}

}
