package org.example.TEMA7.Colecciones.mapas.Diccionario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiccionarioTest {

    private Diccionario diccionario_iris;

    @BeforeEach
    void setUp() {
        diccionario_iris = new Diccionario();
    }

    @Test
    void testNuevoPar() {
        diccionario_iris.nuevoPar("Rojo", "red");
        assertNotNull(diccionario_iris.traduce("Rojo"));
    }

    @Test
    void testTraducePalabraExistente() {
        diccionario_iris.nuevoPar("Perro", "dog");
        assertEquals("dog", diccionario_iris.traduce("Perro"));
    }

    @Test
    void testTraducePalabraInexistente() {
        assertNull(diccionario_iris.traduce("Gato"));
    }

    @Test
    void testPalabraAleatoria() {
        diccionario_iris.nuevoPar("Hola", "hello");
        String aleatoria = diccionario_iris.palabraAleatoria();
        assertEquals("hola", aleatoria);
    }

    @Test
    void testPrimeraLetraTraduccion() {
        diccionario_iris.nuevoPar("Coche", "car");
        char primera_letra = diccionario_iris.primeraLetraTraduccion("Coche");
        assertEquals('c', primera_letra);
    }

    @Test
    void testDiccionarioVacio() {
        boolean vacio = Diccionario.mapa_diccionario.isEmpty();

        assertTrue(vacio);
        assertNull(diccionario_iris.traduce("Palabra"));
    }
}