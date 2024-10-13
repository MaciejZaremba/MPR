package com.example.MPR_SPRING_1.controllers;

import com.example.MPR_SPRING_1.model.Games;
import com.example.MPR_SPRING_1.services.GamesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyRestController {
    private GamesServices gamesServices;

    @Autowired
    public MyRestController(GamesServices gamesServices)
    {
        this.gamesServices = gamesServices;
    }

    @GetMapping("games/all") // <- endpoint
    public List<Games> getAll()
    {
        return this.gamesServices.getGamesList();
    }

    @PostMapping("games")
    public void addGames(@RequestBody Games games)
    {
        this.gamesServices.add(games);
    }

    @GetMapping("games/{id}")
    public void deleteGames(@PathVariable Integer id)
    {
        this.gamesServices.delete(this.gamesServices.getGames(id));
    }

    @PostMapping("games/{id}")
    public void putGames(@PathVariable Integer id, @RequestBody Games games)
    {
        this.gamesServices.put(id, games);
    }
}
