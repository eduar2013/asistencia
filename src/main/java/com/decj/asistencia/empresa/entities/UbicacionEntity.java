package com.decj.asistencia.empresa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ubicacion_empresa")
public class UbicacionEntity {
	
	@Id	
	private long id;
	
	@Column(name="direccion", length = 150)
	private String direccion;
	
	@Column(name="telefono", length = 15)
	private String telefono;
	
	@Column(name="fax", length = 15)
	private String fax;
	
	@Column(name="email", length = 40)
	private String email;
		
	@ManyToOne()
	@JoinColumn(name = "codigo_ciudad")
	private CiudadEntity ciudad;
	
	@OneToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "empresa_id")
    @MapsId
    private EmpresaEntity empresa;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public CiudadEntity getCiudad() {
		return ciudad;
	}
	public void setCiudad(CiudadEntity ciudad) {
		this.ciudad = ciudad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public EmpresaEntity getEmpresa() {
		return empresa;
	}
	public void setEmpresa(EmpresaEntity empresa) {
		this.empresa = empresa;
	}
}
