package org.example.APUNTES_RECU.INTERFACES_CLASES_ANONIMAS;

/**
 * BLOQUE: IMPLEMENTACIÓN
 * Esta clase "firma el contrato" y rellena los métodos.
 */
public class ApuntesClaseImplementa implements ApuntesInterfaz {

    private String nombreJuego;

    public ApuntesClaseImplementa(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    @Override
    public void jugar() {
        System.out.println("Iniciando el juego: " + nombreJuego);
    }

    @Override
    public void pausar() {
        System.out.println("Juego " + nombreJuego + " en pausa.");
    }
}

/*
 * ==========================================================
 * INTERFACES Y CLASES ANÓNIMAS
 * ==========================================================
 * 1. INTERFAZ (El Contrato):
 * - Es una colección de métodos abstractos (sin cuerpo).
 * - Define un COMPORTAMIENTO que cualquier clase puede adoptar.
 * - No se puede instanciar (no puedes hacer 'new Interfaz();').
 *
 * 2. CLASE ANÓNIMA (Implementación "Express"):
 * - Es una clase sin nombre que se crea y se instancia al mismo tiempo.
 * - Se usa para implementar una interfaz de forma rápida y única.
 * - Muy común en: Manejadores de eventos (botones), hilos (Threads)
 * o comparadores (Comparator).
 *
 * 3. VENTAJAS:
 * - Evita crear archivos .java extra para implementaciones simples.
 * - Mantiene el código relacionado en un mismo lugar.
 *
 * 4. LIMITACIONES:
 * - No puedes reutilizar la clase anónima en otro lugar del código.
 * - Solo pueden implementar UNA interfaz o heredar de UNA clase.
 * ==========================================================
 */