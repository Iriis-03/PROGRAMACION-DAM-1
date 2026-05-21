package org.example.TEMARIO_CURSO.TEMA4.MODOS;

import java.util.Scanner;

public class Modo2 {

    static Scanner read;

    public static void main(String[] args) {
        read = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

    public static boolean casoDePrueba() {
        //leer caso de prueba
        int x = read.nextInt();
        int y = read.nextInt();
        read.nextLine();
        if (x < 0 || y < 0)
        return false;
        else {
            System.out.println((x + y) * 2);
            // CÓDIGO PRINCIPAL AQUÍ
            return true;
        }
    } // casoDePrueba
}
