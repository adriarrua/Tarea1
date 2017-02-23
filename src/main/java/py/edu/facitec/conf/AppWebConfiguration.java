package py.edu.facitec.conf;
/*
 * Adriana Arrua
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.controller.HomeController;

//estos son anotaciones , antes se configuraba en xml
@EnableWebMvc //Trabajar con la libreria MVC de Spring

// Clases que va gestionar a cargar nuestra aplicacion
@ComponentScan(basePackageClasses={HomeController.class}) //

public class AppWebConfiguration extends WebMvcConfigurerAdapter{
	
	
	@Bean
public InternalResourceViewResolver internalResourceViewResolver(){
	
	InternalResourceViewResolver resolver=new InternalResourceViewResolver();
	         //prefijo
	resolver.setPrefix("/WEB-INF/views/");
	         //sufijo
	resolver.setSuffix(".jsp");
	
	return resolver;
	
}

}
