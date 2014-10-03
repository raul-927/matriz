package uy.com.matriz.interfaces.services;

import java.util.List;

import uy.com.matriz.clases.domain.jpa.IdListaPrecios;
import uy.com.matriz.clases.domain.jpa.ListaPrecios;

public interface ServiceIntListaPrecios 
{
	public void addListaPrecios(ListaPrecios listaPrecios);
	
	public void updateListaPrecios(IdListaPrecios idListaPrecios);
	
	
	public void deleteListaPrecios(ListaPrecios listaPrecios);
	public void deleteListaPreciosById(IdListaPrecios idListaPrecios);
	  
	public ListaPrecios getListaPrecios(IdListaPrecios idListaPrecios);
	
	
	public List<ListaPrecios> getAllListaPrecios();
}
