package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.INTERFACES;

public interface ApuntesInterfaz {
    // 1. ATRIBUTOS: Siempre son public static final (constantes)
    int VOLUMEN_MAX = 100;

    // 2. MÉTODOS: Siempre son public y abstract por defecto
    void reproducir();
    void pausar();
    void detener();

    // 3. MÉTODOS DEFAULT (Java 8+): Tienen cuerpo y no es obligatorio implementarlos
    default void mostrarInfo() {
        System.out.println("Soy un dispositivo de reproducción.");
    }

    /*
     * ==========================================================
     * INTERFACES EN JAVA
     * ==========================================================
     * 1. DEFINICIÓN:
     * Es un "contrato". Si una clase implementa una interfaz,
     * ESTÁ OBLIGADA a dar cuerpo a todos sus métodos abstractos.
     * * 2. HERENCIA MÚLTIPLE:
     * En Java, una clase solo puede heredar de UNA clase (extends),
     * pero puede implementar INFINITAS interfaces (implements A, B, C).
     * * 3. CARACTERÍSTICAS:
     * - No se pueden instanciar (No puedes hacer new Reproductor()).
     * - Todos los métodos son 'public' y 'abstract' (aunque no lo pongas).
     * - Todas las variables son constantes ('public static final').
     * * 4. MÉTODOS DEFAULT Y STATIC:
     * Desde Java 8, las interfaces pueden tener métodos con cuerpo
     * usando la palabra 'default'. Esto permite añadir funciones
     * sin romper las clases que ya usaban la interfaz.
     * ==========================================================
     */
}
