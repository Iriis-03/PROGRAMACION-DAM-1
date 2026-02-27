package org.example.TEMA6POO.PRACTICA2;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMantenimiento {

    static ArrayList<Jugador> listaJugadores = new ArrayList<>();
    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        String opcion;

        do {

            System.out.println("=== App de mantenimiento del MUTXAMEL FC ===");
            System.out.println();
            System.out.println("[1]. Mantenimiento de jugadores");
            System.out.println("    Dentro podremos añadir jugadores, modificar datos y añadir acompañantes (sólo seniors).");
            System.out.println("[2]. Consultar equipos");
            System.out.println("    Dentro se deben listar los tipos de equipos del club y elegir uno.");
            System.out.println("[X]. Salir");
            System.out.println();
            System.out.println("==================================================================================================");
            System.out.println();
            System.out.print("Selecciona una opción --> ");
            opcion = read.nextLine().toUpperCase();

            menu(opcion);

        } while (!opcion.equals("X"));

    }

    public static void menu(String opcion) {
        switch (opcion) {
            case "1":
                mantenimientoJugadores();
                break;
            case "2":
                consultarEquipos();
                break;
            case "X":
                break;
            default:
                System.out.println("Introduce una opción correcta");
        }
    }

    public static void mantenimientoJugadores() {

        String opcion;

        do {
            System.out.println();
            System.out.println("=== Mantenimiento de Jugadores ===");
            System.out.println();
            System.out.println("[1]. Añadir nuevo jugador");
            System.out.println("[2]. Modificar datos de jugador existente");
            System.out.println("[3]. Crear acompañantes (solo SENIOR)");
            System.out.println("[X]. Volver al menú principal");
            System.out.println();
            System.out.println("==================================================================================================");
            System.out.println();
            System.out.print("Selecciona una opción --> ");
            opcion = read.nextLine().toUpperCase();

            switch (opcion) {
                case "1":
                    crearJugador();
                    break;
                case "2":
                    modificarJugador();
                    break;
                case "3":
                    crearAcompanantes();
                    break;
                case "X":
                    System.out.println("Volver al menú principal");
                    break;
                default:
                    System.out.println("Introduce una opción correcta");
            }

        } while (!opcion.equals("X"));
    }

    private static void crearJugador() {

        try {
            System.out.print("Nombre: ");
            String nombre = read.nextLine();
            System.out.print("Edad: ");
            int edad = Integer.parseInt(read.nextLine());
            System.out.print("Categoría (BENJAMIN/ALEVIN/INFANTIL/CADETE/JUVENIL/SENIOR): ");
            String categoria = read.nextLine().toUpperCase();
            System.out.print("Posición (PORTERO/DEFENSA/CENTROCAMPISTA/DELANTERO): ");
            String posicion = read.nextLine().toUpperCase();
            System.out.print("Dorsal: ");
            int dorsal = Integer.parseInt(read.nextLine());

            Jugador jugadorCreado = new Jugador(nombre, edad, categoria, posicion, 0);

            listaJugadores.add(jugadorCreado);
            jugadorCreado.setDorsal(dorsal);

        } catch (DorsalYaAsignadoException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void modificarJugador() {

        System.out.println("=== Mantenimiento de Jugadores. Modificar datos de jugador existente ===");

        int contadorJugadores = 0;

        for (Jugador jugador : listaJugadores) {
            System.out.println("[" + contadorJugadores + ", " + jugador + "]");
            contadorJugadores++;
        }

        if (contadorJugadores == 0) { // si no hay jugadores
            System.out.println("No hay jugadores creados anteriormente");
            return;
        }

        System.out.println("==========================================");
        System.out.print("Selecciona una opción --> ");
        int numJugador = Integer.parseInt(read.nextLine());

        if (numJugador < 0 || numJugador >= listaJugadores.size()) {
            System.out.println("Introduce una opción válida");
            return;
        }

        Jugador jugadorseleccionado = listaJugadores.get(numJugador);

        System.out.println("Modificando jugador: " + jugadorseleccionado);
        System.out.print("¿Qué quieres modificar? [nombre,edad,categoria,dorsal,posicion]: ");
        System.out.println();
        String modificacionJugador = read.nextLine().toLowerCase();

        try {
            switch (modificacionJugador) {
                case "nombre":
                    System.out.print("Nuevo nombre --> ");
                    jugadorseleccionado.setNombre(read.nextLine());
                    break;
                case "edad":
                    System.out.print("Nueva edad --> ");
                    jugadorseleccionado.setEdad(Integer.parseInt((read.nextLine())));
                    break;
                case "categoria":
                    System.out.print("Nueva categoría --> ");
                    jugadorseleccionado.setCategoria(Equipos.valueOf(read.nextLine()));
                    break;
                case "posicion":
                    System.out.print("Nueva posición --> ");
                    jugadorseleccionado.setPosicion(Posiciones.valueOf(read.nextLine()));
                    break;
                case "dorsal":
                    System.out.print("Nuevo dorsal --> ");
                    jugadorseleccionado.setDorsal(Integer.parseInt(read.nextLine()));
                    break;
                default:
                    System.out.println("Introduce una opción válida");
            }
            System.out.println("Modificaciones jugador seleccionado: " + jugadorseleccionado);
        } catch (DorsalYaAsignadoException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void crearAcompanantes() {

        for (Jugador jugador : listaJugadores) {
            if (jugador.getCategoria() == Equipos.SENIOR) {
                System.out.print("Nombre del acompañante para " + jugador.getNombre() + ": ");
                String nombreAcompanante = read.nextLine();
                Acompanante acompananteCreado = new Acompanante(nombreAcompanante, 0,jugador,"compañero");
                System.out.println("Nuevo acompañante del jugador " + jugador.getNombre() + ": " + acompananteCreado.getNombre());
            }
        }
    }

    public static void consultarEquipos() {
        System.out.println("=== Consulta de Equipos ===");

        for (Equipos equipo : Equipos.values()) {
            System.out.println("- " + equipo);
        }

        System.out.print("Introduce el equipo que quieres elegir --> ");
        String equipoSeleccionado = read.nextLine().toUpperCase();

        boolean seleccionado = false;
        for (Equipos equipo : Equipos.values()) {
            if (equipo.name().equals(equipoSeleccionado)) {
                System.out.println("Has elegido al equipo: " + equipo);
                seleccionado = true;
                break;
            }
        }

        if (!seleccionado) {
            System.out.println("Introduce una opción válida");
        }
    }
}