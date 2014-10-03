package uy.com.matriz.clases.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import uy.com.matriz.clases.domain.jpa.Usuarios;
import uy.com.matriz.interfaces.services.ServiceIntUsuarios;
import uy.com.matriz.interfaces.persistance.IntUsuariosDAO;


@Transactional(propagation = Propagation.REQUIRED)
public class UsuariosServiceImpl implements ServiceIntUsuarios
{
	@Autowired
	IntUsuariosDAO IntUsuariosDAO;
	
	
	
	@Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	
	public void addUsuarios(Usuarios usuarios)
	{
		
		IntUsuariosDAO.addUsuarios(usuarios);

	}

	@Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void saveUsuarios(Usuarios usuarios)
	{
		
		IntUsuariosDAO.saveUsuarios(usuarios);

	}

	@Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Usuarios getUsuarios(String usrNom)
	{
		return IntUsuariosDAO.getUsuariosByNom(usrNom);
	}

	@Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Usuarios getUsuariosById(int usrId)
	{
		return IntUsuariosDAO.getUsuariosById(usrId);
	}

	@Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void deleteUsuarios(int usrId)
	{
		IntUsuariosDAO.deleteUsuarios(usrId);

	}

	@Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Usuarios> getAllUsuarios()
	{
		
		 List<Usuarios> usuarios = IntUsuariosDAO.findAllUsuarios();
		 return usuarios;
	}

}
