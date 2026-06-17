package org.example._2_TEMARIO.UP1_Java_Basico;

import java.util.Scanner;

public class Ejercicio7 {

    static void main() {

        Scanner read = new Scanner(System.in);

        System.out.println("¿Hay tomate (S/N)?");
        char tomate = read.next().charAt(0);
        System.out.println("¿Hay aceite (S/N)?");
        char aceite = read.next().charAt(0);
        System.out.println("¿Hay jamon (S/N)?");
        char jamon = read.next().charAt(0);

        if (tomate=='N' || aceite=='N' || jamon=='N') {
            System.out.println("A comprar!!");
        }else{
            System.out.println("No comprar!!");
        }
    }
}

