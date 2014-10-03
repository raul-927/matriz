package uy.com.matriz.clases.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import uy.com.matriz.clases.domain.jpa.IdListaPrecios;
import uy.com.matriz.clases.domain.jpa.ListaPrecios;
import uy.com.matriz.interfaces.persistance.IntListaPreciosDAO;
import uy.com.matriz.interfaces.services.ServiceIntListaPrecios;


//@Transactional(propagation = Propagation.REQUIRED)
public class ListaPreciosServiceImpl implements ServiceIntListaPrecios 
{
	
	IntListaPreciosDAO intListaPreciosDAO;
	
	
	@Override
	//@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void addListaPrecios(ListaPrecios listaPrecios) 
	{
		intListaPreciosDAO.addListaPrecios(listaPrecios);

	}

	@Override
	//@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void updateListaPrecios(IdListaPrecios idListaPrecios) 
	{
		intListaPreciosDAO.updateListaPreciosById(idListaPrecios);

	}

	@Override
	//@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void deleteListaPrecios(ListaPrecios listaPrecios) 
	{
		intListaPreciosDAO.deleteListaPrecios(listaPrecios);

	}

	@Override
	//@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void deleteListaPreciosById(IdListaPrecios idListaPrecios) 
	{
		intListaPreciosDAO.deleteListaPreciosById(idListaPrecios);

	}

	@Override
	//@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ListaPrecios getListaPrecios(IdListaPrecios idListaPrecios) 
	{
		// TODO Auto-generated method stub
		return intListaPreciosDAO.getListaPreciosById(idListaPrecios);
	}

	@Override
	//@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ListaPrecios> getAllListaPrecios() 
	{
		// TODO Auto-generated method stub
		return intListaPreciosDAO.getAllListaPrecios();
	}

}
