package org.example._2_TEMARIO.UP6_POO_Avanzado.excepciones.CajeroAutomatico;

public class LimiteDiarioException extends RuntimeException {
    public LimiteDiarioException() {
        super("Introduce cantidad a retirar inferior a 600€");
    }
}
