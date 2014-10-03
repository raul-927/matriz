package uy.com.matriz.clases.domain.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="calles")
@XmlRootElement
public class Calles implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int calleId;
    private String calleNom;
    private TipoCalle tipoCalle;
    
    
    @Id
    @Column(name="id_calle", unique=true)
    @Digits(integer= 3, fraction= 1, message = "Ingrese un nro valido hasta 999")
    @NotNull
    public int getCalleId()
    {
        return this.calleId;
    }
    public void setCalleId(int calleId)
    {
        this.calleId = calleId;
    }
    
    @Column(name="nom_calle", unique=true)
    @Size(min = 3, max =60, message = "Nombre es entre 3 y 60 caracteres")
    public String getCalleNom()
    {
        return this.calleNom;
    }
    public void setCalleNom(String calleNom)
    {
        this.calleNom = calleNom;
    }
    
    @ManyToOne
    @JoinColumn(name ="tipo_calle")
	public TipoCalle getTipoCalle()
	{
		return tipoCalle;
	}
	public void setTipoCalle(TipoCalle tipoCalle)
	{
		this.tipoCalle = tipoCalle;
	}
    
}
