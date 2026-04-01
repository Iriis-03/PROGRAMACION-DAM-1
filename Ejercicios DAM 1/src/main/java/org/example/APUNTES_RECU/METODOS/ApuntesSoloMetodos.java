package org.example.APUNTES_RECU.METODOS;

public class ApuntesSoloMetodos {

    static void main(String[] args) {
        // --- CÓMO LLAMAR A LOS MÉTODOS DESDE EL MAIN ---

        // 1. Llamar a un método simple
        saludar();

        // 2. Llamar a un método con parámetros (le pasamos la información)
        int miEdad = 20;
        mostrarEdad(miEdad);
        // También puedes pasar el valor directo: mostrarEdad(25);

        // 3. Llamar a un método con RETURN
        // ¡OJO! Al devolver un valor, debemos guardarlo en una variable o imprimirlo.
        int resultado = sumarDosNumeros(10, 5);
        System.out.println("El resultado del return es: " + resultado);
    }

    // ==========================================================
    // TIPO 1: MÉTODO "VOID" (VACÍO) - Solo ejecuta
    // ==========================================================
    // No devuelve nada. Se usa para mostrar mensajes o menús.
    public static void saludar() {
        System.out.println("Hola! Soy un método void, solo imprimo este texto.");
    }

    // ==========================================================
    // TIPO 2: MÉTODO CON PARÁMETROS (RECIBE DATOS)
    // ==========================================================
    // Entre los paréntesis ( ) ponemos qué necesita el método para funcionar.
    // Puedes pasarle int, String, double, etc.
    public static void mostrarEdad(int edad) {
        System.out.println("La edad recibida es: " + edad);
    }

    // ==========================================================
    // TIPO 3: MÉTODO CON "RETURN" (DEVUELVE DATOS)
    // ==========================================================
    // En lugar de 'void', ponemos el TIPO DE DATO que va a devolver (int).
    // Es OBLIGATORIO usar la palabra 'return' al final.
    public static int sumarDosNumeros(int num1, int num2) {
        int suma = num1 + num2;

        return suma; // "Envía" el número de vuelta a quien lo llamó
    }

    // ==========================================================
    // TIPO 4: MÉTODO QUE DEVUELVE BOOLEAN (MUY ÚTIL)
    // ==========================================================
    // Se usa mucho en exámenes para validar cosas (ej: ¿es par?).
    public static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * ==========================================================
     * MÉTODOS (Funciones / Procedimientos)
     * ==========================================================
     * 1. DEFINICIÓN:
     * Un método es un conjunto de instrucciones agrupadas bajo un nombre
     * que se puede "llamar" desde cualquier parte del programa.
     *
     * 2. ESTRUCTURA (Firma del método):
     * [Modificador] [Tipo de Retorno] [Nombre]([Parámetros]) { ... }
     * - Modificador: (p. ej. public static) Define quién puede verlo.
     * - Tipo de Retorno: Qué "devuelve" el método (int, String, etc.).
     * Si no devuelve nada, se usa 'void'.
     * - Parámetros: Los datos que el método necesita para trabajar.
     *
     * 3. PASO DE PARÁMETROS:
     * - Por Valor: Java siempre pasa una COPIA de la variable. Si cambias
     * el valor de un 'int' dentro del método, fuera sigue valiendo lo mismo.
     * - Por Referencia (Objetos/Arrays): Se pasa la dirección de memoria.
     * Si modificas un Array dentro, los cambios SÍ se ven fuera.
     *
     * 4. EL RETURN:
     * - Es la palabra que envía el resultado de vuelta a quien llamó al método.
     * - Una vez que se ejecuta un 'return', el método termina inmediatamente.
     *
     * 5. SOBRECARGA (Overload):
     * Puedes tener dos métodos con el mismo nombre, siempre que tengan
     * diferentes parámetros (distinto tipo o distinta cantidad).
     * ==========================================================
     */
}