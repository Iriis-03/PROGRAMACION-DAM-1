package org.example.TEMA6POO.excepciones.CajeroAutomatico;

public class DepositoMaximoException extends RuntimeException {
    public DepositoMaximoException() {
        super("Introduce cantidad a ingresar inferior a 3000€");
    }
}
