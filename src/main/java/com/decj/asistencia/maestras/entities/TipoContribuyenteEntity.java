package com.decj.asistencia.maestras.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tipo_contribuyente")
@Data
public class TipoContribuyenteEntity {
    
    @Id
    private int id;
    
    private String description;
}
