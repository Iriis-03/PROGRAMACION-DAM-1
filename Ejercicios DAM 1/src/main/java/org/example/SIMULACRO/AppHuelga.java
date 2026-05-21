package org.example.SIMULACRO;

import org.example.TEMARIO_CURSO.TEMA6POO.PRACTICA2.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class AppHuelga {

    static ArrayList<Docente> listaHuelguistas = new ArrayList<>();

    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {


       verSeguimiento();
       validacion();



    }

    public static void verSeguimiento(){

        for (Docente docente : listaHuelguistas){

            if (docente.getEstado().equals(EstadoDocente.EN_HUELGA)){
                System.out.println("HUELGA TOTAL");
            } else if (docente.getEstado().equals(EstadoDocente.ACTIVO)){
                System.out.println("HUELGA PARCIAL " + docente + " docentes trabajando");
            }

        }



    }

    public static Docente validacion(){

        System.out.println("Introduce el DNI del docente: ");
        String dni = read.nextLine();

        for (Docente docente : listaHuelguistas){
            docente.getDni();
        }

        return CentroEducativo.validarDocente(dni);

    }

    public static void insertarHuelguista(){

        validacion();

        for (Docente docente : listaHuelguistas){
            if (listaHuelguistas.contains(docente)){
                throw new DocenteEnHuelga();
            } else {

            }
        }

    }

    public static void calcularDescuentoSalarial(){

    }

    public static void abandonarHuelga(){

    }

    public static void listadoConselleria(){

    }

    public static void generarEstadisticas(){

    }
}
