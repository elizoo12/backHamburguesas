package com.pablomonteserin.conJwt.controllers;

import com.pablomonteserin.conJwt.dto.UserDTO;
import com.pablomonteserin.conJwt.mapper.UserMapper;
import com.pablomonteserin.conJwt.model.User;
import com.pablomonteserin.conJwt.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @GetMapping("/{name}")
    public UserDTO getUser (@PathVariable("name") String name){
        return userMapper.fromUser(userRepository.findByUsername(name));
    }
}
