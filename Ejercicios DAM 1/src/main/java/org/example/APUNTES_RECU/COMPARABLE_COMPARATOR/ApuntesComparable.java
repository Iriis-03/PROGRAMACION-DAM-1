package org.example.APUNTES_RECU.COMPARABLE_COMPARATOR;

import java.util.ArrayList;
import java.util.Collections;

/**
 * COMPARABLE: Orden "Natural" (dentro de la clase).
 * Implementamos Comparable<Clase> y el método compareTo.
 */
public class ApuntesComparable implements Comparable<ApuntesComparable> {
    private int id;
    private String nombre;

    public ApuntesComparable(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(ApuntesComparable otro) {
        // Retorna:
        // 0 si son iguales,
        // > 0 si este es mayor,
        // < 0 si este es menor.
        return Integer.compare(this.id, otro.id); // Orden ascendente por ID
    }

    @Override
    public String toString() {
        return id + ":" + nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
     * ==========================================================
     * COMPARABLE vs COMPARATOR
     * ==========================================================
     * 1. COMPARABLE (La propia clase se compara):
     * - Interfaz: java.lang.Comparable
     * - Método: compareTo(Objeto o)
     * - Uso: Define el "orden natural" (el que se usa siempre por defecto).
     * - Modifica la clase original (implements Comparable).
     * * 2. COMPARATOR (Una regla externa se compara):
     * - Interfaz: java.util.Comparator
     * - Método: compare(Objeto o1, Objeto o2)
     * - Uso: Define órdenes alternativos (ej: por precio, por fecha).
     * - No modifica la clase original (se suele usar como Clase Anónima).
     * * 3. LÓGICA DE RETORNO (Truco):
     * - (A - B) -> Orden Ascendente.
     * - (B - A) -> Orden Descendente.
     * - Si es un String, usa: string1.compareTo(string2).
     * ==========================================================
     */
}
