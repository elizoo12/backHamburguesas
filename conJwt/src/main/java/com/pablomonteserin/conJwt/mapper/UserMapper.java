package com.pablomonteserin.conJwt.mapper;

import com.pablomonteserin.conJwt.dto.UserDTO;
import com.pablomonteserin.conJwt.helpers.PasswordEncoderMapperHelper;
import com.pablomonteserin.conJwt.model.User;
import org.mapstruct.Mapper;
import  org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;


@Mapper(componentModel = "spring", uses = PasswordEncoderMapperHelper.class)
public abstract class UserMapper {


    @Autowired
    PasswordEncoder passwordEncoder;

    @Mapping(target = "password", expression = "java(passwordEncoder.encode(source.getPassword()))") // usará el helper automáticamente
    @Mapping(target = "birthdate", source = "birthdate")
    @Mapping(target = "residente", source = "residente")
    // Puedes inicializar los booleanos si quieres valores por defecto:
    @Mapping(target = "accountNonExpired", constant = "true")
    @Mapping(target = "accountNonLocked", constant = "true")
    @Mapping(target = "credentialsNonExpired", constant = "true")
    @Mapping(target = "enabled", constant = "true")
    public abstract User fromUserDTO(UserDTO source);

    @Mapping(target = "password", ignore = true)
   public abstract UserDTO fromUser(User source);
}