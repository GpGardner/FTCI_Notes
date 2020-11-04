package com.tts.ECommerce.Models;

import java.util.Collection;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class User implements UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotEmpty
	private String username;

	@NotEmpty
	private String password;

	@ElementCollection
	private Map<Product, Integer> cart;

	public User(@NotEmpty String username, @NotEmpty String password, Map<Product, Integer> cart) {
		this.username = username;
		this.password = password;
		this.cart = cart;
	}

	public User() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Map<Product, Integer> getCart() {
		return cart;
	}

	public void setCart(Map<Product, Integer> cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", cart=" + cart + "]";
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	// TODO Auto-generated method stub
	return null;
	}

	@Override
	public boolean isAccountNonExpired() {
	// TODO Auto-generated method stub
	return true;
	}

	@Override
	public boolean isAccountNonLocked() {
	// TODO Auto-generated method stub
	return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
	// TODO Auto-generated method stub
	return true;
	}

	@Override
	public boolean isEnabled() {
	// TODO Auto-generated method stub
	return true;
	}

}
