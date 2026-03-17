package org.example.TEMA7.Colecciones.Actividad;

import org.example.TEMA6POO.PRACTICA2.FormatoIncorrectoException;

import java.time.LocalDateTime;
import java.util.*;

public class Reserva {

    private Usuario usuario;
    private Pista pista;
    private LocalDateTime fechaPartido;

    public Reserva(Usuario usuario, Pista pistas, LocalDateTime fechaPartido) {
        this.usuario = usuario;
        this.pista = pistas;
        this.fechaPartido = fechaPartido;
    }

    public static void eliminarReservas(List<Reserva> reservas) {

        ListIterator<Reserva> it_reserva = reservas.listIterator();

        while (it_reserva.hasNext()) {
            Reserva reserva = it_reserva.next();
            if (reserva.getPista() instanceof Padel) {
                it_reserva.remove();
            }
        }
    }

    public static List<Reserva> busquedaReservas(List<Reserva> listaReservasTotales, Usuario usuario) {

        List<Reserva> listaReservas = new ArrayList<>();
        int id_usuario = usuario.getId();

        for (Reserva reserva : listaReservasTotales) {
            int id = reserva.getUsuario().getId();

            if (id == id_usuario) {
                listaReservas.add(reserva);
            }
        }
        return listaReservas;
    }

    public static void generacionReserva(List<Reserva> listaReservasTotales, Usuario usuario, Pista pista, LocalDateTime fechaPartido){

        for (Reserva reserva : listaReservasTotales) {

            if (reserva.getPista().equals(pista) && reserva.getFechaPartido().equals(fechaPartido)) {
                throw new PistaYaReservadaException();
            }
        }

        Reserva reserva_creada = new Reserva(usuario, pista, fechaPartido);
        listaReservasTotales.add(reserva_creada);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pista getPista() {
        return pista;
    }

    public void setPistas(Pista pista) {
        this.pista = pista;
    }

    public LocalDateTime getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(LocalDateTime fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "usuario=" + usuario +
                ", pistas=" + pista +
                ", fechaPartido=" + fechaPartido +
                '}';
    }
}
