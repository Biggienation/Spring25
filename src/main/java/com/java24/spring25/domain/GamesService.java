package com.java24.spring25.domain;


import com.java24.spring25.domain.entity.Games;
import com.java24.spring25.repository.GamesRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class GamesService {
    GamesRepository repository;

    public GamesService(GamesRepository repository) {
        this.repository = repository;
    }

    public List<Games> getAllGames() {
        return repository.findAll();
    }
}
