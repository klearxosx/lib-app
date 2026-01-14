package gr.aueb.cf.libapp.controller;

import gr.aueb.cf.libapp.model.User;
import gr.aueb.cf.libapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/user_logout")
    public String Logout() {
        return "userLogout";
    }

    @GetMapping("/user_register")
    public String UserRegister() {
        return "userRegister";
    }


    @PostMapping("/save_user")
    public String addUser(@ModelAttribute User u) {
        service.save(u);
        return "redirect:/";
    }
}
