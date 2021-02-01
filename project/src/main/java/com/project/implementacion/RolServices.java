package com.project.implementacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.project.dao.IRolDao;
import com.project.entities.Rol;
import com.project.services.IRolServices;

@Service
public class RolServices implements IRolServices{
	
@Autowired
private IRolDao rolDao;

@Transactional(readOnly = true)
public List<Rol> findAll() {
	return (List<Rol>) rolDao.findAll();
}

@Transactional(readOnly = false)
public Rol create(Rol rol){
	return rolDao.save(rol);
}

@Transactional(readOnly = false)
public Rol update(Rol rol){
	return rolDao.save(rol);
}
}