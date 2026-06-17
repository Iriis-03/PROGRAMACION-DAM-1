package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.SOBRECARGA_METODOS;

public class ApuntesSobrecarga {

    // 1. Método original: Suma de dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // 2. MÉTODO SOBRECARGADO: Mismo nombre, pero 3 parámetros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // 3. MÉTODO SOBRECARGADO: Mismo nombre, pero distinto tipo (double)
    public double sumar(double a, double b) {
        return a + b;
    }

    // 4. MÉTODO SOBRECARGADO: Mismo nombre, pero recibe un String
    public void sumar(String a, String b) {
        System.out.println("Concatenando textos: " + a + " " + b);
    }

    /*
     * ==========================================================
     * TEORÍA SOBRE SOBRECARGA DE MÉTODOS (METHOD OVERLOADING)
     * ==========================================================
     * * 1. DEFINICIÓN:
     * Es la capacidad de definir varios métodos con el mismo nombre en la
     * misma clase, siempre que su FIRMA sea diferente.
     * * 2. LA "FIRMA" DE UN MÉTODO:
     * Para que Java no se confunda, los métodos deben diferenciarse en:
     * - El número de parámetros (ej: 2 parámetros vs 3 parámetros).
     * - El tipo de parámetros (ej: int vs double).
     * - El orden de los parámetros (ej: String, int vs int, String).
     * * 3. LO QUE NO CUENTA PARA LA SOBRECARGA:
     * - El tipo de retorno: No puedes tener dos métodos que solo se
     * diferencien en que uno devuelve 'int' y el otro 'double' si los
     * parámetros son iguales. Java daría error.
     * * 4. DIFERENCIA CON SOBREESCRITURA (@Override):
     * - Sobrecarga: Misma clase, mismo nombre, DISTINTOS parámetros.
     * - Sobreescritura: Clase Hijo redefiniendo un método del Padre con
     * los MISMOS parámetros (ej: toString() o calcularArea()).
     * * 5. VENTAJAS:
     * - Mejora la legibilidad (no tienes que inventar nombres como
     * sumarDosInt, sumarTresInt, sumarDoubles...).
     * - Da flexibilidad al programador que usa tu clase.
     */
}
