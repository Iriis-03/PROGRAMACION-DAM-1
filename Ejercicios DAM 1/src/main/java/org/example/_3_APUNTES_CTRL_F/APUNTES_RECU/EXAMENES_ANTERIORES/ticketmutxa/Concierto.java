package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.EXAMENES_ANTERIORES.ticketmutxa;

import java.time.LocalDate;

/**
 * CLASE HIJA: Concierto
 * Hereda de Evento. Es una clase "concreta", por lo que SÍ
 * permite hacer 'new Concierto(...)'.
 */
public class Concierto extends Evento {

    // Atributo específico que no tiene el padre
    private String artista;

    /**
     * CONSTRUCTOR: Es lo que llama el Main con 'new Concierto(...)'
     * Recibe los datos y se los envía al padre mediante 'super'.
     */
    public Concierto(String nombre, LocalDate fecha, double precio) {
        super(nombre, fecha, precio);
    }

    // Getter y Setter para el artista (específico de conciertos)
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}