package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.MAPAS;

import java.util.Map;
import java.util.TreeMap;

public class ApuntesTreeMap {
    public static void main(String[] args) {
        // TreeMap ordena automáticamente por la CLAVE (alfabético o numérico)
        Map<String, Integer> mapaOrdenado = new TreeMap<>();

        mapaOrdenado.put("Zoe", 20);
        mapaOrdenado.put("Ana", 35);
        mapaOrdenado.put("Luis", 10);

        // Imprimirá: Ana, Luis, Zoe (Orden alfabético)
        System.out.println("Ordenado por clave: " + mapaOrdenado);
    }

    /*
     * ==========================================================
     * ORDENACIÓN DE MAPAS
     * ==========================================================
     * 1. POR CLAVE (Key):
     * Usa 'TreeMap'. Es instantáneo y automático. La clase de la
     * llave debe implementar 'Comparable' (String e Integer ya lo hacen).
     * * 2. POR VALOR (Value):
     * No se puede hacer directamente en el Mapa. Pasos:
     * a) Sacar las entradas: 'mapa.entrySet()'.
     * b) Meterlas en una 'ArrayList'.
     * c) Usar 'Collections.sort()' con un 'Comparator'.
     * * 3. MAP.ENTRY:
     * Representa una "pareja" (clave-valor). Es lo que manipulamos
     * dentro de la lista para poder comparar los valores.
     * * 4. EL TRUCO DEL EXAMEN:
     * Si te piden mantener el orden de INSERCIÓN (conforme los metes),
     * no uses HashMap ni TreeMap, usa 'LinkedHashMap'.
     * ==========================================================
     */
}
