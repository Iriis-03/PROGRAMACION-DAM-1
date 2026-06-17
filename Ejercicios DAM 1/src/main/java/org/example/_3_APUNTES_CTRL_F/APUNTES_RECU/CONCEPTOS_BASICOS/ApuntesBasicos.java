package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.CONCEPTOS_BASICOS;

/**
 * BLOQUE 1: FUNDAMENTOS Y SINTAXIS
 * Usa Ctrl + F para buscar palabras clave como "Scanner", "if", "for" o "switch".
 */
import java.util.Scanner; // IMPORTANTE: Sin esto no puedes pedir datos.

public class ApuntesBasicos {

    static void main(String[] args) {

        // ==========================================================
        // BLOQUE 1: ENTRADA DE DATOS (Scanner)
        // ==========================================================
        Scanner read = new Scanner(System.in);

        System.out.print("Escribe un número entero: ");
        int numeroEntero = read.nextInt();

        System.out.print("Escribe un decimal (usa coma en consola): ");
        double numeroDecimal = read.nextDouble();

        // ⚠️ TRUCO: Después de leer números, SIEMPRE limpia el buffer
        // antes de leer un String (nextLine), si no, se saltará la pregunta.
        read.nextLine();

        System.out.print("Escribe tu nombre completo: ");
        String nombre = read.nextLine(); // Lee una frase entera


        // ==========================================================
        // BLOQUE 2: ESTRUCTURAS DE CONTROL (Decisiones)
        // ==========================================================

        // --- A. IF / ELSE IF / ELSE ---
        // Úsalo para condiciones de mayor/menor o rangos.
        if (numeroEntero > 10 && nombre.equals("Juan")) {
            System.out.println("Cumple ambas (AND)");
        } else if (numeroDecimal <= 5.0 || numeroEntero == 0) {
            System.out.println("Cumple una de las dos (OR)");
        } else {
            System.out.println("No cumple nada");
        }

        // --- B. SWITCH (Selector) ---
        // Úsalo para valores exactos (1, 2, 3 o "Rojo", "Azul").
        int opcionMenu = 2;
        switch (opcionMenu) {
            case 1:
                System.out.println("Elegiste la opción 1");
                break; // El break es VITAL para no ejecutar el siguiente case
            case 2:
                System.out.println("Elegiste la opción 2");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }


        // ==========================================================
        // BLOQUE 3: BUCLES (Repeticiones)
        // ==========================================================

        // --- A. FOR (Cuando sabes cuántas vueltas dar) ---
        // Ejemplo: Repetir algo 5 veces exactas.
        System.out.println("Bucle FOR:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Vuelta: " + i);
        }

        // --- B. WHILE (Repetir mientras sea cierto) ---
        // Ejemplo: Repetir hasta que una variable cambie.
        System.out.println("Bucle WHILE:");
        int contador = 0;
        while (contador < 3) {
            System.out.println("Contando... " + contador);
            contador++; // ¡No olvides sumar!
        }

        // --- C. DO-WHILE (Ejecutar al menos una vez) ---
        // Úsalo para validar datos o menús que deben aparecer sí o sí.
        int valorUsuario;
        do {
            System.out.print("Introduce un número (0 para salir): ");
            valorUsuario = read.nextInt();
        } while (valorUsuario != 0);


        // ==========================================================
        // BLOQUE 4: OPERACIONES BÁSICAS (Lo más esencial)
        // ==========================================================
        int a = 10;
        int b = 3;

        int suma = a + b;
        int resto = a % b; // El módulo (%) te da el resto de la división (útil para saber si es PAR)

        if (a % 2 == 0) {
            System.out.println("El número es PAR");
        }

        // Comparar textos (Strings)
        // MAL: if (nombre == "Pepe")
        // BIEN:
        if (nombre.equalsIgnoreCase("pepe")) { // IgnoreCase ignora mayúsculas/minúsculas
            System.out.println("Hola Pepe");
        }
    }

    /*
     * ==========================================================
     * BLOQUE 1: ENTRADA DE DATOS (Clase Scanner)
     * ==========================================================
     * 1. IMPORTACIÓN: Siempre requiere 'import java.util.Scanner;' al principio.
     * 2. INSTANCIACIÓN: 'Scanner read = new Scanner(System.in);' conecta el
     * teclado con el programa.
     * 3. MÉTODOS CLAVE:
     * - read.nextInt(): Lee enteros (int).
     * - read.nextDouble(): Lee decimales (double). OJO: En consola usa COMA (,).
     * - read.nextLine(): Lee una frase entera (String).
     * 4. EL TRUCO DEL BUFFER (Peligro Examen):
     * Después de un nextInt() o nextDouble(), queda un "salto de línea" (\n)
     * invisible. Si luego haces un nextLine(), este leerá ese salto y se
     * "saltará" la pregunta.
     * SOLUCIÓN: Pon un 'read.nextLine();' vacío para limpiar ese rastro.
     *
     * ==========================================================
     * BLOQUE 2: ESTRUCTURAS DE CONTROL (Decisiones)
     * ==========================================================
     * 1. IF / ELSE IF / ELSE:
     * Se usa para evaluar rangos ( > , < , >= , <= ) o condiciones lógicas.
     * - && (AND): Ambas deben ser ciertas.
     * - || (OR): Al menos una debe ser cierta.
     * 2. SWITCH:
     * Ideal para menús o valores fijos (1, 2, 'A', "Rojo").
     * - Requiere 'break' en cada caso para que no "chorree" al siguiente.
     * - 'default' actúa como el 'else', se ejecuta si no coincide nada.
     *
     * ==========================================================
     * BLOQUE 3: BUCLES (Repeticiones)
     * ==========================================================
     * 1. FOR: Se usa cuando SABES cuántas veces repetir algo (ej: 10 veces).
     * Partes: (inicio; condición; incremento).
     * 2. WHILE: Se usa cuando NO SABES cuántas veces repetir (depende de una
     * condición externa). Evalúa ANTES de entrar.
     * 3. DO-WHILE: Igual que el while, pero garantiza que el código se ejecuta
     * AL MENOS UNA VEZ. Muy usado en menús.
     *
     * ==========================================================
     * BLOQUE 4: OPERACIONES Y STRINGS (Esenciales)
     * ==========================================================
     * 1. MÓDULO (%): Devuelve el RESTO de una división.
     * Truco: 'numero % 2 == 0' siempre significa que el número es PAR.
     * 2. COMPARAR TEXTOS (Strings):
     * ¡NUNCA uses '==' para comparar contenido de texto!
     * - .equals("texto"): Compara exactamente.
     * - .equalsIgnoreCase("texto"): Compara ignorando mayúsculas/minúsculas.
     * ==========================================================
     */
}
