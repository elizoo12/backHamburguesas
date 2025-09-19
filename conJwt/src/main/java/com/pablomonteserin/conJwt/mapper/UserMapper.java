package com.pablomonteserin.conJwt.mapper;

import com.pablomonteserin.conJwt.dto.UserDTO;
import com.pablomonteserin.conJwt.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "password", expression = "java(passwordEncoderService.encodePassword(source.getPassword()))")
    User fromUserDTO(UserDTO source);

    @Mapping(target = "password", ignore = true)
    UserDTO fromUser(User source);
}
