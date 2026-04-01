package org.example.APUNTES_RECU.MENUS;

import java.util.Scanner;

public class ApuntesMenusMetodos {

    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {
        int opcion;

        do {
            // Llamamos al método que imprime el texto del menú
            mostrarMenu();

            opcion = read.nextInt();
            read.nextLine(); // Limpieza de buffer siempre

            switch (opcion) {
                case 1:
                    saludar(); // Método simple (void)
                    break;
                case 2:
                    System.out.print("Dime tu nombre: ");
                    String nombre = read.nextLine();
                    decirHola(nombre); // Método con parámetro (pasa el nombre)
                    break;
                case 3:
                    // Guardamos en una variable lo que el método nos "devuelve"
                    int resultadoSuma = sumarNumeros();
                    System.out.println("La suma total es: " + resultadoSuma);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Error: Opción no válida.");
            }

        } while (opcion != 4);
    }

    // ==========================================================
    // SECCIÓN DE MÉTODOS (Sencillos)
    // ==========================================================

    // 1. VOID: Solo imprime algo. No devuelve nada.
    public static void mostrarMenu() {
        System.out.println("\n--- MI MENÚ ---");
        System.out.println("1. Saludo básico");
        System.out.println("2. Saludo personalizado (Parámetros)");
        System.out.println("3. Sumar dos números (Return)");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }

    public static void saludar() {
        System.out.println("¡Hola! Estás dentro de un método.");
    }

    // 2. CON PARÁMETRO: Recibe un dato para usarlo dentro.
    public static void decirHola(String nombreUsuario) {
        System.out.println("Hola " + nombreUsuario + ", ¿cómo va el examen?");
    }

    // 3. CON RETURN (Simplificado): Calcula algo y envía el resultado al main.
    // Fíjate que en vez de 'void' ponemos 'int' porque devuelve un número entero.
    public static int sumarNumeros() {
        System.out.print("Introduce número A: ");
        int a = read.nextInt();
        System.out.print("Introduce número B: ");
        int b = read.nextInt();

        int suma = a + b;

        return suma; // "Lanza" el resultado de vuelta al main
    }

    /*
     * ==========================================================
     * MENÚS MODULARIZADOS (Métodos)
     * ==========================================================
     * 1. ESTRUCTURA DEL MAIN:
     * El 'main' debe contener solo el bucle (do-while) y el selector
     * (switch). Las acciones reales deben estar en métodos aparte.
     *
     * 2. PASO DE PARÁMETROS:
     * - Si el método necesita datos para trabajar (ej: una lista o
     * un número), se los pasamos por los paréntesis: 'metodo(datos)'.
     * - Si el método genera un resultado, debe usar 'return'.
     *
     * 3. ÁMBITO DE VARIABLES (Scope):
     * Las variables creadas dentro del 'main' no existen dentro de
     * otros métodos a menos que se las pases como parámetros.
     *
     * 4. ESCÁNER ÚNICO:
     * Es mejor crear el Scanner en el 'main' y pasarlo a los métodos,
     * o declararlo como 'static' fuera del main para que todos lo vean.
     * ==========================================================
     */
}