package uy.com.matriz.interfaces.persistance;

import java.util.List;

import uy.com.matriz.clases.domain.jpa.Categoria;
import uy.com.matriz.clases.domain.jpa.Productos;

public interface IntProductosDAO
{
	
	public void addProductos(Productos producto);
	public void updateProductos(Productos producto);
	public void deleteProductos(int prdId);
	
	public Productos getProdById(int prdId);
	public Productos getProductoByNom(String prdNom);
	
	public List<Productos> findAllProductos();
	public List<Productos>findProductosByCategoria(Categoria cat);
	public List<Productos>findProductosByIdCategoria(int catId);
	public List<Categoria>findAllCategorias();
}
