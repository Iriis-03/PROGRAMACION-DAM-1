package org.example.APUNTES_RECU.HERENCIA_POLIMORFISMO;

/**
 * BLOQUE: CLASE PADRE (SUPERCLASE)
 * Define los atributos y métodos genéricos.
 */
public class ApuntesClaseObjetoPadre {

    // Atributos protegidos: los hijos pueden usarlos directamente
    protected String nombre;
    protected double salarioBase;

    // Constructor del Padre
    public ApuntesClaseObjetoPadre(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método que será "Polimórfico" (los hijos lo cambiarán)
    public double calcularSueldo() {
        return this.salarioBase;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Sueldo: " + calcularSueldo() + "€";
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