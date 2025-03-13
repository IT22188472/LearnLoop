package com.learnloop.learnloop.controller;

import com.learnloop.learnloop.model.User;
import com.learnloop.learnloop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/submit")
    public String submitForm(@RequestParam("username") String username,
                             @RequestParam("password") String password, Model model) {

        // Create a new User object and save it to MongoDB
        User user = new User();
        user.setUsername(username);
        user.setPassword(password); // You might want to hash the password before saving it

        userRepository.save(user);

        // Add a success message or redirect after saving
        model.addAttribute("message", "User successfully created!");
        return "redirect:/";  // Redirecting back to home
    }
}
