package org.example._4_EJERCICIOS;

import java.util.Scanner;

    public class Prueba_Practica1_TEMA2_ {

        static void main() {

            Scanner read = new Scanner(System.in);

            int dia_int = 0;
            int mes_int = 0;
            int anyo_int = 0;
            Integer resultado = 0;
            String resultado_string;
            String cifra1_string = "";
            String cifra2_string = "";
            String cifra3_string = "";
            String cifra4_string = "";
            int resultado_cifra = 0;

            System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa)");
            String fecha = read.nextLine();

            if (fecha.charAt(2) != '/' || fecha.charAt(5) != '/') {
                System.out.println("ERROR DE FORMATO, VUELVE A INTRODUCIR LA FECHA CORRECTAMENTE");
            } else {

                String dia_string = fecha.substring(0, 2);
                String mes_string = fecha.substring(3, 5);
                String anyo_string = fecha.substring(6, 10);

                dia_int = Integer.parseInt(dia_string);
                mes_int = Integer.parseInt(mes_string);
                anyo_int = Integer.parseInt(anyo_string);


                if (dia_int < 1 || dia_int > 31) {
                    System.out.println("ERROR FORMATO DÍA INCORRECTO");
                } else if (mes_int < 1 || mes_int > 12) {
                    System.out.println("ERROR FORMATO MES INCORRECTO");
                } else if (anyo_int < 1900 || anyo_int > 2025) {
                    System.out.println("ERROR FORMATO AÑO INCORRECTO");
                } else {
                    resultado = dia_int + mes_int + anyo_int;
                    System.out.println(dia_int + "+" + mes_int + "+" + anyo_int + "=" + resultado);
                    resultado_string = resultado.toString();

                    cifra1_string = "" + resultado_string.charAt(0);
                    cifra2_string = "" + resultado_string.charAt(1);
                    cifra3_string = "" + resultado_string.charAt(2);
                    cifra4_string = "" + resultado_string.charAt(3);

                    int cifra1_int = Integer.parseInt(cifra1_string);
                    int cifra2_int = Integer.parseInt(cifra2_string);
                    int cifra3_int = Integer.parseInt(cifra3_string);
                    int cifra4_int = Integer.parseInt(cifra4_string);

                    resultado_cifra = cifra1_int + cifra2_int + cifra3_int + cifra4_int;
                    System.out.println(cifra1_int + "+" + cifra2_int + "+" + cifra3_int + "+" + cifra4_int + "=" + resultado_cifra);
                    System.out.println("Tu número de la suerte es " + resultado_cifra);

                }
            }


        }
    }