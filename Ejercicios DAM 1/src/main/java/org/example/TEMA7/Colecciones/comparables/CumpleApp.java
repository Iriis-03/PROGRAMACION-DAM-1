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

        TreeMap<Invitado, String> mapaInvitados = new TreeMap<>();

        mapaInvitados.put(new Invitado(15, "Jacobo"), "Raqueta tenis");
        mapaInvitados.put(new Invitado(12, "David"), "500€");
        mapaInvitados.put(new Invitado(12, "Joaquín"), "Charla con Milei");

        List<Map.Entry<Invitado, String>> listaMapa = new ArrayList<>(mapaInvitados.entrySet());

        listaMapa.sort(Map.Entry.comparingByKey());

        for (Map.Entry<Invitado, String> mapa : listaMapa){
            System.out.println(mapa.getKey().getNombre() + " " + mapa.getValue());
        }

    }
}
