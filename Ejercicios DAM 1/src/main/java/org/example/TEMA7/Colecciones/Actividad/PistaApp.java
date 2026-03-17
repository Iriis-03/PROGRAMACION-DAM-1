package org.example.TEMA7.Colecciones.Actividad;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PistaApp {

    static void main(String[] args) {

        List<Reserva> listaReservas = new ArrayList<>();

        Usuario david = new Usuario("David", 1);
        Usuario carlos = new Usuario("Carlos", 2);

        Pista padel = new Padel(TipoTechado.INDOOR, 101, TipoParedes.CRISTAL);
        Pista tenis = new Tenis(TipoTechado.EXTERIOR, 102, TipoSuperficie.CEMENTO);

        LocalDateTime fecha_creada1 = LocalDateTime.of(2026, 3, 20, 18, 0);
        LocalDateTime fecha_creada2 = LocalDateTime.of(2026, 3, 20, 19, 0);

        try {
            Reserva.generacionReserva(listaReservas, david, padel, fecha_creada1);
            Reserva.generacionReserva(listaReservas, carlos, tenis, fecha_creada2);
            Reserva.generacionReserva(listaReservas, david, padel, fecha_creada1);

        } catch (PistaYaReservadaException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println();
        System.out.println("*****************************");
        System.out.println("*** TODAS LAS RESERVAS ***");
        System.out.println("*****************************");

        for (Reserva reserva : listaReservas) {
            System.out.println(reserva);
        }

        List<Reserva> reservas_de_David = Reserva.busquedaReservas(listaReservas, david);
        for (Reserva reserva : reservas_de_David) {
            System.out.println(reserva);
        }

        Reserva.eliminarReservas(listaReservas);

        System.out.println("***************************************");
        System.out.println("*** TODAS LAS RESERVAS (ACTUALES) ***");
        System.out.println("***************************************");
        for (Reserva r : listaReservas) {
            System.out.println(r);
        }

    }
}
