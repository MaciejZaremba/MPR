package com.example.MPR_SPRING_1.services;

import com.example.MPR_SPRING_1.model.Games;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GamesServices {
    List<Games> gamesList = new ArrayList<>();

    public GamesServices()
    {
        this.gamesList.add(new Games("League of Legends", "MOBA"));
        this.gamesList.add(new Games("World of Warcraft", "MMORPG"));
        this.gamesList.add(new Games("Stellaris", "Strategy"));
    }

    public List<Games> getGamesList()
    {
        return this.gamesList;
    }

    public Games getGames(Integer id)
    {
        return this.gamesList.get(id);
    }

    public void add(Games games)
    {
        this.gamesList.add(games);
    }

    public void delete(Games games)
    {
        this.gamesList.remove(games);
    }

    public void put(Integer id, Games games) {
        this.gamesList.set(id, games);
    }
}
