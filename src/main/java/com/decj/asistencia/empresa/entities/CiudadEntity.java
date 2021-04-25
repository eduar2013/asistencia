package com.decj.asistencia.empresa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="ciudades")
public class CiudadEntity {
	
	@Id	
	private int codigoCiudad;
	private String nombre;

	public int getCodigoCiudad() {
		return codigoCiudad;
	}
	public void setCodigoCiudad(int codigoCiudad) {
		this.codigoCiudad = codigoCiudad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
