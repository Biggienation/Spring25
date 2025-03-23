package com.java24.spring25.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashController {

    @RequestMapping("dashboard")
    public String dashboard(Model model) {
        model.addAttribute("title", "Spring 25 Dash");
        model.addAttribute("message", "This is the dashboard");
        model.addAttribute("name","User");
        return "dashboard";
    }
}
