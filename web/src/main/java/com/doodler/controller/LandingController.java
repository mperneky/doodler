package com.doodler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("index")
public class LandingController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String land(Model model) {
        return "index";
    }
}
