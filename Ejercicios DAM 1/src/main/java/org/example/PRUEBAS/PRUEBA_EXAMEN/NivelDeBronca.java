package org.example.PRUEBAS.PRUEBA_EXAMEN;

import java.util.Scanner;

public class NivelDeBronca {

    static Scanner read = new Scanner(System.in);
    static String opcion;
    static int contador_broncas = 1;

    static void main(String[] args) {

        int acumulador_puntuacion = 0;
        String anyadir_bronca;

        System.out.println("*** BIENVENIDO A LA APP DE BRONCAS ***");
        System.out.println();

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Datos de la bronca " + contador_broncas + ": ");
            System.out.println();
            System.out.println("Selecciona la persona encargada de la bronca: ");
            System.out.println("    [-]. Profes ");
            System.out.println("    [-]. Padre ");
            System.out.println("    [-]. Madre ");
            System.out.println("    [-]. Monitor (extraescolares) ");
            System.out.println("    [-]. Suegra ");
            System.out.println("    Otros");
            System.out.println("--------------------------------------------------");
            System.out.print("Elige una opción --> " );
            opcion = read.nextLine();

            System.out.println();
            acumulador_puntuacion = menu(acumulador_puntuacion);

            System.out.print("¿Quieres añadir otra bronca? (S/N): ");
            anyadir_bronca = read.nextLine();
            contador_broncas++;

        } while (anyadir_bronca.equalsIgnoreCase("S"));

        System.out.println();
        System.out.println("Resultados semanales: ");
        System.out.println("--------------------------------------------------");
        System.out.print("Puntuación total: " + acumulador_puntuacion);
        System.out.println();

        if (acumulador_puntuacion > 100000){
            System.out.println();
            System.out.println("ESTA SEMANA SIN PAGA.");
        } else if (acumulador_puntuacion >= 10000 && acumulador_puntuacion < 100000) {
            System.out.println();
            System.out.println("ESTA SEMANA MEDIA PAGA.");
        } else {
            System.out.println();
            System.out.println("ESTA SEMANA TE LIBRAS.");
        }
    }

    public static int menu(int acumulador_puntuacion){

        int puntuacion = 50;

        switch (opcion){
            case "Profes":
                puntuacion = puntuacion * 10;
                System.out.println("Puntuación de la bronca " + contador_broncas + ": " + puntuacion);
                System.out.println();
                break;

            case "Padre":
            case "Madre":
                puntuacion = puntuacion * 100;
                System.out.println("Puntuación de la bronca " + contador_broncas + ": " + puntuacion);
                System.out.println();
                break;

            case "Monitor":
                puntuacion = puntuacion * 5;
                System.out.println("Puntuación de la bronca " + contador_broncas + ": " + puntuacion);
                System.out.println();
                break;

            case "Suegra":
                puntuacion = puntuacion * 1000;
                System.out.println("Puntuación de la bronca " + contador_broncas + ": " + puntuacion);
                System.out.println();
                break;

            default:
                break;
        }

        acumulador_puntuacion += puntuacion;
        return acumulador_puntuacion;

    }
}
