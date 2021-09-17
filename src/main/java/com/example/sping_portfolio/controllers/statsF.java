package com.example.sping_portfolio.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class statsF {
    @GetMapping("/statsF")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String statsF() {
        return "statsF"; // returns HTML VIEW (greeting)
    }
}
