package uy.com.matriz.interfaces.persistance;

import java.util.List;

import uy.com.matriz.clases.domain.jpa.Direccion;

public interface IntDireccionDAO
{
	public Direccion getDireccionById(int dir);
	public Direccion getDireccion();
	
	public void addDireccion(Direccion direccion);
	public void saveDireccion(Direccion direccion);
	
	public void deleteDireccion(int dirId);
	
	public List<Direccion> findAllDireccion();
	public Direccion getDireccionByNom(String dirNom);
}
