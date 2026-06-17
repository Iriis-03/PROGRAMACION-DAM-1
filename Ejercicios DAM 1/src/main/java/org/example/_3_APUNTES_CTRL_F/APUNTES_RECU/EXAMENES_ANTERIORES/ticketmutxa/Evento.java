package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.EXAMENES_ANTERIORES.ticketmutxa;

import java.time.LocalDate;
import java.util.Objects;

/**
 * CLASE ABSTRACTA: No se pueden crear objetos "Evento" directamente.
 * Sirve como molde base (Herencia) para Festival y Concierto.
 * Implementa 'Comparable' para poder ordenar por fecha en colecciones como TreeSet.
 */
public abstract class Evento implements Comparable<Evento> {
    protected String nombre;
    protected LocalDate fecha;
    protected double precio;

    public Evento(String nombre, LocalDate fecha, double precio) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
    }

    /**
     * POLIMORFISMO DE DATOS: equals y hashCode aseguran que no haya
     * dos eventos iguales (mismo nombre y fecha) en un Set.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Evento)) return false;
        Evento evento = (Evento) o;
        return Objects.equals(nombre, evento.nombre) && Objects.equals(fecha, evento.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, fecha);
    }

    /**
     * MÉTODO DE ORDENACIÓN: Compara fechas para que aparezcan cronológicamente.
     */
    @Override
    public int compareTo(Evento o) {
        return this.fecha.compareTo(o.fecha);
    }

    // Getters necesarios para mostrar información en los menús
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public LocalDate getFecha() { return fecha; }
}