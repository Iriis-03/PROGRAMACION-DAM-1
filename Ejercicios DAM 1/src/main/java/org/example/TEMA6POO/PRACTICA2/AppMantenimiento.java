papackage org.example.TEMA6POO.PRACTICA2;

import org.example.TEMA6POO.PRACTICA2.Acompanante;
import org.example.TEMA6POO.PRACTICA2.DorsalYaAsignadoException;
import org.example.TEMA6POO.PRACTICA2.Equipos;
import org.example.TEMA6POO.PRACTICA2.Jugador;

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

        System.out.println("Saliendo del mantenimiento...");
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
            System.out.println("=== Mantenimiento de Jugadores ===");
            System.out.println();
            System.out.println("[1]. Añadir nuevo jugador");
            System.out.println("[2]. Modificar dorsal de jugador existente");
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
                    modificarDorsal();
                    break;
                case "3":
                    crearAcompanantes();
                    break;
                case "X":
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
            System.out.print("Categoría (INFANTIL/SENIOR/BENJAMIN): ");
            String categoria = read.nextLine().toUpperCase();
            System.out.print("Posición (PORTERO/DEFENSA/CENTROCAMPISTA/DELANTERO): ");
            String posicion = read.nextLine().toUpperCase();
            System.out.print("Dorsal: ");
            int dorsal = Integer.parseInt(read.nextLine());

            Jugador jugadorCreado = new Jugador(nombre, edad, categoria, posicion, 0);

            jugadorCreado.setDorsal(dorsal);

            listaJugadores.add(jugadorCreado);
            System.out.println("Se ha añadido al equipo el jugador, " + jugadorCreado);

        } catch (DorsalYaAsignadoException exception) {
            System.out.println(exception.getMessage());
    }

    private static void modificarDorsal() {
        if (listaJugadores.isEmpty()) { System.out.println("No hay jugadores."); return; }

        for (int i = 0; i < listaJugadores.size(); i++) System.out.println("[" + i + "] " + listaJugadores.get(i));

        try {
            System.out.print("Selecciona jugador --> "); int index = Integer.parseInt(read.nextLine());
            if (index < 0 || index >= listaJugadores.size()) { System.out.println("Opción no válida."); return; }

            Jugador jugador = listaJugadores.get(index);
            System.out.print("Nuevo dorsal --> "); int dorsal = Integer.parseInt(read.nextLine());

            if (listaJugadores.stream().anyMatch(j -> j != jugador && j.getCategoria() == jugador.getCategoria() && j.getDorsal() == dorsal))
                throw new DorsalYaAsignadoException("¡Lo siento! Ese dorsal ya está ocupado por un jugador del mismo equipo (" + jugador.getCategoria() + ").");

            jugador.setDorsal(dorsal);
            System.out.println("Jugador actualizado: " + jugador);

        } catch (DorsalYaAsignadoException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Opción inválida.");
        }
    }

    private static void crearAcompanantes() {

            for (Jugador jugador : listaJugadores) {
                if (jugador.getCategoria() == Equipos.SENIOR) {
                    System.out.print("Acompañante de " + jugador.getNombre() + ": ");
                    Acompanante acompananteCreado = new Acompanante(read.nextLine(), 0, jugador, "compañero");
                    System.out.println("Nuevo acompañante: " + acompananteCreado);
                }
            }
        }

    }

    public static void consultarEquipos() {
        System.out.println("=== Consulta de Equipos ===");
        for (Equipos equipos : Equipos.values()) {
            System.out.println(", " + equipos);
        }
    }
}