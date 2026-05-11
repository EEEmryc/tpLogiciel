package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import com.example.demo.data.Voiture;

@ExtendWith(MockitoExtension.class)
class StatistiqueTests {

    @InjectMocks
    private StatistiqueImpl statistiqueService;

    @Test
    void testPrixMoyen() {
        Voiture v1 = new Voiture("Tesla", 100);
        Voiture v2 = new Voiture("BMW", 200);
        
        statistiqueService.ajouter(v1);
        statistiqueService.ajouter(v2);

        Echantillon result = statistiqueService.prixMoyen();

        assertNotNull(result);
        assertEquals(2, result.getNombreDeVoitures());
        assertEquals(150, result.getPrixMoyen());
    }
}
