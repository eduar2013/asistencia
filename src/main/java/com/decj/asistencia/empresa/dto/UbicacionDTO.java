package com.decj.asistencia.empresa.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.Data;

@Data
public class UbicacionDTO {
	
	@NotNull(message = "La dirección es obligatoria")
	private String direccion;
	
	@NotNull(message = "EL teléfono es obligatorio")
	private String telefono;	
	
	private String fax;
	
	@Email
	@NotNull
	private String email;
	
	@Positive
	private int codigoCiudad;
	
	@Positive
	private int codigoPais;
	
}
	