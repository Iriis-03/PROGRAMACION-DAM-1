package org.example.TEMARIO_CURSO.TEMA6POO.PRACTICA2;

public class FormatoIncorrectoException extends RuntimeException {
    public FormatoIncorrectoException() {
        super("ERROR. Formato incorrecto. Introduce los datos con el formato N-N-N");
    }
}
