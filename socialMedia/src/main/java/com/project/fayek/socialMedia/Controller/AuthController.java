package com.project.fayek.socialMedia.Controller;

import com.project.fayek.socialMedia.DTO.LoginRequest;
import com.project.fayek.socialMedia.DTO.RegisterRequest;
import com.project.fayek.socialMedia.Service.AuthService;
import com.project.fayek.socialMedia.Service.AuthenticationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* @author : fayek.mubarrat
 * date : 07/07/2021
 * purpose : To handle authentication requests */

@RestController
@RequestMapping("/api/auth")
public class AuthController {


    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody RegisterRequest registerRequest) {
        authService.signup(registerRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest);
    }

}