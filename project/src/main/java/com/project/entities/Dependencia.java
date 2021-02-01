package com.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "DEPENDENCIAS" )

public class Dependencia {

@Id 
@GeneratedValue( strategy = GenerationType.IDENTITY ) 
@Column( name = "ID_DEPENDENCIA", nullable = false ) 
	
	private int id; 
	
public int getId( ) { 
	return id; 
} 
	
public void setId( int idRol ) { 
	this.id = idRol; 
} 
	
@Column( name = "CODIGO", nullable = false) 
private String codigo; 
	
public String getCodigo( ) { 
	return codigo; 
} 
	
public void setCodigo( String codigo ) { 
	this.codigo = codigo; 
} 
	
@Column( name = "DESCRIPCION", nullable = false) 
private String descripcion; 
	
public String getDescripcion( ) { 
	return descripcion; 
} 
	
public void setDescripcion( String descripcion ) { 
	this.descripcion = descripcion; 
} 
	
@Column( name = "CARGO", nullable = false) 
private String cargo; 
	
	
public String getCargo( ) { 
	return cargo; 
} 
	
public void setCargo( String cargo ) { 
	this.cargo = cargo; 
} 
	
@Column( name = "ESTADO", nullable = false) 
private boolean estado; 
	
public boolean getEstado( ) { 
	return estado; 
} 
	
public void setEstado( boolean estado ) { 
	this.estado = estado; 
}

@Override
public String toString() {
	return "Dependencia [id=" + id + ", codigo=" + codigo + ", descripcion=" + descripcion + ", cargo=" + cargo + ", estado=" + estado + "]";
	}
	
}
