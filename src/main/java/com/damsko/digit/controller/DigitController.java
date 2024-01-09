package com.damsko.digit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/digit")
public class DigitController {

    @GetMapping
    public String showForm() {
        return "digit-form";
    }

    @PostMapping
    public String processDigit(@RequestParam(name = "digit") int digit, Model model) {
        System.out.println("Received digit: " + digit);
        model.addAttribute("digit", digit);
        return "digit-result";
    }


}
