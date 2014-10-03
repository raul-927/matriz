package uy.com.matriz.persistance;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import uy.com.matriz.clases.domain.jpa.CategoriaUsuarios;
import uy.com.matriz.interfaces.persistance.IntCategoriaUsuariosDAO;


@Repository("categoriaUsuariosDao")
@Transactional
public class JPACategoriaUsuariosDAO implements IntCategoriaUsuariosDAO
{
	
	private static final String ALL_CATEGORIAS_USUARIO ="SELECT c FROM CategoriaUsuarios c";
	
	
	@PersistenceContext
	private EntityManager em; 

	@Override
	public CategoriaUsuarios getCategoriaUsuariosById(int tpc)
	{
		return em.find(CategoriaUsuarios.class, tpc); 
	}

	@Override
	public CategoriaUsuarios getCategoriaUsuariosByNom(String tpcNom)
	{
		return em.find(CategoriaUsuarios.class, tpcNom); 
	}

	@Override
	public CategoriaUsuarios getCategoriaUsuarios()
	{
		return  em.find(CategoriaUsuarios.class, null);
	}

	@Override
	public void addCategoriaUsuarios(CategoriaUsuarios ctu)
	{
		em.persist(ctu);

	}

	@Override
	public void saveCategoriaUsuarios(CategoriaUsuarios ctu)
	{
		em.merge(ctu);

	}

	@Override
	public void deleteCategoriaUsuarios(CategoriaUsuarios ctu)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCategoriaUsuariosById(int ctuId)
	{
		try 
		{
			em.remove(getCategoriaUsuariosById(ctuId));
		} 
		catch(DataAccessException e) {}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CategoriaUsuarios> findAllCategoriaUsuarios()
	{
		return (List<CategoriaUsuarios>) em.createQuery(ALL_CATEGORIAS_USUARIO).getResultList();
	}

	@Override
	public List<CategoriaUsuarios> getRecentCategoriaUsuarios()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
