package uy.com.matriz.clases.domain.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="aux_precios")
@XmlRootElement
public class AuxPrecios implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	
	@Column(name="aux_prec_id", unique=true)
	private int auxPrecId;
	
	@Column(name ="aux_prec_id_list")
	private ListaPrecios idListaPrecios;
	
	@EmbeddedId
	private IdAuxPrecios idAuxPrecios;
	
	
	public int getAuxPrecId() 
	{
		return auxPrecId;
	}
	public void setAuxPrecId(int auxPrecId) 
	{
		this.auxPrecId = auxPrecId;
	}
	
	
	public IdAuxPrecios getIdAuxPrecios()
	{
		return this.idAuxPrecios;
	}
	public void setIdAuxPrecios(IdAuxPrecios idAuxPrecios)
	{
		this.idAuxPrecios = idAuxPrecios;
	}
	

	public ListaPrecios getIdListaPrecios() 
	{
		return idListaPrecios;
	}
	public void setIdListaPrecios(ListaPrecios idListaPrecios) 
	{
		this.idListaPrecios = idListaPrecios;
	}
	
	
	
}
