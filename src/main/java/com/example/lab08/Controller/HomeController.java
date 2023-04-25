package com.example.lab08.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String gettingIndex(){
        return "index";
    }
    @GetMapping("/contact")
    public String gettingContact(){
        return "contact";
    }
    @PostMapping("/contact")
    public String postingContact(@RequestParam String name, @RequestParam String email, Model model){
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        return "contact2";
    }
    @GetMapping("/about")
    public String gettingAbout(){
        return "about";
    }
}
