package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.EXAMENES_ANTERIORES.Parking_Mutxamel;

import java.util.*;

public class AppParking {
    static void main(String[] args) {
        // Creamos una lista de tipo Ticket (Polimorfismo: acepta Clientes)
        List<Ticket> listaTickets = new ArrayList<>();
        listaTickets.add(new Cliente("1234ABC", 250));
        listaTickets.add(new Cliente("8524DDS", 45));
        listaTickets.add(new Cliente("3698XZE", 123));

        System.out.println("=== LISTADO DE PARKING (Orden por Minutos) ===");

        /**
         * COMPARATOR (Clase Anónima):
         * El examen pide ordenar por minutos. Como la ordenación natural era por matrícula,
         * creamos un "comparador" externo sobre la marcha que solo sirve para este momento.
         */
        Collections.sort(listaTickets, new Comparator<Ticket>() {
            @Override
            public int compare(Ticket t1, Ticket t2) {
                // Compara los minutos de dos tickets para decidir cuál va antes
                return Integer.compare(t1.getMinutos(), t2.getMinutos());
            }
        });

        // Mostramos los resultados tras la ordenación
        for (Ticket t : listaTickets) {
            System.out.println(t);
        }

        System.out.println("\n=== APP TRABAJADORES (Implementación Anónima) ===");

        /**
         * CLASE ANÓNIMA DE INTERFAZ:
         * El examen dice que no existe la clase "Trabajador". Por tanto, instanciamos
         * la interfaz 'Acciones' directamente. Java nos obliga a escribir el código
         * del método pagar() aquí mismo, en medio del Main.
         */
        Acciones appTrabajadores = new Acciones() {
            @Override
            public void pagar() {
                Scanner sc = new Scanner(System.in);
                System.out.println("[Modo Trabajador Activado]");
                System.out.print("Introduce matrícula: ");
                String mat = sc.nextLine();
                System.out.print("Introduce minutos: ");
                int min = sc.nextInt();

                // Tarifa especial para trabajadores (0.02€)
                double total = min * 0.02;
                System.out.println("Cobro realizado a empleado. Matrícula " + mat + ": " + total + "€");
                System.out.println("Estado actualizado a RECOGIDO.");
            }
        };

        // Ejecutamos la lógica que acabamos de definir arriba
        appTrabajadores.pagar();
    }
}
