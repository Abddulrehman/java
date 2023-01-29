//package com.security;
//
//import java.util.Collection;
//import java.util.List;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//public class CustomUserDetail implements UserDetails  {
//
//	
//	private User user;
//	 SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(user.getEmail());
//	
//	
//	public CustomUserDetail() {
//		super();
//	}
//
//	public CustomUserDetail(User user) {
//		super();
//		this.user = user;
//	}
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return List.of(simpleGrantedAuthority);
//	}
//
//	@Override
//	public String getPassword() {
//		return user.getPassword() ;
//	}
//
//	@Override
//	public String getUsername() {
//		return user.getEmail();
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		
//		return false;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		return true;
//	}
//
//}
