package uy.com.matriz.clases.domain.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IdListaPrecios implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	@Column(name ="list_prec_id")
	private int idLista;
	
	@Column(name ="list_prec_id_prod")
	private int idProducto;
	
	public IdListaPrecios()
	{
		
	}
	public IdListaPrecios(int idLista, int idProducto) 
	{
		this.idLista = idLista;
		this.idProducto = idProducto;
	}
	
	
	
	public int getIdLista()
	{
		return this.idLista;
	}
	public void setIdLista(int idLista)
	{
		this.idLista = idLista;
	}
	
	
	
	public int getIdProducto()
	{
		return idProducto;
	}
	public void setIdProducto(int idProducto)
	{
		this.idProducto = idProducto;
	}

}
