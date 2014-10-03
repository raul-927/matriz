package uy.com.matriz.interfaces.services;

import java.util.List;

import uy.com.matriz.clases.domain.jpa.Categoria;
import uy.com.matriz.clases.domain.jpa.Productos;

public interface ServiceIntProductos
{
	
    public void addProductos(Productos productos);
    public void updateProductos(Productos productos);
    public void deleteProductos(int prdId);
    
    public Productos getProductos(String prdNom);
    public Productos getProductosById(int prdId);
    
    public List<Productos> getAllProductos();
    public List<Productos> getProductosByCategoria(Categoria cat);
    public List<Productos> getProductosByIdCategoria(int catId);
    public List<Categoria> getAllCategorias();
}
