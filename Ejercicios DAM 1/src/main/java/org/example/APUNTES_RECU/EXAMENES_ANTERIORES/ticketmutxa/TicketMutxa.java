package org.example.APUNTES_RECU.EXAMENES_ANTERIORES.ticketmutxa;

import java.util.*;

/**
 * CLASE DE UTILIDAD: Gestiona los datos globales del sistema.
 * Uso de 'static' porque los datos pertenecen a la aplicación, no a un objeto concreto.
 */
public class TicketMutxa {
    // HashSet: Los usuarios no se repiten y la búsqueda es ultra rápida.
    private static Set<Usuario> usuariosRegistrados = new HashSet<>();
    // TreeSet: Los eventos se mantienen ordenados por fecha automáticamente.
    private static Set<Evento> listaEventos = new TreeSet<>();

    /**
     * GENERACIÓN ALEATORIA: Crea usuarios con credenciales de 8 caracteres.
     * Usa la clase Random para cumplir el requisito del examen.
     */
    public static void generarUsuarios(int cantidad) {
        String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random r = new Random();
        for (int i = 0; i < cantidad; i++) {
            String u = ""; String p = "";
            for(int j=0; j<8; j++) {
                u += base.charAt(r.nextInt(base.length()));
                p += base.charAt(r.nextInt(base.length()));
            }
            usuariosRegistrados.add(new Usuario(u, p));
            // Imprimimos para poder loguearnos en las pruebas (Chivato)
            System.out.println("Usuario generado -> User: " + u + " | Pass: " + p);
        }
    }

    // Métodos para visualizar y obtener eventos desde el Main
    public static void verEventos() {
        int i = 1;
        for (Evento e : listaEventos) {
            System.out.println("[" + (i++) + "]. " + e.getNombre() + " (" + e.getFecha() + ")");
        }
    }

    public static Set<Usuario> getUsuariosRegistrados() { return usuariosRegistrados; }

    public static void añadirEvento(Evento e) { listaEventos.add(e); }

    public static Evento getEventoPorPosicion(int pos) {
        return (Evento) listaEventos.toArray()[pos - 1];
    }
}