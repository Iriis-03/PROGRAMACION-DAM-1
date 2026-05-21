package org.example.TEMARIO_CURSO.TEMA5POO.inmobiliaria;

public class InmoApp {

    static void main(String[] args) {

        Casa pisito = new Casa("Calle Agudes nº16");

        System.out.println(pisito.getPropietario());

        pisito.crearHabitacion("cocina", 20);
        pisito.crearHabitacion("baño", 7);
        pisito.crearHabitacion("dormitorio", 21);
        pisito.crearHabitacion("dormitorio", 12);

        pisito.mostrarHabitaciones();
        System.out.println("La habitación más grande es " + pisito.getHabitacionMasGrande().getNombre());

        pisito.eliminarHabitaciones("baño");
        pisito.mostrarHabitaciones();

        pisito.eliminarHabitaciones("baño");
    }
}
