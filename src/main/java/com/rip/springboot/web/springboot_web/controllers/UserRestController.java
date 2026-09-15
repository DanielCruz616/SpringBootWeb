package com.rip.springboot.web.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rip.springboot.web.springboot_web.models.User;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String, Object> details() {
        User user = new User("Daniel", "Cruz");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola soy la prueba definitiva");
        body.put("user", user);
        return body;
    }
}
