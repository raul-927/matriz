package uy.com.matriz.interfaces.persistance;

import java.util.List;

import uy.com.matriz.clases.domain.jpa.Usuarios;

public interface IntUsuarioDAO
{
	public Usuarios getUsuariosById(int usr);
	public Usuarios getUsuarios();
	
	public void addUsuarios(Usuarios usuarios);
	public void saveUsuarios(Usuarios usuarios);
	
	public void deleteUsuarios(int usrId);
	
	public List<Usuarios> findAllUsuarios();
	public Usuarios getUsuariosByNom(String usrNom);
	public Usuarios getUsuariosByNic(String usrNic);
}
