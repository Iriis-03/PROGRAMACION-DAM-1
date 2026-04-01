package org.example.APUNTES_RECU.EXAMENES_ANTERIORES.ticketmutxa;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * CLASE HIJA: Festival
 * También hereda de Evento.
 */
public class Festival extends Evento {

    // Un festival tiene muchos artistas, usamos un Set para que no se repitan
    private Set<String> listaArtistas;

    public Festival(String nombre, LocalDate fecha, double precio) {
        super(nombre, fecha, precio);
        this.listaArtistas = new HashSet<>();
    }

    public void añadirArtista(String artista) {
        listaArtistas.add(artista);
    }
}