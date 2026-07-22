package com.cognizant.jwt.controller;

import com.cognizant.jwt.service.JwtService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@RestController
public class AuthenticationController {

    private final JwtService jwtService;

    public AuthenticationController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(@RequestHeader(HttpHeaders.AUTHORIZATION) String authorizationHeader) {
        String username = decodeUsername(authorizationHeader);
        return new AuthenticationResponse(jwtService.generateToken(username));
    }

    private String decodeUsername(String authorizationHeader) {
        if (!authorizationHeader.startsWith("Basic ")) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Basic Authorization header is required");
        }

        String encodedCredentials = authorizationHeader.substring("Basic ".length());
        String credentials = new String(Base64.getDecoder().decode(encodedCredentials), StandardCharsets.UTF_8);
        int separatorIndex = credentials.indexOf(':');

        if (separatorIndex < 1) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid Basic Authorization header");
        }

        return credentials.substring(0, separatorIndex);
    }
}
