package org.example.TEMARIO_CURSO.TEMA2.HASNEXTINT;

import java.util.Scanner;

public class hasNextInt {

    static void main() {

        Scanner read = new Scanner(System.in);

        if (read.hasNextInt()){
            int numero = read.nextInt();
            System.out.println(numero);
        }else{
            System.out.println("ERROR formato incorrecto. No es un número.");
        }
    }
}
