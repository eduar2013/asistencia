package com.decj.asistencia.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.decj.asistencia.auth.model.Usuarios;

public interface IUserRepository extends JpaRepository<Usuarios, Integer> {
	
	Usuarios findByUserName(String name);
}
