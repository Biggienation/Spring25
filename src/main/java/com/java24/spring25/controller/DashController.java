package com.java24.spring25.controller;

import com.java24.spring25.domain.entity.Games;
import com.java24.spring25.domain.entity.GamesService;
import com.java24.spring25.repository.GamesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DashController {

    private GamesService gamesService;

    public DashController(GamesService gamesService) {
        this.gamesService = gamesService;
    }

    @RequestMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("title", "Spring 25 Dash");
        model.addAttribute("message", "This is the dashboard");
        model.addAttribute("name","User");
        return "dashboard";
    }

    @GetMapping("/dashboard/games")
    @ResponseBody
    public List<Games> allGames(Model model) {
        return gamesService.getAllGames();
    }
}
