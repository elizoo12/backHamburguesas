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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getResidente() {
        return residente;
    }

    public void setResidente(String residente) {
        this.residente = residente;
    }
}
