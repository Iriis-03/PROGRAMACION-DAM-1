package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.ABSTRACTAS;

/**
 * BLOQUE: CLASE CONCRETA (LA REALIDAD)
 */
public class ApuntesClaseHija extends ApuntesClaseAbstractaPadre {

    public ApuntesClaseHija(String nombre) {
        super(nombre);
    }

    // IMPLEMENTACIÓN OBLIGATORIA
    // IntelliJ te lo marcará en rojo hasta que lo pongas (Alt + Enter para auto-completar)
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }

    /*
     * ==========================================================
     * CLASES ABSTRACTAS (Conceptos de Examen)
     * ==========================================================
     * 1. DEFINICIÓN:
     * Es una clase que NO se puede instanciar (no puedes hacer 'new').
     * Sirve como un "molde" o "base" para otras clases que heredan de ella.
     *
     * 2. OBJETIVO:
     * Definir una IDENTIDAD común. Se usa cuando quieres decir
     * "esto ES un/a..." (ej: un Perro ES un Animal).
     *
     * 3. MÉTODOS ABSTRACTOS:
     * - Se declaran con la palabra 'abstract'.
     * - NO tienen cuerpo (terminan en punto y coma: ';').
     * - Obligan a las clases hijas a escribir su propia implementación
     * (a menos que la hija también sea abstracta).
     *
     * 4. DIFERENCIA CON INTERFACES:
     * - Una clase abstracta PUEDE tener atributos (variables) normales.
     * - Puede tener métodos con cuerpo (métodos concretos) que las
     * hijas heredan tal cual.
     * - Puede tener constructores (aunque no se use 'new', sirven
     * para inicializar los atributos de la clase padre).
     *
     * 5. PALABRAS CLAVE:
     * - 'abstract class': Para definirla.
     * - 'extends': Para que una hija herede de ella.
     * ==========================================================
     */
}