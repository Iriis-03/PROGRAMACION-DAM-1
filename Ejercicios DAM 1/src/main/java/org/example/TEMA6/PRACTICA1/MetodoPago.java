package org.example.TEMA6.PRACTICA1;

public abstract class MetodoPago {

    public abstract void procesarPago(double importe);

    public boolean validar(){
        return true;
    }
}
