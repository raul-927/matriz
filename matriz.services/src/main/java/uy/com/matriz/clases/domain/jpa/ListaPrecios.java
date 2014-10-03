package uy.com.matriz.clases.domain.jpa;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="lista_precios")
@XmlRootElement
public class ListaPrecios implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private IdListaPrecios idListaPrecios;
	
	@Column(name="list_prec_monto", unique= false)
	@Digits(integer= 3, fraction= 1, message= "Ingrese un nro valido hasta 999")
	private int listPrecMonto;
	
	@Column(name="list_prec_descripcion", unique= false)
	private String listPrecDesc;
	
	
	public IdListaPrecios getIdListaPrecios()
	{
		return this.idListaPrecios;
	}
	public void setIdListaPrecios(IdListaPrecios idListaPrecios)
	{
		this.idListaPrecios = idListaPrecios;
	}
	

	
	public int getListPrecMonto() 
	{
		return listPrecMonto;
	}
	public void setListPrecMonto(int listPrecMonto) 
	{
		this.listPrecMonto = listPrecMonto;
	}
	
	
	public String getListPrecDesc() 
	{
		return listPrecDesc;
	}
	public void setListPrecDesc(String listPrecDesc) 
	{
		this.listPrecDesc = listPrecDesc;
	}
}
