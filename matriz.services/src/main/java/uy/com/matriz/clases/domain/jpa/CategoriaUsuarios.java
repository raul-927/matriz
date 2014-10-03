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
@Table(name="categoriausuario")
@XmlRootElement
public class CategoriaUsuarios implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int catUsrId;
	private String catUsrNom;
	
	@Id
    @Column(name="cat_usr_id", unique=true)
    @Digits(integer= 3, fraction= 1, message = "Ingrese un nro valido hasta 999")
    @NotNull
	public int getCatUsrId()
	{
		return this.catUsrId;
	}
	public void setCatUsrId(int catUsrId)
	{
		this.catUsrId = catUsrId;
	}
	
	@Column(name="cat_usr_nom", unique=true)
	@Size(min = 3, max =20, message = "Nombre es entre 3 y 20 caracteres")
	public String getCatUsrNom()
	{
		return catUsrNom;
	}
	public void setCatUsrNom(String catUsrNom)
	{
		this.catUsrNom = catUsrNom;
	}
}
