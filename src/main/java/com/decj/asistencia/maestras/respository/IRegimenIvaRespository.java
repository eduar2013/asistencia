package com.decj.asistencia.maestras.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.decj.asistencia.maestras.entities.RegimenIvaEntity;

@Repository
public interface IRegimenIvaRespository extends  JpaRepository<RegimenIvaEntity, Integer>{

}
