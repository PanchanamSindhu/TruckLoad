package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		log.info("############Username valdiation#########" + username);
		User user = this.userRepository.findEmailId(username).get();
		log.info("##returning user : " + user);

		if (user == null) {
			throw new UsernameNotFoundException("User not found");
		} else {
			return new CustomUserDetail(user);
		}

	}

}
