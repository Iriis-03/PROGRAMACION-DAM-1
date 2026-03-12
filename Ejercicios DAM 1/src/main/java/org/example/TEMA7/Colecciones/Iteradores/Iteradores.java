package org.example.TEMA7.Colecciones.Iteradores;

import java.util.*;

public class Iteradores {

    static void main(String[] args) {

        TreeSet<String> lista = new TreeSet<>();
        lista.add("Pikachu");
        lista.add("Charmander");
        lista.add("Squirtle");
        lista.add("Bulbasur");
        lista.add("Magikarp");

//        for (String pokemon : lista){
//            if (pokemon.equals("Squirtle")){
//                lista.remove(pokemon);
//            }
//        }

        Iterator<String> it = lista.iterator();

        while(it.hasNext()){
            String pokemon = it.next();

            if (pokemon.equals("Pikachu")){
                it.remove();
            }

            System.out.println(pokemon);
        }

        System.out.println(lista);

        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Nicky Nicole", 4);
        mapa.put("Hermione", 7);

        Iterator<Map.Entry<String, Integer>> itmapa = mapa.entrySet().iterator();

        while (itmapa.hasNext()){
            Map.Entry<String, Integer> novia = itmapa.next();
            System.out.println(novia.getKey() + " ha durado " + novia.getValue() + " meses con Joaquín");

            if (novia.getKey().equals("Hermione")){
                itmapa.remove();
            }
        }

    }
}
