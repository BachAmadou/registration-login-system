package com.dev.springboot.controller;

import com.dev.springboot.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    // Handler method to handle home page request
    @GetMapping("/index")
    public String home(){
        return "index";
    }

    // Handle method to handle user registration form request
    @GetMapping("/register")
    public String showRegistrationFrom(Model model) {
        // Create model object to store form data
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "register";
    }

    // Handle method to handle user registration form submit request

}
