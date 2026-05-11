package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import com.example.demo.data.Voiture;

@ExtendWith(MockitoExtension.class)
class StatistiqueTests {

    @Mock
    private Echantillon echantillonMock;

    @InjectMocks
    private StatistiqueImpl statistiqueService;

    @Test
    void testCalculer() {
        List<Voiture> faussesVoitures = List.of(
            new Voiture("Tesla", 123),
            new Voiture("BMW", 456)
        );
        
        when(echantillonMock.getVoitures()).thenReturn(faussesVoitures);

        int result = statistiqueService.calculer();

        assertEquals(2, result);
        verify(echantillonMock, times(1)).getVoitures();
    }
}
