
package com.emendas.controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {
    @PostMapping("/login")
    public String login(@RequestParam String user, @RequestParam String pass) {
        if(user.equals("admin") && pass.equals("123")) return "JWT_FAKE_TOKEN";
        throw new RuntimeException("Login inválido");
    }
}
