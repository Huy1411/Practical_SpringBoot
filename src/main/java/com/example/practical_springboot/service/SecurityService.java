package com.example.practical_springboot.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
