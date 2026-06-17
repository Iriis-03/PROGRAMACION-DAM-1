package org.example._2_TEMARIO.UP6_POO_Avanzado.enums.Ejercicio2;

public enum Dificultad {

    FACIL(2), MEDIO(4), DIFICIL(8), EXPERTO(10);

    private final int multiplicador;

    Dificultad(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

}
