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
@Table(name="tipo_calle")
@XmlRootElement
public class TipoCalle implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idTpoCalle;
    private String descTpoCalle;
	
    @Id
    @Column(name="id_tpo_calle", unique=true)
    @Digits(integer= 3, fraction= 1, message = "Ingrese un nro valido hasta 999")
    @NotNull
    public int getIdTpoCalle()
    {
	return idTpoCalle;
    }
    
    public void setIdTpoCalle(int idTpoCalle)
    {
    	this.idTpoCalle = idTpoCalle;
    }
    
    
    @Column(name="des_tpo_calle", unique=true)
    @Size(min = 3, max =20, message = "Descripcion es entre 3 y 20 caracteres")
    public String getDescTpoCalle()
    {
    	return this.descTpoCalle;
    }
    public void setDescTpoCalle(String descTpoCalle)
    {
    	this.descTpoCalle = descTpoCalle;
    }	
}
