package com.java24.spring25.config;

import com.java24.spring25.domain.entity.Games;
import com.java24.spring25.repository.GamesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    CommandLineRunner runner(GamesRepository repository){
        return args -> {
            if(repository.count() == 0){
                Games games = new Games();
                repository.save(games);
            }
        };
    }
}
