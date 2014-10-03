package uy.com.matriz.interfaces.services;

import java.util.List;

import uy.com.matriz.clases.domain.jpa.Direccion;;

public interface ServiceIntDireccion
{
	
	void addDireccion(Direccion direccion);
    void saveDireccion(Direccion direccion);
	  
    Direccion getDireccion(String dirNom);
    Direccion getDireccionById(int dirId);
    
    void deleteDireccion(int dirId);
    
    List<Direccion> getAllDireccion();
}
