package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.SETS;
import java.util.LinkedHashSet;
import java.util.Set;

public class ApuntesLinkedHashSet {
    private Set<String> conjunto = new LinkedHashSet<>();

    // 2. MÉTODO PARA LINKEDHASHSET: El que respeta la llegada
    public void ejecutar() {
        // Mantiene el orden de inserción mediante una lista doblemente enlazada.
        conjunto.add("Zoe");
        conjunto.add("Ana");
        conjunto.add("Luis");
        conjunto.add("Ana"); // Duplicado: No se añade
        System.out.println("LinkedHashSet (Orden en que los metiste): " + conjunto);
    }
    /*
     * ==========================================================
     * INTERFAZ SET (CONJUNTOS)
     * ==========================================================
     * * REGLA DE ORO: NO permiten duplicados.
     * * 1. HASHSET:
     * - Rendimiento: El más rápido de todos (O(1)).
     * - Orden: Aleatorio/Nulo. No garantiza nada.
     * - Uso: Cuando solo te importa que no haya repetidos y quieres velocidad.
     * * 2. LINKEDHASHSET:
     * - Rendimiento: Un poco más lento que HashSet.
     * - Orden: Mantiene el orden en el que hiciste los .add().
     * - Uso: Cuando necesitas "memoria" del orden de llegada sin duplicados.
     * * 3. TREESET:
     * - Rendimiento: El más lento (O(log n)).
     * - Orden: Orden natural (A-Z, 1-9).
     * - Uso: Cuando necesitas que los datos estén siempre ordenados.
     * - Importante: Los objetos dentro deben ser 'Comparable'.
     * * * MÉTODO CLAVE: .add() devuelve 'true' si lo añade y 'false' si ya existía.
     * ==========================================================
     */
}
