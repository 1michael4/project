package com.project.dao;

import org.springframework.data.repository.CrudRepository;
import com.project.entities.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

	/*Usuario deleteById(Integer id);*/

}
