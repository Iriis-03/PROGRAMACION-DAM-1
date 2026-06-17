package org.example._2_TEMARIO.UP6_POO_Avanzado.excepciones.CajeroAutomatico;

public class DepositoMaximoException extends RuntimeException {
    public DepositoMaximoException() {
        super("Introduce cantidad a ingresar inferior a 3000€");
    }
}
