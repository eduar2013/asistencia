package com.decj.asistencia.empresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.decj.asistencia.empresa.entities.EmpresaEntity;

@Repository
public interface IEmpresaRepository extends JpaRepository<EmpresaEntity, Long>{

	
}
