package org.example.TEMA7.Colecciones.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1Mapas {

    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        System.out.println("Introduce una frase...");
        String frase = read.nextLine().toLowerCase();

        HashMap<String, Integer> mapa = new HashMap<>();

        for ( String palabra : frase.split(" ")){

            if (mapa.containsKey(palabra)){
                mapa.put(palabra, mapa.get(palabra) + 1);
            } else {
                mapa.put(palabra, 1);
            }
        }

        for (Map.Entry<String, Integer> mapa2 : mapa.entrySet()){
            System.out.println(mapa2.getKey() + " : " + mapa2.getValue() + " veces");
        }
    }
}
