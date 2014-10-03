package uy.com.matriz.interfaces.persistance;

import java.util.List;



import org.springframework.stereotype.Component;

import uy.com.matriz.clases.domain.jpa.ListaPrecios;
import uy.com.matriz.clases.domain.jpa.IdListaPrecios;


public interface IntListaPreciosDAO 
{
	public void addListaPrecios(ListaPrecios listaPrecios);
	
	
	public void updateListaPrecios(ListaPrecios listaPrecios);
	public void updateListaPreciosById(IdListaPrecios idListaPrecios);
	
	
	public void deleteListaPrecios(ListaPrecios listaPrecios);
	public void deleteListaPreciosById(IdListaPrecios idListaPrecios);
	
	public ListaPrecios getListaPreciosById(IdListaPrecios idListaPrecios);
	
	public List<ListaPrecios> getAllListaPrecios();

}
