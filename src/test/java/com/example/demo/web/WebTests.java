package com.example.demo.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.service.StatistiqueImpl;

@SpringBootTest
@AutoConfigureMockMvc
class WebTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StatistiqueImpl statistiqueImpl;

    @Test
    void testGetStatistique() throws Exception {
        mockMvc.perform(get("/statistique"))
               .andExpect(status().isOk());
    }

    @Test
    void testPostVoiture() throws Exception {
        String jsonVoiture = "{\"marque\":\"Tesla\", \"prix\":100}";
        
        mockMvc.perform(post("/voiture")
               .contentType(MediaType.APPLICATION_JSON)
               .content(jsonVoiture))
               .andExpect(status().isOk());
    }
}
