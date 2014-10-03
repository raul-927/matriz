package uy.com.matriz.interfaces.services;

import java.util.List;

import uy.com.matriz.clases.domain.jpa.TipoCalle;

public interface ServiceIntTipoCalle
{
    
    List<TipoCalle> getRecentTipoCalles(int count);
    void addTipoCalle(TipoCalle tipoCalle);
    void saveTipoCalle(TipoCalle tipoCalle);
	  
    TipoCalle getTipoCalle(int id);
    void startFollowing(TipoCalle follower, TipoCalle followee);
    
    TipoCalle getTipoCalle(String tipoCalleNom);
    
    TipoCalle getTipoCalleById(int tipoCalleId);
    void deleteTipoCalle(int tipoCalleId);
    
    List<TipoCalle> getAllTipoCalles();

}
