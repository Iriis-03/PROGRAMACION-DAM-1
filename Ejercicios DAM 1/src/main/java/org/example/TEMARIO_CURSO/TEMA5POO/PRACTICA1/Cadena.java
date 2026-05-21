package org.example.TEMARIO_CURSO.TEMA5POO.PRACTICA1;

import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaProgramas;

    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaProgramas = new ArrayList<>(); //Se crea un ArrayList para la lista de programas que tiene la cadena
    }

    public void anadirPrograma(Programa programa){

        listaProgramas.add(programa); //Se añade con un .add, un programa a la cadena

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    @Override
    public String toString() {
        return "Cadena{nombre='" + nombre + "', totalProgramas=" + listaProgramas.size() + "}";
    }
}
