package uy.com.matriz.interfaces.persistance;

import java.util.Date;
import java.util.List;

import uy.com.matriz.clases.domain.jpa.AuxPrecios;
import uy.com.matriz.clases.domain.jpa.IdAuxPrecios;

public interface IntAuxPreciosDAO 
{
	public void addIdAuxPrecios(IdAuxPrecios idAuxPrecios);
	public void addAuxPrecios(AuxPrecios auxPrecios);
	
	public void updateIdAuxPrecios(IdAuxPrecios idAuxPrecios);
	public void updateAuxPrecios(AuxPrecios auxPrecios);
	
	public void deleteIdAuxPrecios(Date fechIn, Date fechFin);
	public void deleteAuxPrecios(IdAuxPrecios idAuxPrecios);
	
	public AuxPrecios getAuxPreciosById(IdAuxPrecios idAuxPrecios);
	public IdAuxPrecios getIdAuxPreciosById(Date fechIn, Date fechFin);
	public List<AuxPrecios> getAllAuxPrecios();
}
