package org.example.TEMARIO_CURSO.TEMA5POO.PRACTICA1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados; //Se crea un ArrayList para la lista de Empleados que tiene el programa
    private ArrayList<Invitado> listaInvitados; //Se crea un ArrayList para la lista de Invitados que tiene el programa
    private Empleado director;

    public Programa(String nombre, Cadena cadena, String nombreDirector) {

        this.nombre = nombre;
        this.cadena = cadena;
        temporadas = 0; //Se inicializa las temporadas a 0 (Porque en un principio no hay)
        listaEmpleados = new ArrayList<>(); //Se inicializa la lista de empleados vacía (Porque en un principio no hay)
        listaInvitados = new ArrayList<>(); //Se inicializa la lista de invitados vacía (Porque en un principio no hay)
        director = new Empleado(nombreDirector, "director"); //Se crea al director del programa
        listaEmpleados.add(director); //Se añade con un .add al director a la lista de empleados
        cadena.anadirPrograma(this); //Se añade el programa a la cadena con el método creado de anadirPrograma
    }

    public void invitadosTemporada(int temporada) {
        System.out.println("Estos son los invitados de la temporada " + temporada + ":");
        for (Invitado invitado : listaInvitados) { //for each para recorrer cada invitado de la lista de invitados
            if (invitado.getTemporada() == temporada) { //Aquí se comprueba en que temporada ha estado el invitado en el programa
                System.out.println(invitado.getNombre() + " " + invitado.getProfesion()); //Muestra por pantalla el nombre y la profesión del incitado
            }
        }
    }


    public int vecesInvitado(String nombre){
        int contadorvecesinvitado = 0; //Se crea un contador para contar cuantas veces ha ido el invitado
        for (Invitado invitado : listaInvitados) { //for each para recorrer cada invitado de la lista de invitados
            if (invitado.getNombre().equals(nombre)) { //Se comprueba si el nombre es el mismo que el del invitado
                contadorvecesinvitado++; //Si coinciden los nombre suma 1
            }
        }
        return contadorvecesinvitado; //Devuelve con un return cuántas veces ha ido el invitado
    }


    public void rastrearInvitado(String nombre){
        System.out.println("El invitado " + nombre + "ha estado en el programa.");
        for (Invitado invitado : listaInvitados) { //for each para recorrer cada invitado de la lista de invitados
            if (invitado.getNombre().equals(nombre)) { //Se comprueba si el nombre es el mismo que el del invitado
                System.out.println("Temporada " + invitado.getTemporada() + ", Fecha: " + invitado.getFecha_visita());
            }
        }
    }


    public boolean buscarInvitado(String nombre){
        for (Invitado invitado : listaInvitados) { //for each para recorrer cada invitado de la lista de invitados
            if (invitado.getNombre().equals(nombre)) { //Se comprueba si el nombre es el mismo que el del invitado
                return true; //Si coincide devuelve true
            }
        }
        return false; //Si no coincide devuelve false
    }


    public void invitadoAntes(String nombre, Programa programa1, Programa programa2){

        boolean estaEnPrograma1 = programa1.buscarInvitado(nombre); //Verificar si el invitado ha ido a los dos programas
        boolean estaEnPrograma2 = programa2.buscarInvitado(nombre);

        if(estaEnPrograma1 && estaEnPrograma2){
            LocalDate fecha1 = null; //fecha1 se asigna a null porque todavía no se sabe cuál es la primera fecha del programa1
            LocalDate fecha2 = null; //fecha2 se asigna a null porque todavía no se sabe cuál es la primera fecha del programa2

            for(Invitado invitado : programa1.getListaInvitados()){ //for each para recorrer cada invitado de la lista de invitados, para saber si ha estado antes en el programa1
                if(invitado.getNombre().equals(nombre)){ //Se comprueba si el nombre es el mismo que el del invitado
                    fecha1 = invitado.getFecha_visita(); //Se le asigna la primera fecha en la que estuvo el invitado en el programa 1
                    break;
                }
            }

            for(Invitado invitado : programa2.getListaInvitados()){ //for each para recorrer cada invitado de la lista de invitados, para saber si ha estado antes en el programa1
                if(invitado.getNombre().equals(nombre)){ //Se comprueba si el nombre es el mismo que el del invitado
                    fecha2 = invitado.getFecha_visita(); //Se le asigna la primera fecha en la que estuvo el invitado en el programa 2
                    break;
                }
            }

            //if, else if y else para comparar fecha1 y fecha2 y en cuál ha estado el invitado antes
            if(fecha1.isBefore(fecha2)){
                System.out.println("El invitado " + nombre + " ha ido antes al " + programa1.getNombre());
            } else if(fecha2.isBefore(fecha1)){
                System.out.println("El invitado " + nombre + " ha ido antes al "  + programa2.getNombre());
            } else {
                System.out.println("El invitado " + nombre + " ha ido el mismo día en ambos programas");
            }

            }else if(estaEnPrograma1){
                System.out.println("El invitado " + nombre + " solo ha ido al " + programa1.getNombre());
            } else if(estaEnPrograma2){
                System.out.println("El invitado " + nombre + " solo ha ido al " + programa2.getNombre());
            } else {
                System.out.println("El invitado " + nombre + " no ha ido a ningún programa");
        }
    }


    public void insertarEmpleado(String nombre, String cargo, Empleado director) {
        Empleado empleado = new Empleado(nombre, cargo); //Se crea un empleado

        if (!cargo.equals("director")) { //Si no tiene como cargo el de director
            listaEmpleados.add(empleado); //Se añade con un .add a la listaEmpleados
        }


    }

    public void insertarInvitado(String nombre, String profesion, int temporada) {
        Invitado invitado = new Invitado(nombre, profesion, temporada); //Se crea un invitado
        listaInvitados.add(invitado); //Se añade con un .add a la listaInvitados
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados.size() +
                ", listaInvitados=" + listaInvitados.size() +
                ", director=" + director +
                '}';
    }


}
