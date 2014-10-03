package uy.com.matriz.interfaces.services;

import java.util.List;

import uy.com.matriz.clases.domain.jpa.Usuarios;

public interface ServiceIntUsuarios
{
	
	void addUsuarios(Usuarios usuarios);
    void saveUsuarios(Usuarios usuarios);
	  
    Usuarios getUsuarios(String usrNom);
    Usuarios getUsuariosById(int usrId);
    
    void deleteUsuarios(int usrId);
    
    List<Usuarios> getAllUsuarios();
    
}
