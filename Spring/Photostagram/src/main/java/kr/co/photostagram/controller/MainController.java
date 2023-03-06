package kr.co.photostagram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value = {"/", "index"})
    public String index(){
        return "index";
    }

    @GetMapping("main")
    public String main(){
        return "main";
    }
}
