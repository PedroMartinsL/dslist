package com.pedromartinsl.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedromartinsl.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}   
