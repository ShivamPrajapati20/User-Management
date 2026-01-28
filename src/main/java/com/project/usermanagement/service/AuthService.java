package com.project.usermanagement.service;

import com.project.usermanagement.dto.LoginRequest;
import com.project.usermanagement.dto.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
}