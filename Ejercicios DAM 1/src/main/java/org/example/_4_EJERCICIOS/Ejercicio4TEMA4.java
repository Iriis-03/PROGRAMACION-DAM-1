package org.example._4_EJERCICIOS;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4TEMA4 {

    static void main(String[] args) {

        double[] recaudacion = recaudacion();

        System.out.println(Arrays.toString(recaudacion));
        System.out.println("El día que ha recaudado más ventas es... " + dia_de_mas_ventas(recaudacion));
        System.out.println("El día que ha recaudado menos ventas es... " + dia_de_menos_ventas(recaudacion));
        System.out.println(media_semanal(recaudacion));
        System.out.println(recaudacion_domingo(recaudacion));
    }

    public static double[] recaudacion(){

        Scanner read = new Scanner(System.in);

        double recaudacion_semanal[] = new double[7];

        System.out.println("Introduce la recaudación una semana: ");

        String entrada;

        for (int i = 0; i < recaudacion_semanal.length; i++) {
            entrada = read.next();
            double dato = Double.parseDouble(entrada);
            recaudacion_semanal[i] = dato;
        }

        return recaudacion_semanal;
    }

    public static String dia_de_mas_ventas(double[] recaudacion_semanal){

        double recaudacion_mayor = recaudacion_semanal[0];
        int dia = 0;

        for (int i = 0; i < recaudacion_semanal.length; i++) {
            if (recaudacion_semanal[i] > recaudacion_mayor){
                recaudacion_mayor = recaudacion_semanal[i];
                dia = i;
            }
        }

        switch (dia){
            case 0:
                return "Lunes";
            case 1:
                return "Martes";
            case 2:
                return "Miércoles";
            case 3:
                return "Jueves";
            case 4:
                return "Viernes";
            case 5:
                return "Sábado";
            case 6:
                return "Domingo";

        }

        return "Error";

    }

    public static String dia_de_menos_ventas(double[] recaudacion_semanal){

        double recaudacion_menor = recaudacion_semanal[0];
        int dia = 0;

        for (int i = 1; i < recaudacion_semanal.length; i++) {
            if (recaudacion_semanal[i] < recaudacion_menor){
                recaudacion_menor = recaudacion_semanal[i];
                dia = i;
            }
        }

        switch (dia){
            case 0:
                return "Lunes";
            case 1:
                return "Martes";
            case 2:
                return "Miércoles";
            case 3:
                return "Jueves";
            case 4:
                return "Viernes";
            case 5:
                return "Sábado";
            case 6:
                return "Domingo";

        }

        return "Error";

    }

    public static double media_semanal(double[] recaudacion_semanal){
        double total = 0;

        for (int i = 0; i < recaudacion_semanal.length; i++) {
            total += recaudacion_semanal[i];
        }

        return total / recaudacion_semanal.length;

    }

    public static double recaudacion_domingo(double[] recaudacion_semanal){

        return recaudacion_semanal[6];
    }


}
