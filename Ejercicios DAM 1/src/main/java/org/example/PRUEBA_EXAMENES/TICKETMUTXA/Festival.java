package org.example.PRUEBA_EXAMENES.TICKETMUTXA;

import java.time.LocalDate;
import java.util.Set;

public class Festival extends Evento{

    private Set<String> listaArtistas;

    public Festival(String nombre, LocalDate fecha, double precio, Set<String> listaArtistas) {
        super(nombre, fecha, precio);
        this.listaArtistas = listaArtistas;
    }
}
