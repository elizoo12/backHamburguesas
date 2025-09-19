package com.pablomonteserin.conJwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// Springboot inspecciona todas las clases anotadas con @Configuration, @Component, @Service, @Repository y @Controller en busca de anotaciones de Springboot dentro de la propia clase
@Configuration
public class Encoder {
    // Creamos un bean de la clase BCryptPasswordEncoder para tenerlo disponible en el contexto, y poder materializar el Autowired de la clase SecurityConfig
    @Bean(name = "passwordEncoder")
    BCryptPasswordEncoder passwordencoder() {
        return new BCryptPasswordEncoder();
    }
}