package com.pablomonteserin.conJwt.controllers;

import com.pablomonteserin.conJwt.dto.UserDTO;
import com.pablomonteserin.conJwt.mapper.UserMapper;
import com.pablomonteserin.conJwt.model.User;
import com.pablomonteserin.conJwt.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

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

    @GetMapping("/")
    public List<UserDTO> getUsers(){
        List<User> users=userRepository.findAll();
        List<UserDTO> res= new LinkedList<>();
        for(User u: users){
            res.add(userMapper.fromUser(u));
        }

        return res;
    }


}
