package uy.com.matriz.clases.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import uy.com.matriz.clases.domain.jpa.Direccion;
import uy.com.matriz.interfaces.persistance.IntDireccionDAO;
import uy.com.matriz.interfaces.services.ServiceIntDireccion;


@Transactional(propagation = Propagation.REQUIRED)
public class DireccionServiceImpl implements ServiceIntDireccion
{
	
	@Autowired
	IntDireccionDAO intDireccionDAO;
	
	
	@Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void addDireccion(Direccion direccion)
	{
		
		intDireccionDAO.addDireccion(direccion);

	}

	@Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void saveDireccion(Direccion direccion)
	{
		intDireccionDAO.saveDireccion(direccion);

	}

	@Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Direccion getDireccion(String dirNom)
	{
		
		return intDireccionDAO.getDireccionByNom(dirNom);
	
	}

	@Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Direccion getDireccionById(int dirId)
	{
		
		return intDireccionDAO.getDireccionById(dirId);
	
	}

	@Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void deleteDireccion(int dirId)
	{
		
		intDireccionDAO.deleteDireccion(dirId);

	}

	@Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Direccion> getAllDireccion()
	{
		List<Direccion> direccion = intDireccionDAO.findAllDireccion();
		return direccion;
	}

}
