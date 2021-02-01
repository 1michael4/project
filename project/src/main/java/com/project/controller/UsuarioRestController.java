package com.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
/*import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;*/
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entities.Usuario;
import com.project.services.IUsuarioServices;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {

@Autowired
private IUsuarioServices usuarioService;

@GetMapping("/usuario")
public List<Usuario> index(){
	return usuarioService.findAll();
}

@PostMapping("/usuario")
public Usuario create(@RequestBody Usuario usuario){
	return usuarioService.create(usuario);
}

@PutMapping("/usuario")
public Usuario update(@RequestBody Usuario usuario) {
	return usuarioService.update(usuario);
}
/*@DeleteMapping("/{id}") 
public Usuario delete(@PathVariable("id") Integer id){ 
	return usuarioService.delete(id);
}*/ 
}