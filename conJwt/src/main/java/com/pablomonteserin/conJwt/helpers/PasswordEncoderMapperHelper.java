package com.pablomonteserin.conJwt.helpers;

import org.mapstruct.Named;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncoderMapperHelper {

    private final BCryptPasswordEncoder encoder;

    public PasswordEncoderMapperHelper(BCryptPasswordEncoder encoder) {
        this.encoder = encoder;
    }

    @Named("encodePassword")
    public String encode(String rawPassword) {
        return encoder.encode(rawPassword);
    }
}