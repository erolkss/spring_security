package br.com.example.springsecurity.service;

import br.com.example.springsecurity.dto.SignUpRequest;
import br.com.example.springsecurity.entity.User;

public interface AuthenticationService {

    User signUp(SignUpRequest signUpRequest);
}
