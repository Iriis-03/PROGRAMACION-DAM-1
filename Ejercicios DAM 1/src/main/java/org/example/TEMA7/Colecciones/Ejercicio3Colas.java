package org.example.TEMA7.Colecciones;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio3Colas {

    static void main(String[] args) {

        Queue<String> playlist = new LinkedList<>();

        playlist.offer("Escapism");
        playlist.offer("Wildflower");
        playlist.offer("Wicked Game");
        playlist.offer("Take Me to Church");

        System.out.println("Estado inicial de la playlist: " + playlist);

        while (!playlist.isEmpty()){
            System.out.println("Reproduciendo: " + playlist.poll());
            System.out.println("Estado de la playlist después de reproducir una canción: " + playlist);
        }

        System.out.println("La playlist ha terminado.");



    }
}
