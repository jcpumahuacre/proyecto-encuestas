package org.paquetes.controlador;

import org.paquetes.servicios.TipopreguntaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TipopreguntaControlador {

	@Autowired
	private TipopreguntaServicio tipopreguntaServicio;
	
	@GetMapping("/tipoalternativas")
	public String datos(){
		return tipopreguntaServicio.findAll().toString();
	}
}
