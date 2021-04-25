package com.decj.asistencia.maestras.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="regimen_iva")
@Data
public class RegimenIvaEntity {
    
    @Id
    private int id;
    
    private String description;

}
