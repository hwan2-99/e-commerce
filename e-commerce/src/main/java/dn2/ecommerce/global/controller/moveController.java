package dn2.ecommerce.global.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class moveController {


    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
    @GetMapping("/basket")
    public String basket(){
        return "basket";
    }
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/order")
    public String order(){
        return "order";
    }
    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }
}
