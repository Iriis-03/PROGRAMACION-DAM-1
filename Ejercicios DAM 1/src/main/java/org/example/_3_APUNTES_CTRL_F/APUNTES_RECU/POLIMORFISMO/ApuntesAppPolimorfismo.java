package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.POLIMORFISMO;

import java.util.ArrayList;

/**
 * BLOQUE: EXPLICACIÓN DEL POLIMORFISMO
 * "Poli" (muchas) "Morfismo" (formas).
 * Un objeto puede ser visto como su clase padre, pero actuar como su clase hija.
 */
public class ApuntesAppPolimorfismo {

    static void main(String[] args) {

        // ----------------------------------------------------------
        // CASO 1: COLECCIONES HETEROGÉNEAS (El más común)
        // ----------------------------------------------------------
        // Tienes una lista de "Figuras". No importa si son círculos o cuadrados,
        // todos son figuras y todos tienen el método calcularArea().

        ArrayList<Figura> inventarioFiguras = new ArrayList<>();

        // Polimorfismo: Una variable de tipo Figura guarda un Circulo
        inventarioFiguras.add(new Circulo(5.0));
        inventarioFiguras.add(new Cuadrado(10.0));

        System.out.println("--- ESCENARIO 1: LISTAS MIXTAS ---");
        for (Figura f : inventarioFiguras) {
            // Aquí está la magia: f.getArea() llamará a la fórmula del círculo
            // o a la del cuadrado automáticamente según lo que sea 'f'.
            System.out.println("Área de la figura: " + f.getArea());
        }

        // ----------------------------------------------------------
        // CASO 2: PARÁMETROS GENÉRICOS EN MÉTODOS
        // ----------------------------------------------------------
        // Puedes crear un método que acepte "cualquier Figura" y la dibuje.
        System.out.println("\n--- ESCENARIO 2: MÉTODOS FLEXIBLES ---");
        dibujarCualquierFigura(new Circulo(2.0));
        dibujarCualquierFigura(new Cuadrado(4.0));
    }

    /**
     * Este método es polimórfico. No le importa qué figura le des,
     * siempre que herede de la clase Figura.
     */
    public static void dibujarCualquierFigura(Figura fig) {
        System.out.print("Dibujando... ");
        fig.dibujar(); // Se comporta distinto según el objeto real
    }
}

// ==========================================================
// ESTRUCTURA DE CLASES PARA EL EJEMPLO
// ==========================================================

abstract class Figura {
    public abstract double getArea();
    public abstract void dibujar();
}

class Circulo extends Figura {
    private double radio;
    public Circulo(double radio) { this.radio = radio; }

    @Override
    public double getArea() { return Math.PI * radio * radio; }

    @Override
    public void dibujar() { System.out.println("Haciendo un círculo redondo."); }
}

class Cuadrado extends Figura {
    private double lado;
    public Cuadrado(double lado) { this.lado = lado; }

    @Override
    public double getArea() { return lado * lado; }

    @Override
    public void dibujar() { System.out.println("Dibujando 4 lados iguales."); }
}

/*
 * ==========================================================
 * POLIMORFISMO (Capacidad de tomar varias formas)
 * ==========================================================
 * 1. DEFINICIÓN:
 * Es la capacidad de una variable de tipo "Padre" de referenciar
 * (apuntar) a un objeto de tipo "Hijo".
 *
 * 2. REGLA DE ORO:
 * "El tipo de la variable determina qué métodos puedes llamar,
 * pero el tipo del objeto real determina qué código se ejecuta".
 *
 * 3. REQUISITOS:
 * - Debe haber Herencia (extends) o Implementación (implements).
 * - Debe haber Sobrescritura de métodos (@Override).
 *
 * 4. TIPOS DE POLIMORFISMO:
 * - Estático (Sobrecarga): Varios métodos con mismo nombre pero distintos parámetros.
 * - Dinámico (Sobrescritura): Un método que se comporta distinto según el objeto real.
 * ==========================================================
 */