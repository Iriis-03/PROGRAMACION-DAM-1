package org.example._2_TEMARIO.UP2_Estructuras_Control.RANDOM;

import java.util.Random;

public class random {

    static void main() {

        Random aleatorio = new Random();

        int numero = aleatorio.nextInt(6) + 1; //Del 1 al 6
        System.out.println(numero);

        int numero2 = aleatorio.nextInt(9, 10); //Solo se mostrará el 9
        System.out.println(numero2);

        double numero3 = aleatorio.nextDouble(); //De 0 a 0.99
        System.out.println(numero3);

        double numero4 = aleatorio.nextDouble() * 10; //De 0 a 10 con decimal
        System.out.println(numero4);

        double numero5 = Math.random() * 10 + 1;
        System.out.println(numero5);
    }

}
