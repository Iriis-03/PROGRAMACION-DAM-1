package org.example.TEMA7.Colecciones.Sets;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio2Sets {

    static Scanner read = new Scanner(System.in);
    static TreeSet<String> set_agenda = new TreeSet<>();


    static void main(String[] args) {

        do {

            System.out.println(" ");
            System.out.println("------ AGENDA ------");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("X. Salir");
            System.out.println(" ");

        } while(menu());
    }

    static public boolean menu(){

        System.out.print("Elige una opción: ");
        int opcion = read.nextInt();
        read.nextLine();
        System.out.println(" ");
        System.out.println("----------------------");
        System.out.println(" ");

        switch (opcion){
            case 1:
                System.out.print("Nombre del nuevo contacto: ");
                String anadir_contacto = read.nextLine();

                if (!set_agenda.add(anadir_contacto)){
                    System.out.println("El contacto ya exite");
                } else {
                    System.out.println("Se ha añadido correctamente el contacto " + anadir_contacto + " a la agenda de contactos");
                }
                break;

            case 2:
                System.out.println("------ (ESTADO ACTUAL) AGENDA ------");

                int posicion = 1;

                for (String contacto : set_agenda) {
                    System.out.println(posicion + ". " + contacto);
                    posicion++;
                }
                break;

            case 3:
                System.out.println("¿Qué contacto desea buscar?");
                String contacto_a_buscar = read.nextLine();

                if (set_agenda.contains(contacto_a_buscar)){
                    System.out.println("El contacto " + contacto_a_buscar + " está en la agenda");
                } else {
                    System.out.println("El contacto " + contacto_a_buscar + " no está en la agenda");
                }
                break;

            case 4:
                System.out.println("¿Qué contacto desea eliminar?");
                String contacto_a_eliminar = read.nextLine();

                if (set_agenda.remove(contacto_a_eliminar)){
                    System.out.println("El contacto " + contacto_a_eliminar + " se ha eliminado correctamente");
                } else {
                    System.out.println("El contacto " + contacto_a_eliminar + " no se ha podido eliminar");
                }
                break;

            case 'X':
                return false;
        }
        return true;
    }
}
