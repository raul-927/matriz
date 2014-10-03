package uy.com.matriz.clases.domain.jpa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;




@Entity
@Table(name="categorias")
@XmlRootElement
public class Categoria implements Serializable
{
	
    private static final long serialVersionUID = 1L;

    private String nombre;
    private int id;
	
    //------Id Categoria------------------
	
    public void setId(int id) 
    {
    	this.id = id;
    }
    
    @Id
    @Column(name="cat_id", unique=true)
    @Digits(integer= 3, fraction= 1, message = "Ingrese un nro valido hasta 999")
    @NotNull
    public int getId() 
    {
    	return id;	
    }	
    //--------Nombre de Categoria--------------
    
    public void setNombre(String nombre) 
    {
    	this.nombre = nombre;	
    }
    
    @Column(name="cat_nom", unique=true)
    @Size(min = 3, max =20, message = "Nombre es entre 3 y 20 caracteres")
    public String getNombre()
    {
    	return this.nombre;
    }
}