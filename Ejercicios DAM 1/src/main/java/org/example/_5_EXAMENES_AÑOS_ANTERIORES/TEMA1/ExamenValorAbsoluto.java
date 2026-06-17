package org.example._5_EXAMENES_AÑOS_ANTERIORES.TEMA1;

import java.util.Scanner;

public class ExamenValorAbsoluto {

    static void main() {
        int num = 0;
        Scanner read = new Scanner(System.in);
        boolean continuar;

        do {
            continuar = false;
            try {
                System.out.println("Introduce un número, por favor...");
                num = read.nextInt();
            } catch (Exception e) {
                System.out.println("El formato no es correcto");
                read.nextLine();
                continuar = true;
            }
        } while (continuar);

        if (num < 0)
            num = num * (-1);

        System.out.println("El valor absoluto es " + num);
    }
}

