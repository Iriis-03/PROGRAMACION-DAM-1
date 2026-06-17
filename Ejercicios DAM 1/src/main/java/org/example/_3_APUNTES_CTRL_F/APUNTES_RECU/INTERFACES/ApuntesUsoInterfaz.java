package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.INTERFACES;

public class ApuntesUsoInterfaz implements ApuntesInterfaz {

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo vídeo en MP4...");
    }

    @Override
    public void pausar() {
        System.out.println("Vídeo pausado.");
    }

    @Override
    public void detener() {
        System.out.println("Vídeo detenido.");
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