package kr.co.photostagram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

    @GetMapping(value = {"profile", "profile/index"})
    public String index(Model model, String username) {
        model.addAttribute("username", username);
        return "profile/index";
    }

    @GetMapping("profile/modify")
    public String modify(){
        return "profile/modify";
    }

}
