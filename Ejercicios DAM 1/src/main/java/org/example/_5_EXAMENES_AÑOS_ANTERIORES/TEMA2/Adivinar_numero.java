package org.example._5_EXAMENES_AÑOS_ANTERIORES.TEMA2;

import java.util.Scanner;

public class Adivinar_numero {

    static void main() {

        Scanner read = new Scanner(System.in);

        boolean perdedor = true;

        System.out.println("Acabo de pensar un número [0-100]… ¿puedes adivinarlo? ¡Tienes 10 intentos!");

        int aleatorio = (int) (Math.random() * 100);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Intento " + i + ". Introduce un número: ");
            int num = read.nextInt();

            if (num > aleatorio) {
                System.out.println("Tu número es mayor al que he pensado.");
                System.out.println("--------------------------------------");

            } else if (num < aleatorio) {
                System.out.println("Tu número es menor al que he pensado.");
                System.out.println("--------------------------------------");

            } else {
                System.out.println("¡HAS ACERTADO! El número era " + aleatorio);
                perdedor = false;
                break;
            }
        }
        if (perdedor){
            System.out.println("¡HAS PERDIDO! El número era " + aleatorio);
        }
    }
}