package com.example.practical_springboot.service;


import com.example.practical_springboot.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
