package org.example.TEMA7.Colecciones.Colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio5Colas {

    static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Deque<Character> cola_palindromo = new LinkedList<>();

        System.out.println("Introduce una palabra (palíndromo): ");
        String palabra = read.next();

        for (int i = 0; i < palabra.length(); i++) {
            cola_palindromo.offer(palabra.charAt(i));
        }
        boolean esPalindroma = true;
        while (!cola_palindromo.isEmpty()){
            if (cola_palindromo.pollFirst() != cola_palindromo.pollLast()){
                System.out.println("La palabra introducida no es palíndroma");
                esPalindroma = false;
                break;
            }
        }
        if (esPalindroma){
            System.out.println("La palabra introducida es palíndroma");
        }
    }
}
