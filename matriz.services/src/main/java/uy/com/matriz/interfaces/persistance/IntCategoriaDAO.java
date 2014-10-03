package uy.com.matriz.interfaces.persistance;


import java.util.List;

import uy.com.matriz.clases.domain.jpa.Categoria;

public interface IntCategoriaDAO 
{
	
	public void addCategoria(Categoria categoria);
	public void saveCategoria(Categoria categoria);
	
	
	public void deleteCategoria(int cat);
	
	public List<Categoria> findAllCategorias();
	
	public Categoria getCategoriaByNom(String cat_nom);
	public Categoria getCategoriaById(int cat);
	public Categoria getCategoria();
	

	
	

}
