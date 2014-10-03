package uy.com.matriz.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import uy.com.matriz.interfaces.services.ServiceIntCalle;
import uy.com.matriz.interfaces.services.ServiceIntCategoria;
import uy.com.matriz.interfaces.services.ServiceIntCategoriaUsuarios;
import uy.com.matriz.interfaces.services.ServiceIntDireccion;

import uy.com.matriz.interfaces.services.ServiceIntTipoCalle;
import uy.com.matriz.interfaces.services.ServiceIntUsuarios;

//@Configuration
@SuppressWarnings("unused")
public class Config 
{
	
	private static final String databasePlatform = "MySQLDialect";
	private static final String serviceUrl = "http://localhost:8092/matriz/matriz.";

	//@Bean
	public DriverManagerDataSource dataSource()
	{
		DriverManagerDataSource dtSource = new DriverManagerDataSource();
		
		dtSource.setDriverClassName("com.mysql.jdbc.Driver");
		dtSource.setUrl("jdbc:mysql://localhost/matriz");
		dtSource.setUsername("root");
		dtSource.setPassword("");
		
		return dtSource;
	}
	
	
	//@Bean
	public HibernateJpaVendorAdapter jpaVendorAdapter()
	{
		HibernateJpaVendorAdapter hjva = new HibernateJpaVendorAdapter();
			
		hjva.setDatabase(Database.MYSQL);
		hjva.setShowSql(true);
		hjva.setGenerateDdl(false);
		hjva.setDatabasePlatform(databasePlatform);
		
		return hjva;
	}
	
	//@Bean	
	public LocalContainerEntityManagerFactoryBean emf()
	{
		LocalContainerEntityManagerFactoryBean lem = new LocalContainerEntityManagerFactoryBean();
		lem.setDataSource(dataSource());
		lem.setJpaVendorAdapter(jpaVendorAdapter());
		return lem;
		
	}
	
	//@Bean
	public PersistenceAnnotationBeanPostProcessor PersistenceAnnotationBeanPostProcessor()
	{
		PersistenceAnnotationBeanPostProcessor pbpp = new PersistenceAnnotationBeanPostProcessor();
		
		return pbpp;
	}
	
	//@Bean
	public JpaTransactionManager TransactionManager()
	{
		JpaTransactionManager jpa = new JpaTransactionManager();
		jpa.setEntityManagerFactory((EntityManagerFactory) emf());
		
		return jpa;
	}
	
	//@Bean
	public HttpInvokerProxyFactoryBean usuarioService()
	{
		HttpInvokerProxyFactoryBean hpfb = new HttpInvokerProxyFactoryBean();
		hpfb.setServiceInterface(ServiceIntUsuarios.class);
		hpfb.setServiceUrl(serviceUrl +"usuario");
		
		return hpfb; 
	}
	
	//@Bean
	public HttpInvokerProxyFactoryBean calleService()
	{
		HttpInvokerProxyFactoryBean hpfb = new HttpInvokerProxyFactoryBean();
		hpfb.setServiceInterface(ServiceIntCalle.class);
		hpfb.setServiceUrl(serviceUrl +"calle");
		
		return hpfb;  
	}
	
	//@Bean
	public HttpInvokerProxyFactoryBean categoriaService()
	{
		HttpInvokerProxyFactoryBean hpfb = new HttpInvokerProxyFactoryBean();
		hpfb.setServiceInterface(ServiceIntCategoria.class);
		hpfb.setServiceUrl(serviceUrl +"categoria");
		
		return hpfb;  
	}
	
	
	//@Bean
	public HttpInvokerProxyFactoryBean tipoCalleService()
	{
		HttpInvokerProxyFactoryBean hpfb = new HttpInvokerProxyFactoryBean();
		hpfb.setServiceInterface(ServiceIntTipoCalle.class);
		hpfb.setServiceUrl(serviceUrl +"tipocalle");
		
		return hpfb;  
	}
	
	
	//@Bean
	public HttpInvokerProxyFactoryBean direccionService()
	{
		HttpInvokerProxyFactoryBean hpfb = new HttpInvokerProxyFactoryBean();
		hpfb.setServiceInterface(ServiceIntDireccion.class);
		hpfb.setServiceUrl(serviceUrl +"direccion");
		
		return hpfb;  
	}
	
	
	//@Bean
	public HttpInvokerProxyFactoryBean categoriaUsuarioService()
	{
		HttpInvokerProxyFactoryBean hpfb = new HttpInvokerProxyFactoryBean();
		hpfb.setServiceInterface(ServiceIntCategoriaUsuarios.class);
		hpfb.setServiceUrl(serviceUrl +"categoriausuario");
		
		return hpfb;  
	}
		
}
