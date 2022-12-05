package com.user.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.user.entity.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomUserDetail implements UserDetails {

	private static final long serialVersionUID = 1L;
	@Autowired
	private User user;

	public CustomUserDetail(User u) {
		super();
		this.user = u;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		log.info("role type is : " + new SimpleGrantedAuthority(user.getRole()));
		return Collections.singleton(new SimpleGrantedAuthority(user.getRole()));
	}

	@Override
	public String getPassword() {
		log.info("user d : " + this.user.toString());
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getEmailId();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
