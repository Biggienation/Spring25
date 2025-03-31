package com.java24.spring25.domain;

import com.java24.spring25.repository.GamesRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GamesServiceTest {
    @InjectMocks
    GamesService gamesService;
    @Mock
    GamesRepository gamesRepository;

    @Test
    void getAllGames() {
        when(gamesRepository.findAll()).thenReturn(List.of());
        assertThat(gamesService.getAllGames().isEmpty());
    }

}