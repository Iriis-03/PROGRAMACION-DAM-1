package org.example.SIMULACRO;

public class DocenteEnHuelga extends RuntimeException {
    public DocenteEnHuelga() {
        super("El docente ya está en huelga");
    }
}
