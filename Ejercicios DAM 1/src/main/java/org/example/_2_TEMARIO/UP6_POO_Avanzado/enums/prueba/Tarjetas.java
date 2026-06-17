package org.example._2_TEMARIO.UP6_POO_Avanzado.enums.prueba;

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
