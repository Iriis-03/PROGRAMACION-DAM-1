package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.POO;

import java.util.Scanner;

/**
 * BLOQUE: GESTIÓN DE OBJETOS Y BUCLES AVANZADOS
 */
public class ApuntesAppClaseObjeto{

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // ==========================================================
        // 1. ARRAY DE OBJETOS (Guardar varios productos)
        // ==========================================================
        // Creamos un array que en lugar de 'int', guarda 'ApuntesClaseObjeto'
        ApuntesClaseObjeto[] inventario = new ApuntesClaseObjeto[3];

        // Rellenamos el array con objetos nuevos
        inventario[0] = new ApuntesClaseObjeto("Ratón", 25.50, 10);
        inventario[1] = new ApuntesClaseObjeto("Teclado", 45.00, 0);
        inventario[2] = new ApuntesClaseObjeto("Monitor", 150.00, 5);

        // ==========================================================
        // 2. BUCLE FOR-EACH (Recorrer objetos fácilmente)
        // ==========================================================
        // Estructura: (Clase temporal : Array)
        System.out.println("--- LISTADO DE INVENTARIO ---");
        for (ApuntesClaseObjeto p : inventario) {
            // 'p' representa a cada producto en cada vuelta
            System.out.println(p.toString());
        }

        // ==========================================================
        // 3. LÓGICA CON OBJETOS (Ejemplo de búsqueda)
        // ==========================================================
        System.out.println("\n--- PRODUCTOS SIN STOCK ---");
        for (ApuntesClaseObjeto p : inventario) {
            if (!p.hayStock()) { // Usamos el método que creamos en la otra clase
                System.out.println("Agotado: " + p.getNombre());
            }
        }

        // ==========================================================
        // 4. MODIFICACIÓN MASIVA
        // ==========================================================
        System.out.println("\nAplicando 10% de descuento a todo...");
        for (ApuntesClaseObjeto p : inventario) {
            p.aplicarDescuento(10);
            System.out.println(p.getNombre() + " ahora cuesta: " + p.getPrecio() + "€");
        }
    }

    /*
     * ==========================================================
     * CONCEPTOS BÁSICOS: CLASE vs OBJETO
     * ==========================================================
     * 1. CLASE (El Plano / Molde):
     * Es la definición teórica. Define qué atributos (datos) y qué
     * métodos (comportamientos) tendrán los objetos.
     * Ejemplo: Clase 'Coche'.
     *
     * 2. OBJETO (La Instancia):
     * Es la realización física del molde. Es el "coche rojo con
     * matrícula 1234-ABC" que ocupa un lugar en la memoria.
     *
     * 3. ATRIBUTOS (Estado):
     * Son las variables de la clase (color, marca, precio).
     *
     * 4. MÉTODOS (Comportamiento):
     * Son las funciones que el objeto puede realizar (arrancar, frenar).
     * ==========================================================
     */
}
