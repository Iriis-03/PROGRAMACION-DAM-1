package org.example._5_EXAMENES_AÑOS_ANTERIORES.PISCINA_MUTXAMEL;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class AppPiscina {

    static Scanner read = new Scanner(System.in);
    private static TreeSet<Banyista> lista_banyistas = new TreeSet<Banyista>();
    private static Integer numero = 1;

    static void main(String[] args) {

//        lista_banyistas.add(new Adulto(1,"patricia",20,TipoUsuario.ADULTO));
//        lista_banyistas.add(new Adulto(2,"pablo",30,TipoUsuario.ADULTO));
//        lista_banyistas.add(new Ninyo("34565432",3,"pepe",12, TipoUsuario.NINYO));
//        lista_banyistas.add(new Ninyo("8569512",4,"carla",8,TipoUsuario.NINYO));
//        lista_banyistas.add(new Invitado(LocalDate.now(),5,"Fran",40,TipoUsuario.INVITADO));
//        lista_banyistas.add(new Invitado(LocalDate.now(),6,"Marta",12,TipoUsuario.INVITADO));

          altaUsuario();
          System.out.println();
          altaUsuario();
          System.out.println();
          mostrarBanyistas();


    }

    public static void mostrarBanyistas(){

        for (Banyista banyista : lista_banyistas){
            System.out.println(banyista);
        }
    }

    public static void cobrar(Banyista banyista){
        banyista.pagar();
    }

    public static void altaUsuario(){

        int opcion;

        System.out.println("*** APP DE MANTENIMIENTO DE LA PISCINA DE MUTXAMEL ***");
        System.out.println("Alta de usuarios...");
        System.out.println("    1. Adulto");
        System.out.println("    2. Niños (<= 16 años)");
        System.out.println("    3. Invitados (pase diario)");
        System.out.println("-------------------------------------");
        System.out.println("Elige un tipo: ");
        opcion = read.nextInt();
        read.nextLine();
        System.out.println("Introduce el nombre del nuevo bañista: ");
        String nombre = read.nextLine();
        System.out.println("Introduce la edad: ");
        int edad = read.nextInt();
        read.nextLine();

        switch (opcion){
            case 1:
                Banyista banyista_adulto = new Adulto(numero, nombre, edad, TipoUsuario.ADULTO);
                    lista_banyistas.add(banyista_adulto);
                numero++;
                System.out.println("Nuevo bañista creado.");
                cobrar(banyista_adulto);
                break;

            case 2:

                if (edad > 16){
                    throw new EdadMayor16Exception();
                }

                System.out.println("Introduce el teléfono de tu madre, padre o tutor: ");
                String telefono_contacto = read.nextLine();

                Banyista banyista_ninyo = new Ninyo(telefono_contacto, numero, nombre, edad, TipoUsuario.NINYO);
                lista_banyistas.add(banyista_ninyo);
                numero++;

                System.out.println("Nuevo bañista creado.");
                cobrar(banyista_ninyo);
                break;


            case 3:
                mostrarInvitados();
                break;
        }

    }

    public static void mostrarInvitados(){

        for (Banyista banyista : lista_banyistas){
            if (banyista instanceof Invitado){
                System.out.println("Es un invitado");
            }
        }

    }

    public static void eliminarInvitados(){

        Iterator<Banyista> iterator = lista_banyistas.iterator();

        while (iterator.hasNext()){
            Banyista banyista = iterator.next();

            if (banyista instanceof Invitado){
                lista_banyistas.remove(banyista);
            }

        }
    }
}
