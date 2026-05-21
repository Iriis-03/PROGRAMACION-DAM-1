package org.example.TEMARIO_CURSO.TEMA2.PRACTICAS;

import java.util.Scanner;

public class Practica1_TEMA2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa):"); //Se pide al usuario que escriba la fecha de nacimiento
        String fecha = read.nextLine();

        if (fecha.charAt(2) != '/' || fecha.charAt(5) != '/') { //Se utiliza charAt para seleccionar justo el carácter que necesitas modificar.
            System.out.println("El formato no es correcto."); //Tenía que modificar el char 2 y 8, qué es donde se encuentran las barras, para que en caso que el usuario introduzca algo diferente (!=) a las barras, le salte un error.
        } else {

                String dia_string = fecha.substring(0, 2); //Separamos el día de la fecha introducida por el usuario (substring) según las posiciones de los 3 primeros carácteres (contando las barras)
                String mes_string = fecha.substring(3, 5); //Separamos el mes de la fecha introducida por el usuario (substring) según las posiciones los carácteres correspondientes (contando las barras)
                String anyo_string = fecha.substring(6, 10); //Separamos el año de la fecha introducida por el usuario (substring) según las posiciones los carácteres correspondientes

                int dia_int = Integer.parseInt(dia_string); //pasamos el dia_string a dia_int
                int mes_int = Integer.parseInt(mes_string); //pasamos el mes_string a mes_int
                int anyo_int = Integer.parseInt(anyo_string); //pasamos el anyo_string a anyo_int

                //Se verifica cualquier error que pueda introducir el usuario. Según el error detectado dará un mensaje u otro.

                if ((dia_int > 31 || dia_int < 1) && (mes_int > 12 || mes_int < 1) && (anyo_int > 2025 || anyo_int < 1900)) {
                    System.out.println("ERROR DE LECTURA. FECHA INCORRECTA");
                } else if (dia_int > 31 || dia_int < 1) {
                    System.out.println("ERROR DE LECTURA. DÍA INCORRECTO");
                } else if (mes_int > 12 || mes_int < 1) {
                    System.out.println("ERROR DE LECTURA. MES INCORRECTO");
                } else if (anyo_int > 2025 || anyo_int < 1900) {
                    System.out.println("ERROR DE LECTURA. AÑO INCORRECTO");
                } else {

                   //Una vez verificado todo lo anterior y que esta correcta la fecha introducida por el usuario, sumamos el día, mes y año

                    int suma = dia_int + mes_int + anyo_int;
                    System.out.println(dia_int + " + " + mes_int + " + " + anyo_int + " = " + suma);

                    String suma_string = Integer.toString(suma); //Para poder separar los números según sus carácteres primero tenemos que pasar toda la suma a String

                    //Se separa cada cifra según sus carácteres correspondientes para asi poder hacer la suma de cada cifra del resultado de la suma de la fecha entera

                    int cifra1 = Integer.parseInt(suma_string.substring(0, 1));
                    int cifra2 = Integer.parseInt(suma_string.substring(1, 2));
                    int cifra3 = Integer.parseInt(suma_string.substring(2, 3));
                    int cifra4 = Integer.parseInt(suma_string.substring(3, 4));

                    int resultado = cifra1 + cifra2 + cifra3 + cifra4;

                    System.out.println(cifra1 + " + " + cifra2 + " + " + cifra3 + " + " + cifra4 + " = " + resultado); //Se imprime la operación de la suma todas las cifras
                    System.out.println("Tu número de la suerte es: " + resultado); //Se imprime un mensaje diciendo el número de la suerte del usuario e imprime el resultado
                }
        }
    }
}
