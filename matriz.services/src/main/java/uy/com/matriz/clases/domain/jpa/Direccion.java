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
@Table(name="direccion")
@XmlRootElement
public class Direccion implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int dirId;
    private Calles dirCalle;
    private int dirNum;
    private String dirAp;
    private int dirNumAp;
    private Calles dirCalle1;
    private Calles dirCalle2;
    
    
    @Id
    @Column(name="dir_id", unique=true)
    @Digits(integer= 3, fraction= 1, message = "Ingrese un nro valido hasta 999")
    @NotNull
    public int getDirId()
    {
	return this.dirId;
    }
    
    public void setDirId(int id)
    {
    	this.dirId = id;
    }
    
    
    @ManyToOne
    @JoinColumn(name ="dir_calle")
    public Calles getDirCalle()
    {
	return dirCalle;
    }
    public void setDirCalle(Calles dirCalle)
    {
    	this.dirCalle = dirCalle;
    }
    
    
    @Column(name="dir_num", unique=true)
    @Digits(integer= 4, fraction= 1, message = "Ingrese un nro valido hasta 9999")
    @NotNull
    public int getDirNum()
    {
    	return dirNum;
    }
    public void setDirNum(int dirNum)
    {
    	this.dirNum = dirNum;
    }
    
    
    @Column(name="dir_ap", unique=true)
    @Size(min = 3, max =40, message = "Nombre es entre 3 y 40 caracteres")
    public String getDirAp()
    {
    	return this.dirAp;
    }
    public void setDirAp(String dirAp)
    {
    	this.dirAp = dirAp;
    }
    
    @Column(name="dir_num_ap", unique=true)
    @Digits(integer= 3, fraction= 1, message = "Ingrese un nro valido hasta 999")
    public int getDirNumAp()
    {
    	return dirNumAp;
    }
    public void setDirNumAp(int dirNumAp)
    {
    	this.dirNumAp = dirNumAp;
    }
    
    @ManyToOne
    @JoinColumn(name ="dir_calle_1")
    public Calles getDirCalle1()
    {
    	return dirCalle1;
    }
    
    public void setDirCalle1(Calles dirCalle1)
    {
	this.dirCalle1 = dirCalle1;
    }
    
    
    @ManyToOne
    @JoinColumn(name ="dir_calle_2")
    public Calles getDirCalle2()
    {
    	return dirCalle2;
    }
    
    public void setDirCalle2(Calles dirCalle2)
    {
    	this.dirCalle2 = dirCalle2;
    }
    	
}
