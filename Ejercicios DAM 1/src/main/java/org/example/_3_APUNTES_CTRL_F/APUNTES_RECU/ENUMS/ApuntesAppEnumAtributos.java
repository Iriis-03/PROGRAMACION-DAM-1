package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.ENUMS;

public class ApuntesAppEnumAtributos {

    public static void main(String[] args) {

        // Elegimos un valor
        ApuntesEnumConAtributos nivel = ApuntesEnumConAtributos.MAXIMO;

        // Accedemos a sus atributos mediante los Getters que creamos
        System.out.println("Nivel seleccionado: " + nivel); // Imprime MAXIMO
        System.out.println("Descripción: " + nivel.getDescripcion());
        System.out.println("El daño se multiplica por: " + nivel.getMultiplicador());

        // Ejemplo práctico de uso:
        double dañoBase = 100;
        double dañoFinal = dañoBase * nivel.getMultiplicador();

        System.out.println("Daño final recibido: " + dañoFinal);

        // RECORRER TODO CON SUS ATRIBUTOS
        System.out.println("\n--- TABLA DE DIFICULTADES ---");
        for (ApuntesEnumConAtributos d : ApuntesEnumConAtributos.values()) {
            System.out.println(d + " -> " + d.getDescripcion() + " (x" + d.getMultiplicador() + ")");
        }
    }

    /*
     * ==========================================================
     * ENUMS (ENUMERACIONES)
     * ==========================================================
     * 1. DEFINICIÓN:
     * Es una clase especial que representa un grupo de constantes
     * (variables que no cambian, 'static' y 'final').
     *
     * 2. SINTAXIS BÁSICA:
     * enum Dia { LUNES, MARTES, MIERCOLES, JUEVES, VIERNES }
     * - Los valores se escriben siempre en MAYÚSCULAS por convención.
     * - No se usa 'new' para crear un Enum.
     *
     * 3. VENTAJAS:
     * - Seguridad de tipo: Evitas errores como escribir "Lunes " (con espacio)
     * o "Lunez". Solo se permiten los valores definidos.
     * - Legibilidad: El código se entiende mucho mejor.
     * - Uso en Switch: Los Enums encajan perfectamente con la estructura switch.
     *
     * 4. ENUMS CON ATRIBUTOS (Avanzado):
     * Un Enum puede tener constructores, variables y métodos como una clase normal.
     * Ejemplo: ORO(500), PLATA(250), BRONCE(100);
     *
     * 5. MÉTODOS ÚTILES:
     * - .values(): Devuelve un array con todos los valores del Enum.
     * - .valueOf("STRING"): Convierte un texto al valor del Enum correspondiente.
     * - .ordinal(): Devuelve la posición (0, 1, 2...) del valor.
     * ==========================================================
     */
}
