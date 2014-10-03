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
@Table(name="productos")
@XmlRootElement
public class Productos implements Serializable
{
	private static final long serialVersionUID = 1L;

    private String prdNom;
    private int prdId;
    private Categoria prdCat;
    private int prdPrec;
    
    @Column(name="prd_nom", unique=true)
    @Size(min = 3, max =100, message = "Nombre es entre 3 y 100 caracteres")
	public String getPrdNom() 
	{
		return prdNom;
	}
	public void setPrdNom(String prdNom) 
	{
		this.prdNom = prdNom;
	}
	
	@Id
    @Column(name="prd_id", unique=true)
    @Digits(integer= 3, fraction= 1, message = "Ingrese un nro valido hasta 999")
    @NotNull
	public int getPrdId() 
	{
		return prdId;
	}
	public void setPrdId(int prdId) 
	{
		this.prdId = prdId;
	}
	
	@ManyToOne
    @JoinColumn(name ="prd_cat")
	public Categoria getPrdCat() 
	{
		return prdCat;
	}
	public void setPrdCat(Categoria prdCat) 
	{
		this.prdCat = prdCat;
	}
	
	@Column(name="prd_prec", unique=false)
    @Digits(integer= 3, fraction= 1, message = "Ingrese un nro valido hasta 999")
    @NotNull
	public int getPrdPrec() 
	{
		return prdPrec;
	}
	public void setPrdPrec(int prdPrec) 
	{
		this.prdPrec = prdPrec;
	}
    
    
    
}
