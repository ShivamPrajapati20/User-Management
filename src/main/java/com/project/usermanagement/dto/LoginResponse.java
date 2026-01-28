package com.project.usermanagement.dto;

public class LoginResponse {

    private String message;
    private Long userId;

    public LoginResponse(String message, Long userId) {
        this.message = message;
        this.userId = userId;
    }
}