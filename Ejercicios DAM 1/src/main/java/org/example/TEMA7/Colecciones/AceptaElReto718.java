package org.example.TEMA7.Colecciones;

import java.util.HashSet;
import java.util.Scanner;

public class AceptaElReto718 {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        while (casoDePrueba()) {
        }
    }

    public static boolean casoDePrueba() {

        int num_pen = read.nextInt();
        read.nextLine();

        if (num_pen == 0)
            return false;

        HashSet<Integer> pendientes_sin_pareja = new HashSet<>();
        int num_parejas = 0;

        for (int i = 0; i < num_pen; i++) {

            int pendiente = read.nextInt();

            if (pendientes_sin_pareja.contains(pendiente)) {
                num_parejas++;
                pendientes_sin_pareja.remove(pendiente);
            } else {
                pendientes_sin_pareja.add(pendiente);
            }
        }

        System.out.println(num_parejas);
        return true;
    }
}
