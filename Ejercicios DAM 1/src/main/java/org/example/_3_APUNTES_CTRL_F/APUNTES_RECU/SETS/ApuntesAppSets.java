package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.SETS;

public class ApuntesAppSets {
    public static void main(String[] args) {
        // Instanciamos y usamos cada clase por separado
        new ApuntesHashSet().ejecutar();
        new ApuntesLinkedHashSet().ejecutar();
        new ApuntesTreeSet().ejecutar();
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