package org.example.TEMARIO_CURSO.TEMA6POO.excepciones.prueba;

public class EdadValida extends RuntimeException {

    public EdadValida() {
        super("Edad no permitida.");
    }
}
