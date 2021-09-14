package br.com.home.workrecorder.controllers;

import br.com.home.workrecorder.models.Work;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
