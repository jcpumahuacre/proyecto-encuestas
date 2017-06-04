package org.paquetes.repositorioDAO;

import java.util.List;

import org.paquetes.modelo.Cuestionario;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CuestionarioRepositorio extends CrudRepository<Cuestionario, Integer> {

	
//	@Query("delete from User u where user.role.id = ?1")
//	@Query("select from Cuestionario c where user.role.id = ?1")
//	@Query("select t from #{#entityName} t where t.attribute = ?1")
	
	@Modifying
	@Query("select c from Cuestionario c where c.estado = 'B'")
	List<Cuestionario> findAllBorrador();

	@Modifying
	@Query("select c from Cuestionario c where c.estado = 'P'")
	List<Cuestionario> findAllPublicado();
	
	@Modifying
	@Query("select c from Cuestionario c where c.estado = 'T'")
	List<Cuestionario> findAllTerminado();
}
