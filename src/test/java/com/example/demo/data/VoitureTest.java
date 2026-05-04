package com.example.demo.data;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VoitureTest {

    @Test
    void testCreerVoiture() {
        // Arrange : On prépare l'objet
        Voiture voiture = new Voiture("Toyota", "Bleu");

        // Act & Assert : On vérifie que les données sont bien enregistrées
        assertNotNull(voiture, "L'objet voiture ne doit pas être nul");
        assertEquals("Toyota", voiture.getMarque(), "La marque doit être Toyota");
        assertEquals("Bleu", voiture.getCouleur(), "La couleur doit être Bleu");
    }

    @Test
    void testChangementCouleur() {
        Voiture voiture = new Voiture("Toyota", "Bleu");
        voiture.setCouleur("Rouge");
        assertEquals("Rouge", voiture.getCouleur(), "La couleur doit être passée au rouge");
    }
}
