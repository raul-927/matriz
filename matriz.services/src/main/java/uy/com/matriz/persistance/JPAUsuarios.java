package uy.com.matriz.persistance;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import uy.com.matriz.clases.domain.jpa.Usuarios;
import uy.com.matriz.interfaces.persistance.IntUsuariosDAO;



@Repository("usuariosDAO")
@Transactional
public class JPAUsuarios implements IntUsuariosDAO
{
	private static final String ALL_USUARIOS ="SELECT U FROM Usuarios u";
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Usuarios getUsuariosById(int usr)
	{
		return  em.find(Usuarios.class, usr);
	}

	@Override
	public Usuarios getUsuarios()
	{
		return  em.find(Usuarios.class, null);
	}

	@Override
	public void addUsuarios(Usuarios usuarios)
	{
		em.persist(usuarios);
		
	}

	@Override
	public void saveUsuarios(Usuarios usuarios)
	{
		
		em.merge(usuarios);
	}

	@Override
	public void deleteUsuarios(int usrId)
	{
		
		try 
		{
			em.remove(getUsuariosById(usrId));
		} 
		catch(DataAccessException e) {}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuarios> findAllUsuarios()
	{
		return (List<Usuarios>) em.createQuery(ALL_USUARIOS).getResultList();
	}

	@Override
	public Usuarios getUsuariosByNom(String usrNom)
	{
		return em.find(Usuarios.class, usrNom);
	}

	@Override
	public Usuarios getUsuariosByNic(String usrNic)
	{
		return em.find(Usuarios.class, usrNic);
	}

	
}
