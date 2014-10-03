package uy.com.matriz.interfaces.persistance;

import java.util.List;

import uy.com.matriz.clases.domain.jpa.TipoCalle;

public interface IntTipoCalleDAO
{
    
    public TipoCalle getTipoCalleById(int tpc);
    public TipoCalle getTipoCalleByNom(String tpc_nom);
    public TipoCalle getTipoCalle();
    
    public void addTipoCalle(TipoCalle tpc);
    public void saveTipoCalle(TipoCalle tpc);
    
    
    public void deleteTipoCalle(TipoCalle tpc);
    public void deleteTipoCalleById(int tpcId);
    
    public List<TipoCalle> findAllTipoCalle();
    public List<TipoCalle> getRecentTipoCalle();

}
