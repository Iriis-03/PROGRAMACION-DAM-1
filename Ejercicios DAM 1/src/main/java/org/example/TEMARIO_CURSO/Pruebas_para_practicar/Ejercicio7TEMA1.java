package org.example.TEMARIO_CURSO.Pruebas_para_practicar;

import java.util.Scanner;

public class Ejercicio7TEMA1 {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String tomate;
        String aceite;
        String jamon;

        System.out.println("¿Tenemos tomate? (S/N)");
        tomate = read.next();

        System.out.println("¿Tenemos aceite? (S/N)");
        aceite = read.next();

        System.out.println("¿Tenemos jamón? (S/N)");
        jamon = read.next();

        if (tomate.equals("S") && aceite.equals("S") && jamon.equals("S")){
            System.out.println("¡No tenemos que ir a comprar!");
        } else {
            System.out.println("¡Tenemos que ir a comprar!");
        }
    }
}
