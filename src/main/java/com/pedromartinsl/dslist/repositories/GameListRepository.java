package com.pedromartinsl.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedromartinsl.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
