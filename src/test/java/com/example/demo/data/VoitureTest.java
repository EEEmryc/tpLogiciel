package com.example.demo.data;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VoitureTest {

    @Test
    void testCreerVoiture() {
        Voiture voiture = new Voiture("Toyota", 100);

        assertNotNull(voiture, "L'objet voiture ne doit pas être nul");
        assertEquals("Toyota", voiture.getMarque(), "La marque doit être Toyota");
    }

