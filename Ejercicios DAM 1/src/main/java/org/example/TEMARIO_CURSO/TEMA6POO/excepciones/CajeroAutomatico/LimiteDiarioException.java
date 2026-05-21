package org.example.TEMARIO_CURSO.TEMA6POO.excepciones.CajeroAutomatico;

public class LimiteDiarioException extends RuntimeException {
    public LimiteDiarioException() {
        super("Introduce cantidad a retirar inferior a 600€");
    }
}
