package org.paquetes.controlador;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class HomeControlador {

	
	@RequestMapping("/")
	public String Bienvenida(){
		return "Bienvenido al proyecto de Encuestas";
	}
	
}
