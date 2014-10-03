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
@Table(name="usuarios")
@XmlRootElement
public class Usuarios implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int usrId;
    private CategoriaUsuarios usrCat;
    private int dni;
    private String usrNom;
    private String usrAp;
    private Direccion dirId;
    private int usrTel;
    private int usrCel;
    private String usrMail;
    private String usrNic;
    private String usrPass;
    
    
    //----id-------------------
    
    @Id
    @Column(name="usr_id", unique=true)
    @Digits(integer= 3, fraction= 1, message = "Ingrese un nro valido hasta 999")
    @NotNull
    public int getUsrId()
    {
        return usrId;
    }
    public void setUsrId(int id)
    {
        this.usrId = id;
    }
    
    
    //-------categoria-------------
    
    @ManyToOne
    @JoinColumn(name ="usr_cat_id")
    public CategoriaUsuarios getUsrCat()
    {
        return usrCat;
    }
    
    public void setUsrCat(CategoriaUsuarios categoria)
    {
        this.usrCat = categoria;
    }
    
    
    //--------dni-----------------------
    
    @Column(name="usr_dni", unique=true)
    @Digits(integer= 10, fraction= 1, message = "Ingrese un nro valido hasta 9999999999")
    @NotNull
    public int getDni()
    {
        return dni;
    }
    public void setDni(int dni)
    {
        this.dni = dni;
    }
    
    
    //--------nombre---------------------
    
    @Column(name="usr_nom", unique=false)
    @Size(min = 3, max =20, message = "Escriba un Nombre entre 3 y 20 caracteres")
    public String getUsrNom()
    {
        return usrNom;
    }
    public void setUsrNom(String usrNom)
    {
        this.usrNom = usrNom;
    }
    
    
    //---------apellido-------------------
    
    @Column(name="usr_ap", unique=false)
    @Size(min = 3, max =20, message = "Escriba un Apellido entre 3 y 20 caracteres")
    public String getUsrAp()
    {
        return usrAp;
    }
    public void setUsrAp(String usrAp)
    {
        this.usrAp = usrAp;
    }
    
    
    //----------dirId-------------------
    
    @ManyToOne
    @JoinColumn(name ="usr_dir_id")
    public Direccion getDirId()
    {
        return dirId;
    }
    public void setDirId(Direccion dirId)
    {
        this.dirId = dirId;
    }
    
    
    //------telefono----------------
    
    @Column(name="usr_tel", unique=true)
    @Digits(integer= 10, fraction= 1, message = "Ingrese un nro valido hasta 9999999999")
    @NotNull
    public int getUsrTel()
    {
        return usrTel;
    }
    public void setUsrTel(int usrTel)
    {
        this.usrTel = usrTel;
    }
    
    
    //----------celular-------------------
    
    @Column(name="usr_cel", unique=true)
    @Digits(integer= 10, fraction= 1, message = "Ingrese un nro valido hasta 9999999999")
    @NotNull
    public int getUsrCel()
    {
        return usrCel;
    }
    public void setUsrCel(int usrCel)
    {
        this.usrCel = usrCel;
    }
    
    
    //-----------email----------------------
    
    @Column(name="usr_mail", unique=false)
    @Size(min = 3, max =50, message = "Escriba un Mail entre 3 y 50 caracteres")
    @NotNull(message ="Debe ingresar un mail")
    public String getUsrMail()
    {
        return usrMail;
    }
    public void setUsrMail(String usrMail)
    {
        this.usrMail = usrMail;
    }
    
    
    //----------nic----------------
    
    @Column(name="usr_nic", unique=false)
    @Size(min = 3, max = 8, message = "Escriba un Nic entre 3 y 8 caracteres")
    @NotNull(message ="Debe ingresar un mail")
    public String getUsrNic()
    {
        return this.usrNic;
    }
    public void setUsrNic(String usrNic)
    {
        this.usrNic = usrNic;
    }
    
    
    //-------pass--------------------
    
    @Column(name="usr_pass", unique=false)
    
    @NotNull(message ="Debe ingresar un Password")
    public String getUsrPass()
    {
        return this.usrPass;
    }
    public void setUsrPass(String usrPass)
    {
        this.usrPass = usrPass;
    }
}
