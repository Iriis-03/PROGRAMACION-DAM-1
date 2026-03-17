package org.example.TEMA7.Colecciones.Iteradores;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class MariaTeclado {

    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        ArrayList<Character> lista = new ArrayList<>();
        ListIterator<Character> it = lista.listIterator();

        String frase = read.nextLine();

        for (Character caracter : frase.toCharArray()){

            switch (caracter){
                case '<':
                    if (it.hasPrevious()){
                        it.previous();
                    }
                    break;
                case '>':
                    if (it.hasNext()){
                        it.next();
                    }
                    break;
                case '#':
                    if (it.hasPrevious()){
                        it.previous();
                        it.remove();
                    }
                    break;
                default:
                    it.add(caracter);
            }
        }

        for (Character caracter : lista){
            System.out.print(caracter);
        }

    }
}
