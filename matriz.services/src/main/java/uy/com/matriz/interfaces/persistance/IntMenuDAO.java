package uy.com.matriz.interfaces.persistance;

import java.util.List;
import uy.com.matriz.clases.domain.jpa.Categoria;

public interface IntMenuDAO 
{
	
	public List<Categoria> getAllCategorias();
	
	public List<Object[]> getAllResult();
	
}