package org.example.TEMARIO_CURSO.TEMA6POO.excepciones.CajeroAutomatico;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException() {
        super("Introduce cantidad a retirar inferior al saldo disponible");
    }
}
