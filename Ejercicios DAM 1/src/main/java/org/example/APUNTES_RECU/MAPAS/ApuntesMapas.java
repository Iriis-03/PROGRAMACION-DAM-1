package org.example.APUNTES_RECU.MAPAS;

import java.util.*;

public class ApuntesMapas {
    public static void main(String[] args) {

        // 1. HASHMAP: El más rápido. No mantiene orden.
        Map<String, Integer> hashMap = new HashMap<>();

        // 2. LINKEDHASHMAP: Mantiene el orden de INSERCIÓN.
        Map<String, Integer> linkedMap = new LinkedHashMap<>(); // Error común: es LinkedHashMap no LinkedHashSet

        // 3. TREEMAP: Ordena por la LLAVE (alfabético/numérico).
        Map<String, Integer> treeMap = new TreeMap<>();

        // --- OPERACIONES BÁSICAS (Iguales para todos) ---

        // AÑADIR: .put(llave, valor)
        hashMap.put("Zoe", 25);
        hashMap.put("Ana", 30);
        hashMap.put("Luis", 18);

        // OJO: Si repites llave, SOBREESCRIBE el valor anterior.
        hashMap.put("Ana", 35); // Ana ahora vale 35


        // LEER: .get(llave)
        System.out.println("Edad de Zoe: " + hashMap.get("Zoe"));

        // BORRAR: .remove(llave)
        hashMap.remove("Luis");

        // COMPROBAR: .containsKey() o .containsValue()
        if (hashMap.containsKey("Ana")) {
            System.out.println("Ana está en el mapa.");
        }

        // --- EL CONCEPTO DE ENTRY (LA FILA DEL MAPA) ---

        // Un Map.Entry es un objeto que contiene una pareja (Clave + Valor).
        // Se usa para recorrer el mapa de forma eficiente.
        System.out.println("\n--- Recorriendo con Map.Entry ---");

        for (Map.Entry<String, Integer> fila : hashMap.entrySet()) {
            // .getKey() saca la llave, .getValue() saca el valor
            String nombre = fila.getKey();
            Integer edad = fila.getValue();

            System.out.println("Clave: " + nombre + " | Valor: " + edad);

            // También puedes MODIFICAR el valor directamente en la fila
            if (nombre.equals("Zoe")) {
                fila.setValue(26); // Zoe ahora tiene 26 años en el mapa original
            }
        }

        System.out.println("\nContenido final del HashMap: " + hashMap);
    }

    /*
     * ==========================================================
     * INTERFAZ MAP (LLAVE - VALOR)
     * ==========================================================
     * * REGLA DE ORO: Las LLAVES son únicas (como un Set).
     * Los VALORES pueden repetirse.
     * * 1. HASHMAP:
     * - Es el más usado por su velocidad (O(1)).
     * - No garantiza ningún orden de los elementos.
     * * 2. LINKEDHASHMAP:
     * - Un poco más lento que HashMap.
     * - Respeta el orden en el que hiciste los .put().
     * * 3. TREEMAP:
     * - El más lento (O(log n)).
     * - Mantiene las llaves ordenadas (A-Z o 1-9).
     * * * MÉTODOS IMPORTANTES:
     * - .put(K, V): Inserta o actualiza.
     * - .get(K): Recupera el valor.
     * - .keySet(): Devuelve un Set con todas las llaves.
     * - .values(): Devuelve una Colección con todos los valores.
     * - .entrySet(): Devuelve un Set con las parejas (Entry).
     * ==========================================================
     */
}