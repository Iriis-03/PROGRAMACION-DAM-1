package org.example.TEMARIO_CURSO.TEMA6POO.enums.prueba;

public enum Tarjetas {

    VISA(0), MAESTRO(1.5), MASTERCARD(5);

    private final double comision;

    Tarjetas(double comision){
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }
}
