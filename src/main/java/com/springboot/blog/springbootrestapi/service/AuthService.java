package com.springboot.blog.springbootrestapi.service;

import com.springboot.blog.springbootrestapi.payload.LoginDTO;
import com.springboot.blog.springbootrestapi.payload.RegisterDTO;

public interface AuthService {
    String login(LoginDTO loginDto);

    String register(RegisterDTO registerDTO);
}
