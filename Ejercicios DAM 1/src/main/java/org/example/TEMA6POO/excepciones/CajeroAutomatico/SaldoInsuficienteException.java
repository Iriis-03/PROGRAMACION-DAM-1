package org.example.TEMA6POO.excepciones.CajeroAutomatico;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException() {
        super("Introduce cantidad a retirar inferior al saldo disponible");
    }
}
