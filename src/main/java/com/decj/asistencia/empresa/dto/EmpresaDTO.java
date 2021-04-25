package com.decj.asistencia.empresa.dto;


import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.decj.asistencia.maestras.dto.MaestrasDTO;

import lombok.Data;


@Data
public class EmpresaDTO {	
	
	private long id;
	
	@Positive(message = "El tipo de identificacion es obligatorio")
	private int tipoIdentificacion;
	
	@Positive(message = "El nit es obligatorio")
	private int nit;
	
	@Positive(message = "Digito de verificacion es obligatorio")
	private int digitoVerificacion;
	
	@NotNull(message="La razon social es obligatoria")
	private String razonSocial;
	
	@Valid
	@NotNull
	private MaestrasDTO regimenIva;
	
	@Valid
	@NotNull
	private MaestrasDTO tipoContribuyente;
	
	private boolean autoretenedor;
	
	@Valid
	private UbicacionDTO ubicacion;
}
