package com.java24.spring25.controller;

import com.java24.spring25.domain.GamesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(DashController.class)
class DashControllerTest {

    @MockitoBean
    private GamesService gamesService;

    @Autowired
    private MockMvc mockMvc;


}