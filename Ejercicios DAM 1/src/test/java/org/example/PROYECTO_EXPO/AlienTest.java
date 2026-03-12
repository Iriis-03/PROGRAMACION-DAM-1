package org.example.PROYECTO_EXPO;

import org.example.ENTORNOS_DE_DESARROLLO.Alien;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlienTest {

    @Test
    void testConstructorStoresName() {
        Alien alien = new Alien("Zorg", "MARS01");
        assertEquals("Zorg", alien.getName());
    }

    @Test
    void testConstructorStoresPlanetId() {
        Alien alien = new Alien("Zorg", "MARS01");
        assertEquals("MARS01", alien.getPlanetId());
    }

    @Test
    void testToStringReturnsCorrectFormat() {
        Alien alien = new Alien("Zorg", "MARS01");
        String result = alien.toString();
        assertNotNull(result);
    }

    @Test
    void testAliensWithSamePlanetIdAreEqual() {
        Alien a1 = new Alien("Zorg", "MARS01");
        Alien a2 = new Alien("Xenomorph", "MARS01");

        assertTrue(a1.equals(a2));
    }

    @Test
    void testSetNameChangesName() {
        Alien alien = new Alien("Zorg", "MARS01");

        alien.setName("Xenomorph");

        assertEquals("Xenomorph", alien.getName());
    }

    @Test
    void testSetPlanetIdChangesPlanetId() {
        Alien alien = new Alien("Zorg", "MARS01");

        alien.setPlanetId("LV426");

        assertEquals("LV426", alien.getPlanetId());
    }

}