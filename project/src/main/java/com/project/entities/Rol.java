package com.project.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table( name = "ROL" ) 

public class Rol implements Serializable{ 

 	private static final long serialVersionUID = -6362794385792247263L; 
  
 	private int id; 
 	   
 	private String descripcion; 
 	  
 	private String siglaRol; 
 
 	private boolean estado; 
 	 
public Rol( ) { 
} 

 @Id 
 @GeneratedValue( strategy = GenerationType.IDENTITY )  	@Column( name = "ID_ROL_PK", nullable = false ) 
 public int getId( ) { 
 	return id; 
 } 
  
 public void setId( int idRol ) { 
 	this.id = idRol; 
 } 
 	  
 @Column( name = "DESCRIPCION", nullable = false )
 public String getDescripcion( ) {
	 return descripcion; 
 } 
  
 public void setDescripcion( String descripcion ) { 
 	 this.descripcion = descripcion; 
 } 
  
 @Column( name = "SIGLA_ROL") 
 public String getSiglaRol( ) {  	
	 return siglaRol;
} 
 
public void setSiglaRol(String siglaRol) {  	
	this.siglaRol = siglaRol; 
} 

 @Column( name = "ESTADO", nullable = false )  	
 public boolean getEstado( ) { 
 	 return estado; 
 } 
 
 public void setEstado( boolean estado ) {  	 	
	this.estado = estado; 
 } 
 
 @Override 
 public String toString() { 
 	 return "Rol [id=" + id + ", descripcion=" + descripcion + ", siglaRol=" + siglaRol + ", estado=" + estado + "]"; 
 	}  
}

