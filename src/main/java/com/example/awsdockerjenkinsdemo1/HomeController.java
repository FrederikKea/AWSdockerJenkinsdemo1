package com.example.awsdockerjenkinsdemo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String indx () {
        return "index";
    }
}
