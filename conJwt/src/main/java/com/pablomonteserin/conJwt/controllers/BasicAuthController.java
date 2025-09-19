package com.pablomonteserin.conJwt.controllers;

import com.pablomonteserin.conJwt.model.User;
import com.pablomonteserin.conJwt.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class BasicAuthController {

    @Autowired
    JwtTokenUtil jwtTokenUtil;


    @PostMapping(path = "/login")
    public ResponseEntity<String> basicauth(Principal principal) {
        final String token = jwtTokenUtil.generateToken(principal.getName());
        return ResponseEntity.ok().body("{\"resp\":\""+token+"\"}");
    }

    @GetMapping("/")
    public String test(){
        return "hola mundo!";
    }


    @GetMapping("/dos")
    public String test2(){
        return "adios mundo!";
    }


}