package org.example.PRUEBAS.PRUEBA_EXAMEN;

import java.util.Random;
import java.util.Scanner;

public class SumaDescendente {

    static Random aleatorio = new Random();

    static void main(String[] args) {

        int num_aleatorio = aleatorio.nextInt(500, 100001);

        System.out.println("Suma descendente del número generado: " + num_aleatorio);
        System.out.print(num_aleatorio);

        int sumatorio_num = num_aleatorio;

        do {

            num_aleatorio = num_aleatorio / 10;
            sumatorio_num += num_aleatorio;

            System.out.print(" + " + num_aleatorio);

        } while (num_aleatorio > 10);

        System.out.println(" = " + sumatorio_num);


    }
}
