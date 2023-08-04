package org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String sayHello( Model model){

        model.addAttribute("pessego","#FGFGDFHFGHFGHJFGH");

        return "index";
    }


    @RequestMapping(method = RequestMethod.GET, path = "/another")
    public String sayAnother(){

        return "another";
    }

    @ModelAttribute
    private void addExtraInfo(Model model){
        model.addAttribute("extra","Today is Friday");
    }
}
