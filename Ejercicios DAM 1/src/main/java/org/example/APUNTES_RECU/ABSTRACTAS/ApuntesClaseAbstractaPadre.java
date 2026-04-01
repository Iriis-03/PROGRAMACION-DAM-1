package org.example.APUNTES_RECU.ABSTRACTAS;

/**
 * BLOQUE: CLASE ABSTRACTA (EL CONCEPTO)
 * No se pueden crear objetos con 'new' de esta clase.
 */
public abstract class ApuntesClaseAbstractaPadre {

    protected String nombre;

    public ApuntesClaseAbstractaPadre(String nombre) {
        this.nombre = nombre;
    }

    // MODO "NORMAL": Los hijos lo heredan tal cual
    public void dormir() {
        System.out.println(nombre + " está durmiendo... Zzz");
    }

    // MÉTODO ABSTRACTO: No tiene cuerpo { }.
    // Obliga a cada hijo a escribir su propia versión.
    public abstract void hacerSonido();

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

