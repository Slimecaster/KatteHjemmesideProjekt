package com.example.kattehjemmesideprojekt.Controller;

import com.example.kattehjemmesideprojekt.Model.User;
import com.example.kattehjemmesideprojekt.Repository.KattehjemmesideRepository;
import com.example.kattehjemmesideprojekt.Service.KattehjemmesideService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private KattehjemmesideService kattehjemmesideService;

    @PostMapping("/")
    public String createUser(@ModelAttribute User user){
        kattehjemmesideService.createUser(user);
        return "redirect:/abc";
    }



}

