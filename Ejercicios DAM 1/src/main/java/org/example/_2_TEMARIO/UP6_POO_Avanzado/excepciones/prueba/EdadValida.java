package org.example._2_TEMARIO.UP6_POO_Avanzado.excepciones.prueba;

public class EdadValida extends RuntimeException {

    public EdadValida() {
        super("Edad no permitida.");
    }
}
