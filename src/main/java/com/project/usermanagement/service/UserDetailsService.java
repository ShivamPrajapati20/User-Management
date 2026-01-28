package com.project.usermanagement.service;

import com.project.usermanagement.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsService  {
    UserDetails loadUserByUsername(String email);
}