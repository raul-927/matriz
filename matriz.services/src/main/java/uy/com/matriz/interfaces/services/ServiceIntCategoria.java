package uy.com.matriz.interfaces.services;

import java.util.List;

import uy.com.matriz.clases.domain.jpa.Categoria;

public interface ServiceIntCategoria 
{
    List<Categoria> getRecentCategorias(int count);
    void addCategoria(Categoria categoria);
    void saveCategoria(Categoria categoria);
	  
    Categoria getCategoria(int id);
    void startFollowing(Categoria follower, Categoria followee);
    
    Categoria getCategoria(String catnom);
    
    Categoria getCategoriaById(int catid);
    void deleteCategoria(int catid);
    
    List<Categoria> getAllCategorias();
    

}
