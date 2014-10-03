package uy.com.matriz.clases.services;

import static java.lang.Math.min;
import static java.util.Collections.reverse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import uy.com.matriz.clases.domain.jpa.TipoCalle;
import uy.com.matriz.interfaces.persistance.IntTipoCalleDAO;
import uy.com.matriz.interfaces.services.ServiceIntTipoCalle;

@Transactional(propagation = Propagation.REQUIRED)
public class TipoCalleServiceImpl implements ServiceIntTipoCalle
{

    @Autowired
    IntTipoCalleDAO tipoCalleDAO;
    
    
    @SuppressWarnings("unchecked")
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    @Override
    public List<TipoCalle> getRecentTipoCalles(int count)
    {
	List<TipoCalle> recentTipoCalle = (List<TipoCalle>) tipoCalleDAO.getTipoCalle();
	reverse (recentTipoCalle);
	return recentTipoCalle.subList(0, min(1,recentTipoCalle.size()));
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
    public void addTipoCalle(TipoCalle tipoCalle)
    {
	
    	tipoCalleDAO.addTipoCalle(tipoCalle);

    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
    public void saveTipoCalle(TipoCalle tipoCalle)
    {

    	tipoCalleDAO.saveTipoCalle(tipoCalle);

    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public TipoCalle getTipoCalle(int tpc)
    {
    	return tipoCalleDAO.getTipoCalleById(tpc);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public void startFollowing(TipoCalle follower, TipoCalle followee)
    {
	// TODO Auto-generated method stub

    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public TipoCalle getTipoCalle(String tpc_nom)
    {
    	return tipoCalleDAO.getTipoCalleByNom(tpc_nom);
    }

    @Override
    public TipoCalle getTipoCalleById(int tpc)
    {
    	return tipoCalleDAO.getTipoCalleById(tpc);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
    public void deleteTipoCalle(int tpcId)
    {
    	tipoCalleDAO.deleteTipoCalleById(tpcId);

    }

    @Override
    public List<TipoCalle> getAllTipoCalles()
    {
    	List<TipoCalle> tipoCalle = tipoCalleDAO.findAllTipoCalle(); 
	    return tipoCalle;
    }

}
