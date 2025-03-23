package com.java24.spring25.repository;

import com.java24.spring25.domain.entity.Games;
import org.springframework.data.repository.ListCrudRepository;

public interface GamesRepository extends ListCrudRepository <Games, Long> {

}
