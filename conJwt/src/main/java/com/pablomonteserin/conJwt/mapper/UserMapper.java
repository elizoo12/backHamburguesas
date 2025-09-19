package com.pablomonteserin.conJwt.mapper;

import com.pablomonteserin.conJwt.dto.UserDTO;
import com.pablomonteserin.conJwt.helpers.PasswordEncoderMapperHelper;
import com.pablomonteserin.conJwt.model.User;
import org.mapstruct.Mapper;
import  org.mapstruct.Mapping;



@Mapper(componentModel = "spring", uses = PasswordEncoderMapperHelper.class)
public interface UserMapper {

    @Mapping(target = "password", source = "password", qualifiedByName = "encodePassword") // usará el helper automáticamente
    @Mapping(target = "birthdate", source = "birthdate")
    @Mapping(target = "residente", source = "residente")
    // Puedes inicializar los booleanos si quieres valores por defecto:
    @Mapping(target = "accountNonExpired", constant = "true")
    @Mapping(target = "accountNonLocked", constant = "true")
    @Mapping(target = "credentialsNonExpired", constant = "true")
    @Mapping(target = "enabled", constant = "true")
    User fromUserDTO(UserDTO source);

    @Mapping(target = "password", ignore = true)
    UserDTO fromUser(User source);
}