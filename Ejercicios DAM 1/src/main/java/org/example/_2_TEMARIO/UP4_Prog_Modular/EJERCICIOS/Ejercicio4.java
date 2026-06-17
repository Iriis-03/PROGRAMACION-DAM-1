package org.example._2_TEMARIO.UP4_Prog_Modular.EJERCICIOS;

import java.util.Scanner;

public class Ejercicio4 {

    static void main(String[] args) {

        double recaudacion[] = recaudacion();

        System.out.println(diaMax(recaudacion));
        System.out.println(diaMin(recaudacion));

        double media = media(recaudacion);

        double domingo = domingo(recaudacion);

        if (domingo > media){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

    }

    /**
     * @autor Iris
     * @version 1.0
     * Método para calcular que día ha tenido más ventas en un bar
     * @return
     */

    public static double[] recaudacion(){

        Scanner read = new Scanner(System.in);

        double recaudacion[] = new double[6];

        for (int i = 0; i < recaudacion.length; i++) {

            recaudacion[i] = read.nextDouble();

        }
        return recaudacion;
    }

    public static String diaMax(double recaudacion[]){

        double maximo = recaudacion[0];
        int dia = 0;

        for (int i = 0; i < recaudacion.length; i++) {

            if (recaudacion[i] > maximo){
                maximo = recaudacion[i];
                dia = i;
            }
        }
        return dia_semana(dia);
    }

    public static String diaMin(double recaudacion[]){

        double minimo = recaudacion[0];
        int dia = 0;

        for (int i = 0; i < recaudacion.length; i++) {

            if (recaudacion[i] < minimo){
                minimo = recaudacion[i];
                dia = i;
            }
        }
        return dia_semana(dia);
    }

    public static String dia_semana(int dia){

        switch (dia){
            case 0:
                return "MARTES";
            case 1:
                return "MIÉRCOLES";
            case 2:
                return "JUEVES";
            case 3:
                return "VIERNES";
            case 4:
                return "SÁBADO";
            case 5:
                return "DOMINGO";
        }
        return "";
    }

    public static double media(double recaudacion[]){

        double acumulado = 0;

        for (int i = 0; i < recaudacion.length; i++) {
            acumulado += recaudacion[i];
        }

        return (acumulado / recaudacion.length);
    }

    public static double domingo(double recaudacion[]){

        return recaudacion[recaudacion.length - 1];
    }

}
