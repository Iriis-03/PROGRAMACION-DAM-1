package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.ENCAPSULAMIENTO;

public class ApuntesEncapsulamiento {

    // 1. ATRIBUTOS PRIVADOS: Nadie puede hacer objeto.edad = -50;
    private String nombre;
    private int edad;
    private double saldo;

    // 2. CONSTRUCTOR: También usa los setters para validar desde el inicio
    public ApuntesEncapsulamiento(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
        this.saldo = 0.0; // El saldo empieza en 0 por defecto
    }

    // 3. GETTERS (Lectura): Para obtener el valor
    public String getNombre() {
        return nombre;
    }

    // 4. SETTERS (Escritura/Validación): El "filtro" de seguridad
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        // Validación: Solo guardamos la edad si es coherente
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("Error: Edad no válida.");
        }
    }

    // Método de solo lectura (No tiene Setter, nadie puede cambiar el saldo a dedo)
    public double getSaldo() {
        return saldo;
    }

    /*
     * ==========================================================
     * ENCAPSULAMIENTO EN JAVA
     * ==========================================================
     * 1. DEFINICIÓN:
     * Agrupar datos (atributos) y métodos en una unidad, limitando
     * el acceso directo a los datos.
     * * 2. MODIFICADORES DE ACCESO:
     * - private: Solo la propia clase lo ve (Fundamental aquí).
     * - public: Todo el mundo lo ve.
     * - protected: La clase, el paquete y los hijos lo ven.
     * - (default): Solo el mismo paquete lo ve.
     * * 3. GETTERS Y SETTERS:
     * - Getter: Método que devuelve el valor (getNombre).
     * - Setter: Método que modifica el valor con validación (setNombre).
     * * 4. VENTAJAS:
     * - Control: Puedes evitar valores absurdos (edad = -1).
     * - Seguridad: Puedes hacer atributos de "solo lectura" (sin setter).
     * - Flexibilidad: Puedes cambiar la lógica interna sin romper el
     * código de quien usa tu clase.
     * ==========================================================
     */
}
