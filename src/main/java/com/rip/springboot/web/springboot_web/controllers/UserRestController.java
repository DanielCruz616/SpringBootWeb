package com.rip.springboot.web.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rip.springboot.web.springboot_web.models.User;
import com.rip.springboot.web.springboot_web.models.dto.UserDto;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {

        User user = new User( "Daniel", "Cruz");

        UserDto userDto = new UserDto();
        userDto.setTitle("Hola soy la prueba definitiva");
        userDto.setName(user.getName());
        userDto.setLastname(user.getLastname());
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {

        User user = new User( "Daniel", "Cruz");
        User user2 = new User( "Maria", "Huerfano");
        User user3 = new User( "Julia", "Causa");

        List<User> users = Arrays.asList(user, user2, user3);
        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);
        
        return users;
    }
    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {

        User user = new User( "Daniel", "Cruz");

        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola soy la prueba definitiva");
        body.put("user", user);
        return body;
    }
}
