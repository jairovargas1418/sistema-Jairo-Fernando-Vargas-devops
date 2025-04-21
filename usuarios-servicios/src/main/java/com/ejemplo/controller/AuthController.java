package com.ejemplo.controller;



import com.example.usuariosservicios.security.AuthService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestParam String username, @RequestParam String password) {
        String token = authService.login(username, password);
        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        return response;
    }
}
