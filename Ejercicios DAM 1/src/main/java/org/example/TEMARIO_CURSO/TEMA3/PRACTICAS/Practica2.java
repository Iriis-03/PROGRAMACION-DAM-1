package org.example.TEMARIO_CURSO.TEMA3.PRACTICAS;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica2 {

    static void main() {

        Scanner read = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Introduce los datos de tu boleto: ");
        String boleto = read.next();

        boolean formato = boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}");

        String boleto_array[] = boleto.split("[-/]");
        int boleto_array_int[] = new int[7];

        for (int i = 0; i < 7; i++){
            boleto_array_int[i] = Integer.parseInt(boleto_array[i]);
        }
        int [] resultado_sorteo = new int [8];
        boolean contiene;
        int i = 0;
        do {
            int num_aleatorio_boleto = aleatorio.nextInt(1,50);
            contiene = false;

            for (int j = 0; j < i; j++) {
                    if (resultado_sorteo[j] == num_aleatorio_boleto) {
                        contiene = true;
                        break;
                    }
            }
            if (contiene)
                continue;
            resultado_sorteo[i] = num_aleatorio_boleto;
            i++;
        }while (i < 7);

        int reintegro = aleatorio.nextInt(0, 10);
        resultado_sorteo[7] = reintegro; //reintegro posición 7

        System.out.println("Tu boleto:");
        System.out.println(Arrays.toString(boleto_array_int));
        System.out.println("---------------------------");
        System.out.println("Resultado Sorteo:");
        System.out.println(Arrays.toString(resultado_sorteo));
        System.out.print("Complementario: ");
        System.out.println(resultado_sorteo[6]);
        System.out.print("Reintegro: ");
        System.out.println(resultado_sorteo[7]);

        int premio = 0;

        for (int j = 0; j < 6; j++) {
            for (int n = 0; n < 6; n++) {
                if (resultado_sorteo[n] == boleto_array_int[j]) {
                    premio++;
                    break;
                }
            }
        }

        switch (premio){

            case 6:
                if (boleto_array_int[6] == resultado_sorteo[7])
                    System.out.println("¡HAS GANADO LA CATEGORÍA ESPECIAL!");
                else
                    System.out.println("¡HAS GANADO LA 1ª CATEGORÍA!");
                break;
            case 5:
                    for (int j = 0; j < i; j++) {
                        if (boleto_array_int[j] == resultado_sorteo[6]) {
                            contiene = true;
                            break;
                        }
                    }
                if (contiene)
                    System.out.println("¡HAS GANADO LA 2ª CATEGORÍA!");
                else
                    System.out.println("¡HAS GANADO LA 3ª CATEGORÍA!");
                break;
            case 4:
                System.out.println("¡HAS GANADO LA 4ª CATEGORÍA!");
                break;
            case 3:
                System.out.println("¡HAS GANADO LA 5ª CATEGORÍA!");
                break;
            default:
                if (boleto_array_int [6] == resultado_sorteo[7])
                    System.out.println("¡HAS GANADO EL REINTEGRO!");
                else
                    System.out.println("NO PREMIADO :(");
                break;
        }
    }
}
