package com.example.shadowfax.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.shadowfax.model.User;
import com.example.shadowfax.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user  = userRepository.findByUsername(username);
		
		return user;
	}

	public User postUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

}
