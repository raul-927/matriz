package uy.com.matriz.clases.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import uy.com.matriz.clases.domain.jpa.Calles;
import uy.com.matriz.interfaces.persistance.IntCalleDAO;
import uy.com.matriz.interfaces.services.ServiceIntCalle;


@Transactional(propagation = Propagation.REQUIRED)
public class CalleServiceImpl implements ServiceIntCalle
{

	@Autowired
	IntCalleDAO IntCalleDAO;
	
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void addCalle(Calles calle)
	{
		IntCalleDAO.addCalle(calle);
	    
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void saveCalle(Calles calle) 
	{
		
		IntCalleDAO.saveCalle(calle);
		
	}

	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public Calles getCalle(int id) 
	{
		
		return IntCalleDAO.getCalleById(id);
	}

	@Override
	public Calles getCalle(String callnom) 
	{
		
		return IntCalleDAO.getCalleByNom(callnom);
	}
	
	@Override
	public Calles getCalleById(int callid) 
	{
		return IntCalleDAO.getCalleById(callid);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void deleteCalle(int callid) 
	{
		IntCalleDAO.deleteCalle(callid);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Calles> getAllCalles() 
	{
	    List<Calles> calles = IntCalleDAO.findAllCalles(); 
	    return calles;
	}

}
