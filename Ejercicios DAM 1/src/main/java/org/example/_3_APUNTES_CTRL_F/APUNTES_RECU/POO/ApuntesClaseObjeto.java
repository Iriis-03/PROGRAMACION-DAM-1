package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.POO;

/**
 * BLOQUE: DEFINICIÓN COMPLETA DE CLASE
 * Aquí definimos qué tiene y qué hace un objeto.
 */
public class ApuntesClaseObjeto {

    // ==========================================================
    // 1. ATRIBUTOS (Variables de la clase)
    // ==========================================================
    // Se ponen en 'private' para que solo se modifiquen mediante métodos.
    private String nombre;
    private double precio;
    private int stock;

    // ==========================================================
    // 2. CONSTRUCTOR (Crea el objeto)
    // ==========================================================
    // Se llama igual que la clase y sirve para dar valores iniciales.
    public ApuntesClaseObjeto(String nombre, double precio, int stock) {
        this.nombre = nombre; // 'this' diferencia el atributo del parámetro
        this.precio = precio;
        this.stock = stock;
    }

    // ==========================================================
    // 3. GETTERS Y SETTERS (Acceso a los datos)
    // ==========================================================
    // Getter: Para obtener el valor. Setter: Para cambiarlo.
    // Los setters permiten validar datos
    public String getNombre() { return nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double nuevoPrecio) { this.precio = nuevoPrecio; }

    public int getStock() { return stock; }
    public void setStock(int nuevoStock) { this.stock = nuevoStock; }

    // ==========================================================
    // 4. MÉTODOS DE LÓGICA (Comportamiento)
    // ==========================================================

    // Método que devuelve un booleano (Muy común en examen)
    public boolean hayStock() {
        return this.stock > 0;
    }

    // Método que realiza un cálculo y modifica el objeto
    public void aplicarDescuento(double porcentaje) {
        this.precio -= (this.precio * porcentaje / 100);
    }

    // ==========================================================
    // 5. MÉTODO TOSTRING (Para System.out.println)
    // ==========================================================
    // Sirve para que al imprimir el objeto se vea el contenido y no la dirección de memoria.
    @Override
    public String toString() {
        return "PRODUCTO: " + nombre + " | PRECIO: " + precio + "€ | STOCK: " + stock;
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