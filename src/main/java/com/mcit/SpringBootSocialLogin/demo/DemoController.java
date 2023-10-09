package com.mcit.SpringBootSocialLogin.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api/v1/sociallogin")
public class DemoController {
    
    @GetMapping
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello from secured end points.");
    }
    
}
