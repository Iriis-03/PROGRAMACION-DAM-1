package org.example.TEMA7.Colecciones.comparables;

import java.util.*;

public class CumpleApp {

    static void main(String[] args) {

        List<Invitado> invitados = new ArrayList<>();
        invitados.add(new Invitado(15, "Jacobo"));
        invitados.add(new Invitado(12, "David"));
        invitados.add(new Invitado(12, "Joaquín"));

        Collections.sort(invitados, new OrdenarPorEdadNombreHora().reversed());
        System.out.println(invitados);

    }
}
