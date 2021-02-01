package com.project.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table( name = "USUARIOS" ) 
public class Usuario implements Serializable{ 

	private static final long serialVersionUID = 1265660971450473499L;
	
	private int id;
	
	private String documento;
	
	private String username;
	
	private String nombre;
	
	private String email;
	
	private boolean estado;
	
	private Rol rol;
	
	private Dependencia dependencia; 

public Usuario( ) { 
	}

@Id 
@GeneratedValue( strategy = GenerationType.IDENTITY) 
@Column( name = "ID_USUARIO_PK", nullable = false ) 
	
public int getId() { 
	return id; 
} 

public void setId(int id) { 
	this.id = id; 
} 

@Column( name = "DOCUMENTO", nullable = false ) 
public String getDocumento() { 
	return documento; 
} 

public void setDocumento(String documento) { 
		this.documento = documento; 
} 

@Column( name = "USERNAME", nullable = false, unique = true ) 
public String getUsername() { 	
	return username; 
} 

public void setUsername(String username) { 
	this.username = username; 
} 

@Column( name = "NOMBRE", nullable = false) 
public String getNombre() { 
	return nombre; 
} 

public void setNombre(String nombre) { 
	this.nombre = nombre; 
} 
	
@Column( name = "EMAIL", nullable = false) 
public String getEmail() { 
	return email; 
} 
	
public void setEmail(String email) { 
	this.email = email; 
} 
	
@Column( name = "ESTADO", nullable = false) 
public boolean isEstado() { 
	return estado; 
} 
	  
public void setEstado(boolean estado) { 
	this.estado = estado; 
} 
	
@OneToOne 
@JoinColumn( name = "ID_ROL_FK" )  
public Rol getRol() { 
	return rol; 
} 
	
public void setRol(Rol rol) { 
	this.rol = rol; 
} 
	
@ManyToOne
@JoinColumn(columnDefinition="integer", name = "ID_DEPENDENCIA_FK") 
public Dependencia getDependencia( ) { 
	return dependencia; 
} 
	
public void setDependencia( Dependencia dependencia ) { 
	this.dependencia = dependencia; 
} 
	
@Override 
public String toString() { 
	return "UsuarioBO [id=" + id + ", documento=" + documento + ", userName=" + username + ", nombre=" + nombre + ", mail=" + email + ", estado=" + estado + ", rol=" + rol + ", dependencia=" + dependencia + "]"; 
}

}
