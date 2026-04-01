package org.example.APUNTES_RECU.SOBRECARGA_METODOS;

public class ApuntesAppSobrecarga {

     static void main(String[] args) {
        ApuntesSobrecarga obj = new ApuntesSobrecarga();

        // Java sabe a qué método llamar fijándose en los argumentos que pasamos
        System.out.println("Suma 2 ints: " + obj.sumar(5, 10));          // Llama al 1
        System.out.println("Suma 3 ints: " + obj.sumar(5, 10, 15));      // Llama al 2
        System.out.println("Suma doubles: " + obj.sumar(2.5, 3.5));      // Llama al 3
        obj.sumar("Hola", "Java");                                       // Llama al 4
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
