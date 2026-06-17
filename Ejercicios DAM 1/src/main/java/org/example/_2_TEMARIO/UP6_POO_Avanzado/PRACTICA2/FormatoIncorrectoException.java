package org.example._2_TEMARIO.UP6_POO_Avanzado.PRACTICA2;

public class FormatoIncorrectoException extends RuntimeException {
    public FormatoIncorrectoException() {
        super("ERROR. Formato incorrecto. Introduce los datos con el formato N-N-N");
    }
}
