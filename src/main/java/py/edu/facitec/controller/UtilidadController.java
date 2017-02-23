package py.edu.facitec.controller;
/*
 * Adriana Arrua
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
     @Controller // indica que se trata de una clase que gestioanara las
                 // peticiones y genera respuestas en la vista
public class UtilidadController {
    	 //mapea una url para gestionear
    	 @RequestMapping ("/comollegar")
    	 public String index(){
    		 System.out.println("Pagina cargada");
    		 
    		 
    		 //nombre del archivo
    		 return "comollegar";
    		 
    	 }
    	
	
	

}
