package org.example.TEMA6POO.interfaces.ACTIVIDAD1;

import java.util.ArrayList;

public class VoladoresApp {

    static void main(String[] args) {

        Superman clark_kent = new Superman();
        Pajaro piolin = new Pajaro();

        clark_kent.volar();
        piolin.volar();

        clark_kent.rayoLaser();
        clark_kent.alientoHelado();

        Spiderman peter_parker = new Spiderman();

        ArrayList<Superheroe> listaHeroes = new ArrayList<>();
        listaHeroes.add(clark_kent);
        listaHeroes.add(peter_parker);

        for (Superheroe superheroe : listaHeroes){
            if (superheroe instanceof Superman){
                ((Superman) superheroe).alientoHelado();
                ((Superman) superheroe).rayoLaser();
            }
        }
    }
}


