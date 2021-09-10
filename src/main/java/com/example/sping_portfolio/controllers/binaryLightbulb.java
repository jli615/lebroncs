package com.example.sping_portfolio.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class binaryLightbulb {
    @GetMapping("/binaryLightbulb")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String binaryLightbulb() {
        return "binaryLightbulb"; // returns HTML VIEW (greeting)
    }
}