package uy.com.matriz.interfaces.services;

import java.util.List;

import uy.com.matriz.clases.domain.jpa.Calles;

public interface ServiceIntCalle 
{

    void addCalle(Calles calle);
    void saveCalle(Calles calle);
	  
    Calles getCalle(int id);
    
    Calles getCalle(String callnom);
    
    Calles getCalleById(int callid);
    void deleteCalle(int callid);
    
    List<Calles> getAllCalles();

}
