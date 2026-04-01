package org.example.APUNTES_RECU.EXAMENES_ANTERIORES.ticketmutxa;

import java.time.LocalDate;
import java.util.*;

public class AppCompraEntradas {
    static void main(String[] args) throws InterruptedException {
        // 1. CARGA DE DATOS: Inicializamos eventos y usuarios aleatorios.
        TicketMutxa.añadirEvento(new Concierto("Estopa", LocalDate.of(2025, 5, 20), 45.0));
        TicketMutxa.generarUsuarios(3);

        // 2. AUTENTICACIÓN: Bucle infinito hasta que el login sea correcto.
        Usuario sesion = new Usuario("", "");
        System.out.println("--- LOGIN TICKETMUTXA ---");
        while (!sesion.autenticarse(TicketMutxa.getUsuariosRegistrados())) {
            System.out.println("Error. Inténtalo de nuevo.");
        }

        // 3. SELECCIÓN DE EVENTO
        TicketMutxa.verEventos();
        Scanner sc = new Scanner(System.in);
        System.out.print("Selecciona el número del evento: ");
        Evento seleccionado = TicketMutxa.getEventoPorPosicion(sc.nextInt());

        // 4. COLA VIRTUAL: Uso de Queue (LinkedList).
        // El comprador se pone al final de la lista de usuarios registrados.
        Queue<Usuario> colaEspera = new LinkedList<>(TicketMutxa.getUsuariosRegistrados());
        int turno = colaEspera.size();

        System.out.println("Entrando en cola virtual...");
        while (turno > 0) {
            System.out.println("Posición actual: " + turno);
            // Thread.sleep para simular el paso del tiempo (3 segundos por turno)
            Thread.sleep(3000);
            turno--;
        }
        System.out.println("¡Es tu turno! Procediendo a la compra.");

        // 5. LÓGICA DE COMPRA FINAL (Simplificada)
        System.out.print("¿Cuántas entradas quieres? ");
        sesion.setCarrito(seleccionado, sc.nextInt());
        sesion.pagar();
    }
}