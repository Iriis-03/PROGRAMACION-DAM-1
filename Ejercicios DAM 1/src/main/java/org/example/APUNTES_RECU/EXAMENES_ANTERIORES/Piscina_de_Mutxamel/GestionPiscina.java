package org.example.APUNTES_RECU.EXAMENES_ANTERIORES.Piscina_de_Mutxamel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestionPiscina {
    // Lista polimórfica: Guardamos objetos de distintas clases hijas en una lista de padres
    private List<Bañista> listaBañistas = new ArrayList<>();

    public void añadirBañista(Bañista b) {
        listaBañistas.add(b);
    }

    /**
     * MÉTODO ELIMINAR INVITADOS (Punto clave del PDF):
     * Para eliminar elementos de una lista mientras la recorres, NO se puede usar un for-each.
     * Se debe usar un ITERATOR. El Iterator es un objeto que "apunta" a los elementos de la
     * lista y permite borrarlos de forma segura sin romper el bucle.
     */
    public void eliminarInvitados() {
        System.out.println("\nEliminando invitados de hoy...");

        Iterator<Bañista> it = listaBañistas.iterator();

        while (it.hasNext()) { // Mientras queden elementos por ver...
            Bañista b = it.next(); // Obtenemos el siguiente

            // Si es invitado, lo borramos mediante el iterador
            if (b.getTipo() == TipoUsuario.INVITADO) {
                it.remove();
            }
        }
    }

    public void mostrarLista() {
        for (Bañista b : listaBañistas) {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        GestionPiscina piscina = new GestionPiscina();

        // Insertamos datos de ejemplo del PDF
        piscina.añadirBañista(new Adulto(1, "patricia", 20, TipoUsuario.ADULTO));
        piscina.añadirBañista(new Niño(3, "pepe", 12, TipoUsuario.NIÑO, "600112233"));
        piscina.añadirBañista(new Invitado(5, "Fran", 40, TipoUsuario.INVITADO));
        piscina.añadirBañista(new Invitado(6, "Marta", 12, TipoUsuario.INVITADO));

        System.out.println("--- LISTA ANTES DEL CIERRE ---");
        piscina.mostrarLista();

        piscina.eliminarInvitados();

        System.out.println("--- LISTA DESPUÉS DEL CIERRE ---");
        piscina.mostrarLista();
    }
}
