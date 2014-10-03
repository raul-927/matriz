package uy.com.matriz.clases.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import uy.com.matriz.clases.domain.jpa.CategoriaUsuarios;
import uy.com.matriz.interfaces.services.ServiceIntCategoriaUsuarios;
import uy.com.matriz.interfaces.persistance.IntCategoriaUsuariosDAO;


@Transactional(propagation = Propagation.REQUIRED)
public class CategoriaUsuarioServiceImpl implements ServiceIntCategoriaUsuarios
{

	@Autowired
	IntCategoriaUsuariosDAO IntCategoriaUsuariosDAO;
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void addCategoriaUsuario(CategoriaUsuarios categoriaUsuario)
	{
		IntCategoriaUsuariosDAO.addCategoriaUsuarios(categoriaUsuario);

	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void saveCategoriaUsuarios(CategoriaUsuarios categoriaUsuario)
	{
		IntCategoriaUsuariosDAO.saveCategoriaUsuarios(categoriaUsuario);

	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public CategoriaUsuarios getCategoriaUsuario(int idCatUsr)
	{
		return IntCategoriaUsuariosDAO.getCategoriaUsuariosById(idCatUsr);
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public CategoriaUsuarios getCategoriaUsuario(String catUsrNom)
	{
		
		return IntCategoriaUsuariosDAO.getCategoriaUsuariosByNom(catUsrNom);
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public void deleteCategoria(int catUsrId)
	{
		IntCategoriaUsuariosDAO.deleteCategoriaUsuariosById(catUsrId);
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<CategoriaUsuarios> getAllCategoriasUsuario()
	{
		List<CategoriaUsuarios> catUsr = IntCategoriaUsuariosDAO.findAllCategoriaUsuarios();
		return catUsr;
	}
	
	@Override
	public CategoriaUsuarios getCategoriaUsuarioById(int catUsrId)
	{
		// TODO Auto-generated method stub
		return null;
	}
}
