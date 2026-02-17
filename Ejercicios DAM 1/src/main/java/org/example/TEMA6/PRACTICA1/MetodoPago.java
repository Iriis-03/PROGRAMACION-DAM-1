package org.example.TEMA6.PRACTICA1;

/**
 * Clase abstracta para el método de pago
 * Hace uso del polimorfismo al tratar sus clases hijas por igual
 */
public abstract class MetodoPago {

    /**
     * Procesa el pago con el importe introducido por teclado
     * @param importe importe a pagar
     */
    public abstract void procesarPago(double importe);

    /**
     * Valida los datos del método de pago correspondiente
     * @return true si los datos estan introducidos correctamente, de lo contrario, devolverá un false
     */
    public boolean validar(){
        return true;
    }
}
