package com.decj.asistencia.auth.jwt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.decj.asistencia.auth.model.Usuarios;
import com.decj.asistencia.auth.repository.IUserRepository;

@Service
public class JwtInDBUserDetailsServices implements UserDetailsService {
	
	@Autowired
	IUserRepository userRepository;

	
	
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		
		
		Usuarios user = userRepository.findByUserName(username);
		
		if (user == null) {
			 throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
		}
		
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ADMIN"));
		
		JwtUserDetails userDetails = new JwtUserDetails(Long.valueOf(user.getId()),user.getUserName(), user.getPassword(),"ADMIN");		
		return userDetails;
		
		
		
		
		
		
		
		
		
		
	}

}
