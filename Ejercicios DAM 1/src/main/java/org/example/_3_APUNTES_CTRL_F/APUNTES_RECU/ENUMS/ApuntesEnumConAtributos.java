package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.ENUMS;

/**
 * BLOQUE: ENUM CON ATRIBUTOS
 * Cada elemento guarda información extra.
 */
public enum ApuntesEnumConAtributos {

    // 1. DEFINICIÓN DE VALORES (Llaman al constructor de abajo)
    BAJO(1.0, "Modo Relajado"),
    MEDIO(1.5, "Modo Normal"),
    ALTO(2.0, "Modo Difícil"),
    MAXIMO(5.0, "Modo Pesadilla");

    // 2. ATRIBUTOS (Lo que guarda cada elemento)
    private final double multiplicador;
    private final String descripcion;

    // 3. CONSTRUCTOR (Se ejecuta internamente para cada valor de arriba)
    ApuntesEnumConAtributos(double multiplicador, String descripcion) {
        this.multiplicador = multiplicador;
        this.descripcion = descripcion;
    }

    // 4. GETTERS (Para sacar la info desde fuera)
    public double getMultiplicador() {
        return multiplicador;
    }

    public String getDescripcion() {
        return descripcion;
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