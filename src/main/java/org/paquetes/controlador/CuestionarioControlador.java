package org.paquetes.controlador;

import java.util.List;

import org.paquetes.modelo.Cuestionario;
import org.paquetes.servicios.CuestionarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class CuestionarioControlador {
	@Autowired
	private CuestionarioServicio cuestionarioServicio;
	
	// Listar todos los Cuestionarios
	
	@RequestMapping("/Cuestionarios")
	public List<Cuestionario> findAll(){
		return cuestionarioServicio.findAll();
	}
	
	
	//Guardar Cuestionario
	
	@RequestMapping(method=RequestMethod.POST,value="/guardarCuestionario")
	public Cuestionario saveCuestionario(@RequestBody Cuestionario cuestionario ){
		cuestionarioServicio.saveCuestionario(cuestionario);
		return cuestionario;
	}
	
	
	// Encontrar Cuestionario por ID
	
	@RequestMapping(method=RequestMethod.GET,value="/encontrarCuestionario")
	public Cuestionario findCuestionario(@RequestParam int id ){	
		return cuestionarioServicio.findCuestionario(id);
	}

	
	// Actualizar Cuestionario por ID

	@RequestMapping(method=RequestMethod.PUT,value="/actualizarCuestionario")
	public Cuestionario updateCuestionario(@RequestBody Cuestionario cuestionario ){	
		cuestionarioServicio.saveCuestionario(cuestionario);
		return cuestionario;
	}
	
	
	//CONSULTAS PERSONALIZADAS
	
	// Listar todos los Cuestionarios de tipo Borrador
	
	@RequestMapping("/CuestionariosBorrador")
	public List<Cuestionario> findAllBorrador(){
		return cuestionarioServicio.findAllBorrador();
	}

	// Listar todos los Cuestionarios de tipo Publicado
	
	@RequestMapping("/CuestionariosPublicado")
	public List<Cuestionario> findAllPublicado(){
		return cuestionarioServicio.findAllPublicado();
	}
	
	// Listar todos los Cuestionarios de tipo Terminado
	
	@RequestMapping("/CuestionariosTerminado")
	public List<Cuestionario> findAllTerminado(){
		return cuestionarioServicio.findAllTerminado();
	}
}
