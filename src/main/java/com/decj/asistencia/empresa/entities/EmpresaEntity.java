package com.decj.asistencia.empresa.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.decj.asistencia.maestras.entities.RegimenIvaEntity;
import com.decj.asistencia.maestras.entities.TipoContribuyenteEntity;

import lombok.Data;

@Entity
@Table(name="empresas")
@Data
public class EmpresaEntity {
	
	@Id()
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private long id;	
	
	private String tipoIdentificacion;
	
	@Column(name = "nit",unique=true,nullable = false)
	private int nit;
	private int digitoVerificacion;
	private String razonSocial;
	
	private boolean autoretenedor;
	
	@ManyToOne	
	private RegimenIvaEntity regimenIva;
	
	@ManyToOne
	private TipoContribuyenteEntity tipoContribuyente;	

	@OneToOne(mappedBy = "empresa", cascade = CascadeType.ALL,  fetch = FetchType.EAGER)
	private UbicacionEntity ubicacion;
}
