package org.example._2_TEMARIO.UP3_Estructuras_Datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ruleta {

    static void main() {

        Scanner read = new Scanner(System.in);

        Random aleatorio = new Random();

        final String COLORES[] = {"rojo","negro"};

        Integer numeros[] = new Integer[37];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = i;
        }

        final String PAR_IMPAR[] = {"par","impar"};

        System.out.println("Introduce tu número de apuesta (0-36): ");
        int numero_apuesta = read.nextInt();

        if (!Arrays.asList(numeros).contains(numero_apuesta)){
            System.out.println("ERROR. El número no es válido (0-36)");
            return;
        }

        String par_impar_apuesta = "";
        String color_apuesta = "";
        if (numero_apuesta != 0){

            System.out.println("Introduce el color de tu apuesta (rojo-negro): ");
            color_apuesta = read.next().toLowerCase();

            if (!Arrays.asList(COLORES).contains(color_apuesta)){
                System.out.println("ERROR. El color no es válido (rojo-negro): ");
                return;
            }

            System.out.println("Introduce apuesta (par-impar): ");
            par_impar_apuesta = read.next().toLowerCase();

            if (!Arrays.asList(PAR_IMPAR).contains(par_impar_apuesta)){
                System.out.println("ERROR. La apuesta no es válida (par-impar): ");
                return;
            }
        }

        String color_sorteo = COLORES[aleatorio.nextInt(2)]; //colores[0] o colores[1]
        int numero_sorteo = numeros[aleatorio.nextInt(37)];

        String par_impar_sorteo = numero_sorteo % 2 == 0 ? "par":"impar";

        System.out.println("Ha salido " + numero_sorteo + " " + color_sorteo + " " + par_impar_sorteo);

        if (numero_sorteo == numero_apuesta && color_sorteo.equals(color_apuesta) && par_impar_sorteo.equals(par_impar_apuesta)){
            System.out.println("¡HAS GANADO!");
        } else if (numero_sorteo == numero_apuesta) {
            System.out.println("Has acertado el número");
        } else if (color_sorteo.equals(color_apuesta)) {
            System.out.println("Has acertado el color " + color_apuesta);
        } else if (par_impar_apuesta.equals(par_impar_sorteo)) {
            System.out.println("Has acertado " + par_impar_apuesta);
        } else {
            System.out.println("Has perdido");
        }
    }
}
