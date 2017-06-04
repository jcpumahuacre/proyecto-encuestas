package org.paquetes.servicios;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.paquetes.modelo.Cuestionario;
import org.paquetes.repositorioDAO.CuestionarioRepositorio;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CuestionarioServicio {


	private final CuestionarioRepositorio CuestionarioRepositorio;

	public CuestionarioServicio(CuestionarioRepositorio cuestionarioRepositorio) {
		this.CuestionarioRepositorio = cuestionarioRepositorio;
	}
	
	public List<Cuestionario> findAll(){
		List<Cuestionario> cuestionarios= new ArrayList<>();
		for(Cuestionario cuestionario : CuestionarioRepositorio.findAll()){
			cuestionarios.add(cuestionario);
		}
		return cuestionarios;
	}
	
	public Cuestionario findCuestionario(int id){
		
		return CuestionarioRepositorio.findOne(id);
	}
	
	public void saveCuestionario(Cuestionario cuestionario){
		CuestionarioRepositorio.save(cuestionario);
	}
	
	public void deleteCuestionario(int id){
		CuestionarioRepositorio.delete(id);
		
	}
	
	// Lista de Cuestionario de tipo Borrador
	public List<Cuestionario> findAllBorrador(){
		List<Cuestionario> cuestionarios= new ArrayList<>();
		for(Cuestionario cuestionario : CuestionarioRepositorio.findAllBorrador()){
			cuestionarios.add(cuestionario);
		}
		return cuestionarios;
	}

	// Lista de Cuestionario de tipo Publicado
	public List<Cuestionario> findAllPublicado(){
		List<Cuestionario> cuestionarios= new ArrayList<>();
		for(Cuestionario cuestionario : CuestionarioRepositorio.findAllPublicado()){
			cuestionarios.add(cuestionario);
		}
		return cuestionarios;
	}

	// Lista de Cuestionario de tipo Terminado
	public List<Cuestionario> findAllTerminado(){
		List<Cuestionario> cuestionarios= new ArrayList<>();
		for(Cuestionario cuestionario : CuestionarioRepositorio.findAllTerminado()){
			cuestionarios.add(cuestionario);
		}
		return cuestionarios;
	}

}
