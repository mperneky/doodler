package com.doodler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("doodle")
public class DoodlerController {

    @RequestMapping(value = "/doodle", method = RequestMethod.GET)
    public String doodle(Model model) {
        model.addAttribute("userName", "John");
        return "doodle";
    }
}
