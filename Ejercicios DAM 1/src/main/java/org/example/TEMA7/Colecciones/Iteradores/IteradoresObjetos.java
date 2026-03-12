package org.example.TEMA7.Colecciones.Iteradores;

import org.example.TEMA7.Colecciones.HashSet.Presidente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class IteradoresObjetos {

    static void main(String[] args) {

        ArrayList<Presidente> lista = new ArrayList<>(Arrays.asList(
                new Presidente("Donald Trump", "USA"),
                new Presidente("Benja Netanyahu", "ISRAEL"),
                new Presidente("Pedro Sánchez", "ESPAÑA"))
        );

        Iterator<Presidente> it = lista.iterator();

        while(it.hasNext()){
            Presidente presi = it.next();
            if (presi.getNombre().equals("Benja Netanyahu")){
                it.remove();
            }
        }

        System.out.println(lista);
    }
}
