package com.java24.spring25;

import com.java24.spring25.domain.entity.Games;
import com.java24.spring25.repository.GamesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Spring25Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring25Application.class, args);
    }

}
