package uy.com.matriz.persistance;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import uy.com.matriz.clases.domain.jpa.TipoCalle;
import uy.com.matriz.interfaces.persistance.IntTipoCalleDAO;

@Repository("tipoCalleDAO")
@Transactional
public class JPATiopCalleDAO implements IntTipoCalleDAO
{
    private static final String RECENT_TIPO_CALLE = "SELECT t FROM TipoCalle t";
    private static final String ALL_TIPO_CALLE ="SELECT t FROM TipoCalle t";
    @PersistenceContext
    private EntityManager em; 
    
    @Override
    public TipoCalle getTipoCalleById(int tpc)
    {
	
    	return em.find(TipoCalle.class, tpc);
    }

    @Override
    public TipoCalle getTipoCalleByNom(String tpc_nom)
    {
    	return em.find(TipoCalle.class, tpc_nom);
    }

    @Override
    public TipoCalle getTipoCalle()
    {
	return  em.find(TipoCalle.class, null);
    }

    @Override
    public void addTipoCalle(TipoCalle tpc)
    {
	em.persist(tpc);
	
    }

    @Override
    public void saveTipoCalle(TipoCalle tpc)
    {
	em.merge(tpc);
	
    }

    @Override
    public void deleteTipoCalle(TipoCalle tpc)
    {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void deleteTipoCalleById(int tpcId)
    {
	try 
	{
	    em.remove(getTipoCalleById(tpcId));
	} 
	catch(DataAccessException e) {}
	
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<TipoCalle> findAllTipoCalle()
    {
	// TODO Auto-generated method stub
	return (List<TipoCalle>) em.createQuery(ALL_TIPO_CALLE).getResultList();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<TipoCalle> getRecentTipoCalle()
    {
	// TODO Auto-generated method stub
	return (List<TipoCalle>) em.createQuery(RECENT_TIPO_CALLE).getResultList();
    }

}
