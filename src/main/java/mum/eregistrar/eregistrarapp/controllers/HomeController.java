package mum.eregistrar.eregistrarapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/","/eregistrar", "/eregistrar/home"})
    public String displayHomePage() {
        return "home/index";
    }

}
