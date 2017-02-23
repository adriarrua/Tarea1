package py.edu.facitec.controller;
/*
 * Adriana Arrua
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //indica que se trata de una clase que 
             //gestionara las peticiones  y generra respuestas en la vista
public class HomeController {
	
		//mapea una url para gestionar
		@RequestMapping("/home")
		public String index(){
		System.out.println("Pagina cargada");
		          
		      //nombre del archivo
		return "hello-world";
	}

}
