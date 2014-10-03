package uy.com.matriz.interfaces.persistance;


import java.util.List;

import uy.com.matriz.clases.domain.jpa.Calles;

public interface IntCalleDAO 
{
	
	public Calles getCalleById(int call);
	public Calles getCalle();
	
	public void addCalle(Calles calle);
	public void saveCalle(Calles calle);
	
	public void deleteCalle(int call);
	
	public List<Calles> findAllCalles();
	public Calles getCalleByNom(String call_nom);

}
