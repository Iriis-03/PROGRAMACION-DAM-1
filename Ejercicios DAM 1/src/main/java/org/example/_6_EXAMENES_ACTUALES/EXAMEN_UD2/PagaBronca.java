package org.example._6_EXAMENES_ACTUALES.EXAMEN_UD2;

import java.util.Scanner;

public class PagaBronca {

    static void main() {

        Scanner read = new Scanner(System.in);

        String bronca = "";
        final int puntuacion_base = 50;
        int puntuacion_total = 0;
        boolean seguir;

        System.out.println("*** BIENVENIDO A LA APP DE BRONCAS ***");

        do {
            System.out.println("-----------------------------------------------");
            System.out.println("Datos de la bronca:");
            System.out.println(" ");
            System.out.println("Selecciona la persona encargada de la bronca:");
            System.out.println("[-]. Profes");
            System.out.println("[-]. Padre");
            System.out.println("[-]. Madre");
            System.out.println("[-]. Monitor (extraescolares)");
            System.out.println("[-]. Suegra");
            System.out.println("Otros");
            System.out.println("-----------------------------------------------");
            System.out.print("Elige una opción -->");

            bronca = read.next();

            switch (bronca) {

                case "Profes":
                    puntuacion_total += puntuacion_base * 10;
                    System.out.println("Puntuación de la bronca: " + puntuacion_base * 10);
                    break;

                case "Padre":
                case "Madre":
                    puntuacion_total += puntuacion_base * 100;
                    System.out.println("Puntuación de la bronca: " + puntuacion_base * 100);
                    break;

                case "Monitor":
                    puntuacion_total += puntuacion_base * 5;
                    System.out.println("Puntuación de la bronca: " + puntuacion_base * 5);
                    break;

                case "Suegra":
                    puntuacion_total += puntuacion_base * 1000;
                    System.out.println("Puntuación de la bronca: " + puntuacion_base * 1000);
                    break;

                default:
                    break;

            }
            System.out.print("¿Quieres añadir otra bronca? (S/N): ");
            String otra_bronca = read.next();
            otra_bronca = otra_bronca.toUpperCase();
            seguir = otra_bronca.equals("S");

            System.out.println("Resultados semanales:");
            System.out.println("---------------------");
            System.out.println("Puntuación total: " + puntuacion_total);
        } while (seguir);

            if (puntuacion_total > 100000){
                System.out.println("ESTA SEMANA SIN PAGA.");
            }else if (puntuacion_total > 10000){
                System.out.println("ESTA SEMANA MEDIA PAGA.");
            }else{
                System.out.println("ESTA SEMANA TE LIBRAS.");
            }
    }
}
