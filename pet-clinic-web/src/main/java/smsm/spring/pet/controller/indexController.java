package smsm.spring.pet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping({"","/","index" ,"index.html"})
    public  String index(){
        return "welcome";
    }
}
