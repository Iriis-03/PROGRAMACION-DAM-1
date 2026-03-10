package org.example.TEMA7.Colecciones.mapas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class VaDeModas {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        while (casoDePrueba()) {
        }
    }

    public static boolean casoDePrueba() {

        int num_conjuntos = read.nextInt();
        read.nextLine();

        if (num_conjuntos == 0)
            return false;

        HashMap<Character, Integer> conjuntos = new HashMap<>();

        for ( Character conjuntos_repe : conjuntos.){

            if (conjuntos.containsKey(conjuntos_repe)){
                conjuntos.put(conjuntos_repe, conjuntos.get(conjuntos_repe) + 1);
            } else {
                conjuntos.put(conjuntos_repe, 1);
            }

        }
        return true;
    }
}