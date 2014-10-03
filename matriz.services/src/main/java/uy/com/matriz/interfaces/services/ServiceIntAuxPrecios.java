package uy.com.matriz.interfaces.services;

import java.util.List;


import uy.com.matriz.clases.domain.jpa.AuxPrecios;
import uy.com.matriz.clases.domain.jpa.IdAuxPrecios;

public interface ServiceIntAuxPrecios 
{
	
	public void addIdAuxPrecios(IdAuxPrecios idAuxPrecios);
	public void addAuxPrecios(AuxPrecios auxPrecios);
	
	public void updateIdAuxPrecios(IdAuxPrecios idAuxPrecios);
	public void updateAuxPrecios(AuxPrecios auxPrecios);
	
	public void deleteIdAuxPrecios(IdAuxPrecios idAuxPrecios);
	public void deleteAuxPrecios(IdAuxPrecios idAuxPrecios);
	  
	public IdAuxPrecios getIdAuxPrecios(IdAuxPrecios idAuxPrecios);
	public AuxPrecios getAuxPrecios(IdAuxPrecios idAuxPrecios);
	
	public List<AuxPrecios> getAllAuxPrecios();
	
}
