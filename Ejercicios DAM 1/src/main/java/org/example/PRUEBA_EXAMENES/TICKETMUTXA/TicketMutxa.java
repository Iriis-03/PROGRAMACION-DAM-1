package org.example.PRUEBA_EXAMENES.TICKETMUTXA;

import java.time.LocalDate;
import java.util.*;

public class TicketMutxa {
    private static Set<Usuario> usuariosRegistrados = new HashSet<>();
    private static Set<Evento> listaEventos = new HashSet<>();


    public static void insertarEvento(String nombre, LocalDate fecha, double precio, String tipo){

        if (tipo.equals("Festival")){
            Evento evento = new Festival(nombre, fecha, precio, null);
            if (listaEventos.contains(evento)){

            } else {
                listaEventos.add(evento);
            }
        } else if (tipo.equals("Concierto")){
            Evento evento = new Concierto(nombre, fecha, precio, null);
            listaEventos.add(evento);
            if (!contiene(evento)){
                listaEventos.add(evento);
            }
        } else {
            System.out.println("No existe el tipo de evento.");
        }

    }

    public static boolean contiene(Evento evento){
        for (Evento evento1 : listaEventos){
            if (evento1.getNombre().equals(evento.getNombre()) && evento1.getFecha().equals(evento.getFecha())){
                return true;
            }
        }
        return false;
    }

    public static void generarUsuarios(int cantidad){

        Random aleatorio = new Random();

        Usuario usuario = null;

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder stringBuilder = new StringBuilder();

        // Usar Set para no repetir caracteres si el enunciado lo pide
        // Aquí generamos posiciones aleatorias del String de caracteres:
        Set<Integer> usados = new HashSet<>();
        ArrayList<String> cadena = null;
        
        for (int i = 0; i < cantidad; i++) {

            while (stringBuilder.length() < 8) {
                int index = aleatorio.nextInt(caracteres.length());
                if (!usados.contains(index)) {
                    stringBuilder.append(caracteres.charAt(index));
                    usados.add(index);
                }
            }
            String nombre = stringBuilder.toString();
            while (stringBuilder.length() < 8) {
                int index = aleatorio.nextInt(caracteres.length());
                if (!usados.contains(index)) {
                    stringBuilder.append(caracteres.charAt(index));
                    usados.add(index);
                }
            }
            String contraseya = stringBuilder.toString();

            cadena.add(stringBuilder.toString());
            usuario = new Usuario(nombre, contraseya);
            usuariosRegistrados.add(usuario);
        }


    }

    public static Set<Usuario> getUsuariosRegistrados(){

    }

    public static void verEventos(){

    }

    public static Evento getEvento(int posicion){

    }
}
