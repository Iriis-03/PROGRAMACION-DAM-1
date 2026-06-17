package org.example.PRUEBAS.PRUEBA_EXAMEN.ASISTENCIA_CLASES;

import java.util.ArrayList;
import java.util.Scanner;

public class AsistenciaClasesApp {

    static Scanner read = new Scanner(System.in);
    static ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    static void main(String[] args) {

        boolean fin = false;

        do {

            System.out.println("Introduce el nombre del alumno... (o 'fin' para terminar)");
            String nombre = read.nextLine();

            if (nombre.equals("fin")){
                fin = true;
            } else {
                System.out.println("Horas: ");
                int horas = read.nextInt();

                read.nextLine();

                Alumno alumno = new Alumno(nombre, horas);
                listaAlumnos.add(alumno);
            }

        } while(!fin);

        System.out.println("Los alumnos con 20 horas o más en una sesión son: ");

        for (Alumno alumno : listaAlumnos){

            if (alumno.getHoras() >= 20){
                System.out.println(alumno.getNombre() + " con " + alumno.getHoras() + " horas.");
            }


        }



    }
}
