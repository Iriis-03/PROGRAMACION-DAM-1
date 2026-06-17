package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.MAPAS;

import java.util.*;

public class ApuntesOrdenacionMapa {
    public static void main(String[] args) {
        Map<String, Integer> ventas = new HashMap<>();
        ventas.put("Peras", 50);
        ventas.put("Manzanas", 20);
        ventas.put("Plátanos", 80);

        // 1. Convertimos el Mapa en una Lista de sus entradas (filas)
        List<Map.Entry<String, Integer>> listaVentas = new ArrayList<>(ventas.entrySet());

        // 2. Usamos Comparator para ordenar la lista por el VALOR
        Collections.sort(listaVentas, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                // Orden ascendente por el valor (Integer)
                return e1.getValue().compareTo(e2.getValue());
            }
        });

        // 3. Mostramos el resultado
        for (Map.Entry<String, Integer> entrada : listaVentas) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }
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