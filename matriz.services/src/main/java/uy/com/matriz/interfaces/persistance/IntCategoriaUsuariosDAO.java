package uy.com.matriz.interfaces.persistance;

import java.util.List;

import uy.com.matriz.clases.domain.jpa.CategoriaUsuarios;

public interface IntCategoriaUsuariosDAO
{
   
    
    public CategoriaUsuarios getCategoriaUsuariosById(int tpc);
    public CategoriaUsuarios getCategoriaUsuariosByNom(String tpc_nom);
    public CategoriaUsuarios getCategoriaUsuarios();
    
    public void addCategoriaUsuarios(CategoriaUsuarios ctu);
    public void saveCategoriaUsuarios(CategoriaUsuarios ctu);
    
    
    public void deleteCategoriaUsuarios(CategoriaUsuarios ctu);
    public void deleteCategoriaUsuariosById(int ctuId);
    
    public List<CategoriaUsuarios> findAllCategoriaUsuarios();
    public List<CategoriaUsuarios> getRecentCategoriaUsuarios();
}
