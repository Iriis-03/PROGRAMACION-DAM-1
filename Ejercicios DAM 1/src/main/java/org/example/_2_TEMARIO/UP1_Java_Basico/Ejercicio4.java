package org.example._2_TEMARIO.UP1_Java_Basico;

import java.util.Scanner;

public class Ejercicio4 {
//Realizar un programa para calcular el mínimo de 3 números leídos desde teclado.
// En caso de que el usuario introduzca dos o tres números iguales,
// informaremos con el siguiente mensaje: "ERROR: hay números introducidos que son iguales".

    public static void main (){

        Scanner read = new Scanner(System.in);

        int primer_numero = 0;
        int segundo_numero = 0;
        int tercer_numero = 0;

        System.out.println("Introduce el primer número");
        primer_numero = read.nextInt();
        System.out.println("Introduce el segundo número");
        segundo_numero = read.nextInt();
        System.out.println("Introduce el tercer número");
        tercer_numero = read.nextInt();

        if (primer_numero == segundo_numero || segundo_numero == tercer_numero || primer_numero == tercer_numero) {
            System.out.println("ERROR: hay números introducidos que son iguales");
        }else{

            if (primer_numero < segundo_numero) {

                if (primer_numero < tercer_numero) {
                    System.out.println("El mínimo de los 3 es el " + primer_numero);
                } else {
                    System.out.println("El mínimo de los 3 es el " + tercer_numero);
                }
            }
            else{
                if (segundo_numero < tercer_numero) {
                    System.out.println("El mínimo de los 3 es el " + segundo_numero);
                } else {
                    System.out.println("El mínimo de los 3 es el " + tercer_numero);
                }
            }
        }
    }
}

