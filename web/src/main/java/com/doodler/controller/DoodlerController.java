package com.doodler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller("doodle")
public class DoodlerController {

    private String address;

    public DoodlerController() {
        try {
            this.address = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/doodle", method = RequestMethod.GET)
    public String doodle(Model model) {

        model.addAttribute("address", address);
        return "doodle";
    }
}
