package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.HERENCIA_POLIMORFISMO;

/**
 * BLOQUE: CLASE HIJA (SUBCLASE)
 * Usa 'extends' para heredar del Padre.
 */
public class ApuntesClaseObjetoHijo extends ApuntesClaseObjetoPadre {

    private double comision;

    public ApuntesClaseObjetoHijo(String nombre, double salarioBase, double comision) {
        // 'super' envía los datos al constructor del Padre
        super(nombre, salarioBase);
        this.comision = comision;
    }

    // POLIMORFISMO: Sobrescribimos el método del padre
    @Override
    public double calcularSueldo() {
        // El sueldo del hijo es el base del padre + su comisión
        return super.salarioBase + this.comision;
    }

    // Método exclusivo del hijo
    public void enviarReporteVentas() {
        System.out.println(nombre + " está enviando el reporte mensual...");
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
