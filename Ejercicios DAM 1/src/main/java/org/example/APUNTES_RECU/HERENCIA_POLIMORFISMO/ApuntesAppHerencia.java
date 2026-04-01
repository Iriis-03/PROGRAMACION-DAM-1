package org.example.APUNTES_RECU.HERENCIA_POLIMORFISMO;

import java.util.Scanner;

public class ApuntesAppHerencia {

    public static void main(String[] args) {

        // 1. Crear objetos de ambos tipos
        ApuntesClaseObjetoPadre emp1 = new ApuntesClaseObjetoPadre("Juan", 1200);
        ApuntesClaseObjetoHijo com1 = new ApuntesClaseObjetoHijo("Marta", 1200, 500);

        // 2. POLIMORFISMO: Una variable Padre puede guardar un Hijo
        ApuntesClaseObjetoPadre mix = new ApuntesClaseObjetoHijo("Carlos", 1000, 300);

        // 3. PROBAR MÉTODOS
        System.out.println("--- LISTADO DE NÓMINAS ---");
        System.out.println(emp1); // Usa el método del padre
        System.out.println(com1); // Usa el método sobrescrito del hijo
        System.out.println(mix);  // ¡Usa el del hijo automáticamente! (Polimorfismo)

        // 4. ARRAY POLIMÓRFICO (Típico de examen)
        // Guardamos distintos tipos en una sola lista del tipo Padre
        ApuntesClaseObjetoPadre[] plantilla = {emp1, com1, mix};

        System.out.println("\n--- RECORRIENDO PLANTILLA ---");
        for (ApuntesClaseObjetoPadre e : plantilla) {
            // Java sabe a qué método 'calcularSueldo' llamar en cada caso
            System.out.println("Sueldo final de " + e.nombre + ": " + e.calcularSueldo());
        }
    }

    /*
     * ==========================================================
     * HERENCIA (Inheritance) - "ES UN..."
     * ==========================================================
     * 1. DEFINICIÓN:
     * Es el mecanismo por el cual una clase (Hija/Subclase) adquiere
     * los atributos y métodos de otra (Padre/Superclase).
     *
     * 2. OBJETIVO:
     * Reutilizar código y crear una jerarquía lógica.
     * Ejemplo: Clase 'Perro' hereda de Clase 'Animal'.
     *
     * 3. REGLAS CLAVE:
     * - Se usa la palabra reservada 'extends'.
     * - Java NO permite herencia múltiple de clases (solo puedes tener UN padre).
     * - La clase hija puede usar todo lo del padre (si es public o protected),
     * pero el padre NO sabe nada de lo que tiene la hija.
     *
     * 4. LA PALABRA 'super':
     * - super(): Llama al constructor del padre (debe ser la primera línea).
     * - super.metodo(): Llama a un método del padre que ha sido sobrescrito.
     *
     * ==========================================================
     * POLIMORFISMO (Polymorphism) - "MUCHAS FORMAS"
     * ==========================================================
     * 1. DEFINICIÓN:
     * Es la capacidad de un objeto de tomar diferentes formas. En Java,
     * una variable de tipo 'Padre' puede almacenar un objeto de tipo 'Hija'.
     *
     * 2. EJEMPLO VISUAL:
     * Animal miMascota = new Perro(); // ¡Esto es Polimorfismo!
     * miMascota.hacerSonido();       // Ejecutará el sonido del Perro, no del Animal.
     *
     * 3. SOBRESCRITURA (@Override):
     * Es la base del polimorfismo. La hija redefine un método del padre
     * para adaptarlo a su propia naturaleza.
     *
     * 4. CASTING DE OBJETOS:
     * - Upcasting (Automático): Perro p = new Perro(); Animal a = p;
     * - Downcasting (Manual): Perro p = (Perro) a; // Cuidado con ClassCastException.
     * ==========================================================
     */
}
