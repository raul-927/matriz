package uy.com.matriz.interfaces.services;

import java.util.List;
import uy.com.matriz.clases.domain.jpa.Categoria;

public interface ServiceIntMenu 
{
	
    public List<Categoria> getAllCategorias();
  
    public List<Object[]> getAllResult();
}
