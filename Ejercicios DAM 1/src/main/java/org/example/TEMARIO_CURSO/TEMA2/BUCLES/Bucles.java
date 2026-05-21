package org.example.TEMARIO_CURSO.TEMA2.BUCLES;

import java.util.Scanner;

public class Bucles {

    static void main() {

        for (;;){
            System.out.println("hola");
            break;
        }


        Scanner read = new Scanner(System.in);

        while (true){

            String palabra = read.next();

            if (palabra.equals("hola")){
                continue;
            }

            System.out.println("Dime hola");
            break;
        }

        for (int i = 1; i <=10; i++){
            System.out.println(i);
        }
    }
}
