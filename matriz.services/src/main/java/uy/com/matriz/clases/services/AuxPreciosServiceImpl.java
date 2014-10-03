package uy.com.matriz.clases.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import uy.com.matriz.clases.domain.jpa.AuxPrecios;
import uy.com.matriz.clases.domain.jpa.IdAuxPrecios;
import uy.com.matriz.interfaces.persistance.IntAuxPreciosDAO;
import uy.com.matriz.interfaces.services.ServiceIntAuxPrecios;


@Transactional(propagation = Propagation.REQUIRED)
public class AuxPreciosServiceImpl implements ServiceIntAuxPrecios 
{
	@Autowired
	IntAuxPreciosDAO intAuxPreciosDAO;
	
	
	public AuxPreciosServiceImpl() 
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void addIdAuxPrecios(IdAuxPrecios idAuxPrecios) 
	{
		intAuxPreciosDAO.addIdAuxPrecios(idAuxPrecios);

	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void addAuxPrecios(AuxPrecios auxPrecios) 
	{
		intAuxPreciosDAO.addAuxPrecios(auxPrecios);

	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void updateIdAuxPrecios(IdAuxPrecios idAuxPrecios) 
	{
		intAuxPreciosDAO.updateIdAuxPrecios(idAuxPrecios);

	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void updateAuxPrecios(AuxPrecios auxPrecios)
	{
		intAuxPreciosDAO.updateAuxPrecios(auxPrecios);

	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void deleteIdAuxPrecios(IdAuxPrecios idAuxPrecios) 
	{
		Date fechIn = idAuxPrecios.getAuxPrecFechIni();
		Date fechFin = idAuxPrecios.getAuxPrecFechFin();
		intAuxPreciosDAO.deleteIdAuxPrecios(fechIn, fechFin);

	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void deleteAuxPrecios(IdAuxPrecios idAuxPrecios) 
	{
		
		intAuxPreciosDAO.deleteAuxPrecios(idAuxPrecios);

	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IdAuxPrecios getIdAuxPrecios(IdAuxPrecios idAuxPrecios) 
	{
		
		Date fechIn = idAuxPrecios.getAuxPrecFechIni();
		Date fechFin = idAuxPrecios.getAuxPrecFechFin();
		return intAuxPreciosDAO.getIdAuxPreciosById(fechIn, fechFin);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AuxPrecios getAuxPrecios(IdAuxPrecios idAuxPrecios) 
	{
		
		return intAuxPreciosDAO.getAuxPreciosById(idAuxPrecios);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AuxPrecios> getAllAuxPrecios() 
	{
		
		return intAuxPreciosDAO.getAllAuxPrecios();
	}

}
