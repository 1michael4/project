package com.project.services;

import java.util.List;
import com.project.entities.Dependencia;

public interface IDependenciaServices {
	
	public List<Dependencia> findAll();
	public Dependencia create(Dependencia dependencia);
	public Dependencia update(Dependencia dependencia);
}
