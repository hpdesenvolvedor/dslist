package com.henriquenunes.dslist.controller;


import com.henriquenunes.dslist.dto.GameMinDTO;
import com.henriquenunes.dslist.entities.Game;
import com.henriquenunes.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findALL(){
        List<GameMinDTO> result = gameService.findALL();
        return result;
    }
}
