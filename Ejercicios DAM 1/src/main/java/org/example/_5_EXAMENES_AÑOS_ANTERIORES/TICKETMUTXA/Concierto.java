package org.example._5_EXAMENES_AÑOS_ANTERIORES.TICKETMUTXA;

import java.time.LocalDate;

public class Concierto extends Evento{

    private String artista;

    public Concierto(String nombre, LocalDate fecha, double precio, String artista) {
        super(nombre, fecha, precio);
        this.artista = artista;
    }
}
