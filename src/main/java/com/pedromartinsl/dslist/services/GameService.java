package com.pedromartinsl.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedromartinsl.dslist.dto.GameMinDTO;
import com.pedromartinsl.dslist.entities.Game;
import com.pedromartinsl.dslist.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(GameMinDTO::new).toList();
	}
}
