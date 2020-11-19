package com.dam.damhibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alumno {
	
	@Id
	private int codigo;
	@Column
	private String nombre;
	@Column
	private int edad;
	
	public Alumno(int codigo, String nombre, int edad) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.edad = edad;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
