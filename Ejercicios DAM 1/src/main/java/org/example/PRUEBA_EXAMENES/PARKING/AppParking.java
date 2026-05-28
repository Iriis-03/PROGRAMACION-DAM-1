package org.example.PRUEBA_EXAMENES.PARKING;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class AppParking {

    static Parking parking = new Parking("Mutxamel Centro", 1000, 0.025);

    static void main(String[] args) {
        parking.generarClientesAleatorios();
        parking.mostrarClientesActuales();
        app1();
        app2();
        app3();
    }

    public static void app1(){

        System.out.println("*** APP ACCESO ***");

        if (parking.getPlazas_totales() == parking.getClientesActuales().size()){
            System.out.println("COMPLETO");
        } else {
            System.out.println("LIBRE (" + parking.getPlazas_totales() + " plazas libres).");
        }

        Ticket ticket = new Ticket("", 1, Estado.PENDIENTE);
        ticket.generar();
        parking.anyadirCliente(ticket);
        ticket.recoger();
        parking.mostrarClientesActuales();

    }

    public static void app2(){

        Scanner read = new Scanner(System.in);

        System.out.println("*** PAGO DE TICKETS ***");
        System.out.println("Introduce tu matrícula: ");
        String matricula = read.nextLine();

        Ticket ticket = parking.validarTicket(matricula);

        System.out.println("Validando");

        if (ticket != null){
            System.out.println("Minutos: " + ticket.getMinutos() + " - Precio por minuto: " + parking.getPrecio_minuto() + "€");
            System.out.println("Importe a pagar: " + (ticket.getMinutos() * parking.getPrecio_minuto()) + "€.");
            ticket.pagar();
        } else {
            System.out.println("El ticket no existe.");
        }

        parking.mostrarClientesActuales();



    }

    public static void app3(){
        ArrayList<Ticket> listaOrdenar = new ArrayList<>();
        System.out.println("*** PARKING MUTXAMEL ***");

        Collections.sort(listaOrdenar, new Comparator<Ticket>() {
            @Override
            public int compare(Ticket a, Ticket b) {
                return a.getMinutos().compareTo(b.getMinutos());
            }
        });

        for (Ticket ticket : listaOrdenar){
            System.out.println(ticket);
        }
    }

}
