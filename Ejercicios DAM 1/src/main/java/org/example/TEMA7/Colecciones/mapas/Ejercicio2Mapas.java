package org.example.TEMA7.Colecciones.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2Mapas {

    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        System.out.println("Introduce una palabra...");
        String palabra = read.nextLine().toLowerCase();

        HashMap<Character, Integer> mapa = new HashMap<>();

        for ( Character caracter : palabra.toCharArray()){

//            if (mapa.containsKey(caracter)){
//                mapa.put(caracter, mapa.get(caracter) + 1);
//            } else {
//                mapa.put(caracter, 1);
//            }

            mapa.put(caracter, mapa.getOrDefault(caracter, 0) + 1); //está sentencia equivale a la de arriba
        }

        for (Map.Entry<Character, Integer> mapa2 : mapa.entrySet()){
            System.out.println(mapa2.getKey() + " : " + mapa2.getValue() + " veces");
        }
    }
}
