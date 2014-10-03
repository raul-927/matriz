package uy.com.matriz.clases.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import uy.com.matriz.clases.domain.jpa.Categoria;
import uy.com.matriz.interfaces.persistance.IntMenuDAO;
import uy.com.matriz.interfaces.services.ServiceIntMenu;

@Transactional(propagation = Propagation.REQUIRED)
public class MenuServiceImpl implements ServiceIntMenu 
{
	@Autowired
	IntMenuDAO menuDAO;
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Categoria> getAllCategorias() 
	{
		
		return menuDAO.getAllCategorias();
	}

	@Override
	public List<Object[]> getAllResult() 
	{
		
		return menuDAO.getAllResult();
	}

}
