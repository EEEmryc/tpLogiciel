package com.example.demo.data;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VoitureTest {

    @Test
    void testCreerVoiture() {
        // On utilise un int (123) pour le 2ème paramètre comme vu précédemment
        Voiture voiture = new Voiture("Toyota", 123);

        assertNotNull(voiture);
        assertEquals("Toyota", voiture.getMarque());
    }
    
} 
