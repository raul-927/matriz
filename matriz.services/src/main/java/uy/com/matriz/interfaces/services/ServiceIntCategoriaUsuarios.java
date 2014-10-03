package uy.com.matriz.interfaces.services;

import java.util.List;

import uy.com.matriz.clases.domain.jpa.CategoriaUsuarios;

public interface ServiceIntCategoriaUsuarios
{
	
    void addCategoriaUsuario(CategoriaUsuarios categoriaUsuario);
    void saveCategoriaUsuarios(CategoriaUsuarios categoriaUsuario);
	  
    CategoriaUsuarios getCategoriaUsuario(int idCatUsr);
    
    
    CategoriaUsuarios getCategoriaUsuario(String catUsrNom);
    
    CategoriaUsuarios getCategoriaUsuarioById(int catUsrId);
    void deleteCategoria(int catid);
    
    List<CategoriaUsuarios> getAllCategoriasUsuario();
}
