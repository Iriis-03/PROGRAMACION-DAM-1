package org.example._2_TEMARIO.UP2_Estructuras_Control.RANDOM;

import java.util.Random;

public class Rango_recomendado {

    static void main() {
        Random aleatorio = new Random();
        //de 500 a 100.000
        int recomendado = aleatorio.nextInt(100000 - 500 +1) + 500;
        //int recomendado = aleatorio.nextInt(max - min + 1) + min;
    }
}
