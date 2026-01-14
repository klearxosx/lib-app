package gr.aueb.cf.libapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String Home() {
        return "home";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
