package org.example.PRUEBAS.PRUEBA_EXAMEN;

import java.util.Scanner;

public class ComprobadorDeISBN {

    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        System.out.println("Introduzca ISBN: ");
        String num_ISBN = read.nextLine();

        if (num_ISBN.contains("?")){

        }


        if (num_ISBN.matches("\\d{9}[\\dX]") || num_ISBN.matches("\\d{10}")){

            int multiplicador = 10;
            int sumador = 0;
            int longitud = num_ISBN.length();

            if (num_ISBN.contains("X")){
                sumador += 10;
                longitud--;
            }

            for (int i = 0; i < longitud; i++) {
                sumador += Integer.parseInt(String.valueOf(num_ISBN.charAt(i))) * multiplicador;
                multiplicador--;
            }

            if (sumador % 11 == 0){
                System.out.println("El ISBN es válido.");
            } else {
                System.out.println("El ISBN no es válido.");
            }

        } else {
            System.out.println("El ISBN no es válido.");
        }

    }

    public static String reparar_ISBN(String num_ISBN){

        int multiplicador = 10;
        int sumador = 0;
        int longitud = num_ISBN.length();
        int num_multiplicador = 0;

        int indice = 0;

        for (int i = 0; i < longitud; i++) {
            if (!num_ISBN.contains("?")){
                sumador += Integer.parseInt(String.valueOf(num_ISBN.charAt(i))) * multiplicador;
                multiplicador--;
            } else {
                num_multiplicador = multiplicador;
                indice = i;
            }
        }

        int x = 0;

        for (int i = 0; i < 121; i += 11) {

            x = (i - sumador) / num_multiplicador;

            if (x > 0){
                System.out.println("El num encontrado es " + x);

                num_ISBN = num_ISBN.replace("?", Integer.toString(x));

                break;
            }
        }

        if (x == 0){
            System.out.println("Número no encontrado.");
        }
        return num_ISBN;
    }
}
