package com.springsecurity.SpringSecurity.controller.auth;

import com.springsecurity.SpringSecurity.jwtSecurity.JwtService;
import com.springsecurity.SpringSecurity.model.User;
import com.springsecurity.SpringSecurity.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    public AuthenticationResponse register(RegisterRequest request){
        var user = User
                .builder()
                .firstname(request.getFirstName())
                .lastname(request.getLastName())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();
    }

}
