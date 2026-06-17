package org.example._2_TEMARIO.UP6_POO_Avanzado.excepciones.CajeroAutomatico;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException() {
        super("Introduce cantidad a retirar inferior al saldo disponible");
    }
}
