package com.example.app.crud.Entity;

import javax.persistence.*;

@Entity
@Table(name="clientes" , catalog="crud_clientes" , schema="")
public class User {
	
	@Id
	@Column
	private Integer IDcliente;
	@Column
	private String nombre;
	@Column
	private String apellido;
	
	public Integer getIDcliente() {
		return IDcliente;
	}
	public void setIDcliente(Integer iDcliente) {
		IDcliente = iDcliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	

}
