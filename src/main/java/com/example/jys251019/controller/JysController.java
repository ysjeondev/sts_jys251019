package com.example.jys251019.controller;

import com.example.jys251019.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JysController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username","곰살쟁이");
        return "greetings";
    }

    @GetMapping("/bye")
    public String SeeYouNext(Model model){
        model.addAttribute("nickname","곰살쟁이");
        return "goodbye";
    }


}
