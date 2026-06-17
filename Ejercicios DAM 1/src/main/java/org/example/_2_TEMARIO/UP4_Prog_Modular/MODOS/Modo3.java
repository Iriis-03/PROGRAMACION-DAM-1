package org.example._2_TEMARIO.UP4_Prog_Modular.MODOS;

import java.util.Scanner;

public class Modo3 {
    static Scanner read;

    public static void main(String[] args) {
        read = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

    public static boolean casoDePrueba() {
        if (!read.hasNext())
            return false;
        else {
            // CÓDIGO PRINCIPAL AQUÍ
            // (incluyendo la lectura del caso de prueba)
            int toros = read.nextInt();
            int velocidad_corredor = 0;

            for (int i = 0; i < toros; i++) {
                int velocidades_toro = read.nextInt();
                if (velocidades_toro > velocidad_corredor){
                    velocidad_corredor = velocidades_toro;
                }
            }
            System.out.println(velocidad_corredor);
            read.nextLine();
            return true;
        }
    } // casoDePrueba

} // class solution

