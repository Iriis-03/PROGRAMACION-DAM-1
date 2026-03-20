package org.example.TEMA7.Colecciones.Colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio4Colas {

    static Scanner read = new Scanner(System.in);
    static Deque<String> lista_compra = new LinkedList<>();

    static void main(String[] args) {

        do {
            System.out.println(" ");
            System.out.println("--- LISTA DE LA COMPRA ---");
            System.out.println("1. Añadir producto al final");
            System.out.println("2. Eliminar primer producto");
            System.out.println("3. Eliminar producto por nombre");
            System.out.println("4. Ver primer producto");
            System.out.println("5. Buscar producto");
            System.out.println("6. Mostrar lista actual");
            System.out.println("X. Salir");
            System.out.println(" ");

        } while (menu());
    }

    public static boolean menu() {

        System.out.print("Seleccione una opción: ");
        int opcion = read.nextInt();
        read.nextLine();
        System.out.println(" ");
        System.out.println("-------------------------------------");
        System.out.println(" ");

        switch (opcion) {

            case 1:
                System.out.print("Producto a añadir: ");
                String producto_anadir = read.nextLine();
                lista_compra.offerLast(producto_anadir);
                System.out.println("El producto " + producto_anadir + " ha sido añadido correctamente a la lista");
                break;

            case 2:
                String eliminado = lista_compra.pollFirst();
                System.out.println("El producto " + eliminado + " ha sido eliminado correctamente de la lista");
                break;

            case 3:
                System.out.print("Producto a eliminar: ");
                String producto_eliminar = read.nextLine();
                lista_compra.remove(producto_eliminar);
                System.out.println("El producto " + producto_eliminar + " ha sido eliminado correctamente de la lista");
                break;

            case 4:
                System.out.println("Primer producto: " + lista_compra.peekFirst());
                break;

            case 5:
                System.out.print("¿Qué producto desea buscar? ");
                String producto_a_buscar = read.nextLine();
                if (lista_compra.contains(producto_a_buscar)) {
                    System.out.println("El producto " + producto_a_buscar + " está en la lista");
                } else {
                    System.out.println("El producto " + producto_a_buscar + " no está en la lista");
                }
                break;

            case 6:
                System.out.println("--- (ESTADO ACTUAL) LISTA DE LA COMPRA ---");
                int posicion = 1;

                for (String producto : lista_compra) {
                    System.out.println(posicion + ". " + producto);
                    posicion++;
                }
                break;

            case 'X':
                return false;

            default:
                System.out.println("Introduce una opción válida");
        }

        return true;
    }
}
