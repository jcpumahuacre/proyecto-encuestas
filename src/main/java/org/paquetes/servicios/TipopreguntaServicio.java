package org.paquetes.servicios;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.paquetes.modelo.Tipopregunta;
import org.paquetes.repositorioDAO.TipopreguntaRepositorio;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TipopreguntaServicio {

	private final TipopreguntaRepositorio tipoalternativaRepositorio;

	public TipopreguntaServicio(TipopreguntaRepositorio tipoalternativaRepositorio) {
		this.tipoalternativaRepositorio = tipoalternativaRepositorio;
	}
	
	public List<Tipopregunta> findAll(){
		List<Tipopregunta> tipopreguntas= new ArrayList<>();
		for(Tipopregunta tipopregunta : tipoalternativaRepositorio.findAll()){
			tipopreguntas.add(tipopregunta);
		}
		return tipopreguntas;
	}
	
	public Tipopregunta findTipopregunta(int id){
		
		return tipoalternativaRepositorio.findOne(id);
	}
	
	public void saveTipopregunta(Tipopregunta categoria){
		tipoalternativaRepositorio.save(categoria);
	}
	
	public void deleteTipopregunta(int id){
		tipoalternativaRepositorio.delete(id);
		
	}
}
