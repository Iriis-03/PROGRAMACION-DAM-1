package org.example._5_EXAMENES_AÑOS_ANTERIORES.TICKETMUTXA;

import java.time.LocalDate;

public class AppCompraEntradas {

    static void main(String[] args) {

        TicketMutxa.insertarEvento("Paellas", LocalDate.of(2025, 4, 16), 20, "festival");
        TicketMutxa.insertarEvento("Concierto Estopa", LocalDate.of(2025, 4, 21), 40, "concierto");

        TicketMutxa.generarUsuarios(4);
    }
}
