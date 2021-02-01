package com.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entities.Rol;
import com.project.services.IRolServices;

@RestController
@RequestMapping("/api")
public class RolRestController {
	
@Autowired
private IRolServices rolService;

@GetMapping("/rol")
public List<Rol> index(){
	return rolService.findAll();
}

@PostMapping("/rol")
public Rol create(@RequestBody Rol rol){
	return rolService.create(rol);
}

@PutMapping("/rol")
public Rol update(@RequestBody Rol rol) {
	return rolService.update(rol);
}
}
