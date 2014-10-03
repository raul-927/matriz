package uy.com.matriz.clases.domain.jpa;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class IdAuxPrecios implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "aux_prec_fech_ini")
	@Temporal(TemporalType.DATE)
	private Date auxPrecFechIni; 
	
	@Column(name = "aux_prec_fech_fin")
	@Temporal(TemporalType.DATE)
	private Date auxPrecFechFin;
	
	public IdAuxPrecios() 
	{
		
	}
	
	public Date getAuxPrecFechIni()
	{
		return this.auxPrecFechIni;
	}
	
	public void setAuxPrecFechIni(Date auxPrecFechIni)
	{
		this.auxPrecFechIni = auxPrecFechIni;
	}
	
	
	
	public Date getAuxPrecFechFin()
	{
		return this.auxPrecFechFin;
	}
	
	public void setAuxPrecFechFin(Date auxPrecFechFin)
	{
		this.auxPrecFechFin = auxPrecFechFin;
	}

}
