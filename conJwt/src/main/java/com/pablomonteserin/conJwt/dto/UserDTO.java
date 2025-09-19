package com.pablomonteserin.conJwt.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class UserDTO {

    private String username;
    private String password;
    private Date birthdate;
    private String residente;
}
