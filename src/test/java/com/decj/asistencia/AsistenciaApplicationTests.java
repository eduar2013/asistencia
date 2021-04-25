package com.decj.asistencia;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.decj.asistencia.auth.model.Usuarios;
import com.decj.asistencia.auth.repository.IUserRepository;

@SpringBootTest
class AsistenciaApplicationTests {
	
	@Autowired
	private IUserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	void crearUsuarioTest() {
		Usuarios us = new Usuarios();
		us.setId(1);
		us.setUserName("admin");
		us.setPassword(encoder.encode("admin"));
		Usuarios usuarioRetorno = userRepository.save(us);
		
		assertTrue(usuarioRetorno.getPassword().equals(us.getPassword()));
		
		
	}

}
