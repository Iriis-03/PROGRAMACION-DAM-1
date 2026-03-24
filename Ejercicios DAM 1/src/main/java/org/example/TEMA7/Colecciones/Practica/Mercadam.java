package org.example.TEMA7.Colecciones.Practica;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Mercadam {

    static Random aleatorio = new Random();
    private Set<Cliente> clientes; //La estructura Set, no permite duplicados y no está ordenado

    public Mercadam() { //Constructor vacío
        clientes = new HashSet<>();
    }

    public void generarClientes(int clientes_totales) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < clientes_totales; i++) {
            String usuario = "";
            String contrasenya = "";

            for (int j = 0; j < 8; j++) { //Se generan 8 caracteres aleatorios para usuario y contraseña
                usuario += caracteres.charAt(aleatorio.nextInt(caracteres.length()));
                contrasenya += caracteres.charAt(aleatorio.nextInt(caracteres.length()));
            }

            Cliente cliente = new Cliente(usuario, contrasenya); //Se crea un cliente nuevo y se guarda en el Set
            this.clientes.add(cliente);
        }
    }

    public Set<Cliente> getClientes() {
        return Collections.unmodifiableSet(clientes); //Devuelve con un return a todos los clientes protegiéndolos de modificaciones externas
    }

}
