package org.example.TEMARIO_CURSO.RECURSIVIDAD;

import java.util.Enumeration;
import java.util.Scanner;

public class Menu {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        menu();
        System.out.println(dijitos(4556));
        System.out.println(potencias(2, 4));
        del_reves(25);

        System.out.println();

        String frase = "Hola mundo soy una frase al revés";
        char[] frase_char = frase.toCharArray();
        del_reves_char(frase_char.length - 1, frase_char);
        System.out.println();
        del_reves_char_sin_vector(frase.length() - 1, frase);

        System.out.println();

        System.out.println(binario(10001110));
        System.out.println(a_binario(128));
        System.out.println(mostrar_suma(4,1));


    }

    public static void menu(){

        Scanner read = new Scanner(System.in);

        System.out.println("*** Batería de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
        System.out.println("    1 - Dígitos");
        System.out.println("    2 - Potencias");
        System.out.println("    3 - Del Revés");
        System.out.println("    4 - Binario");
        System.out.println("    5 - A binario");
        System.out.println("    6 - Orden alfabético");
        System.out.println("    7 - Mostrar suma");

        int opcion = read.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Has elegido el modo [1]: DÍGITOS");
                System.out.println("Introduce un número: ");
                int num = read.nextInt();
                System.out.println(dijitos(num));
                break;
            case 2:
                System.out.println("Has elegido el modo [2]: POTENCIAS");
                System.out.println("Introduce un número (base): ");
                int base = read.nextInt();
                System.out.println("Introduce un número (exponente): ");
                int exponente = read.nextInt();
                System.out.println(potencias(base, exponente));
                break;
            case 3:
                System.out.println("Has elegido el modo [3]: DEL REVÉS");
                System.out.println("¿Quieres invertir una frase o un número? (F/N)");
                String eleccion = read.next();
                if (eleccion.equals("N")){
                    System.out.println("Introduce un número: ");
                    int N = read.nextInt();
                    del_reves(N);
                } else if (eleccion.equals("F")){
                    System.out.println("Introduce un texto: ");
                    String F = read.next();
                    del_reves_char_sin_vector(0, F);
                }
                break;
            case 4:
                System.out.println("Has elegido el modo [4]: BINARIO");
                System.out.println("Introduce un número: ");
                int num_bin = read.nextInt();
                if (binario(num_bin)){
                    System.out.println("Es binario");
                } else {
                    System.out.println("No es binario");
                }

                break;
            case 5:
                System.out.println("Has elegido el modo [5]: A BINARIO");
                System.out.println("Introduce un número: ");
                int num_a_bin = read.nextInt();
                System.out.println(a_binario(num_a_bin));
                break;
            case 6:
                System.out.println("Has elegido el modo [6]: ORDEN ALFABÉTICO");
                System.out.println("Introduce una palabra: ");
                String palabra = read.next();
                if (orden_alfabetico(palabra, 0)){
                    System.out.println("Esta ordenada alfabéticamente");
                } else {
                    System.out.println("No esta ordenada alfabéticamente");
                }
                break;
            case 7:
                System.out.println("Has elegido el modo [7]: MOSTRAR SUMA");
                System.out.println("Introduce un número: ");
                int num_suma = read.nextInt();
                System.out.println(mostrar_suma(num_suma, 1));
                break;
        }
    }

    public static void opcion(){

    }

    public static int dijitos(int num){

        if (num < 10){
            return 1;
        } else {
            return 1 + dijitos(num/10);
        }

    }

    public static int potencias(int base, int exponente){

        if (exponente == 1){
            return base;
        } else {
            return base * potencias(base, exponente - 1);
        }

    }

    public static void del_reves(int num){

        if (num < 10){
            System.out.print(num);
        } else {
            System.out.print(num % 10);
            del_reves(num/10);
        }

    }

    public static void del_reves_char(int posicion, char[] frase){

        if (posicion >= 0){
            System.out.print(frase[posicion]);
            del_reves_char(posicion - 1, frase);
        }

    }

    public static void del_reves_char_sin_vector(int posicion, String frase){

        if (posicion >= 0){
            System.out.print(frase.charAt(posicion));
            del_reves_char_sin_vector(posicion - 1, frase);
        }

    }

    public static boolean binario (int num){

        if (num >= 10){

            if (num % 10 == 0 || num % 10 == 1){
                return binario(num / 10);
            } else {
                return false;
            }
        } else {
            if (num == 0 || num == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static String a_binario(int num){

        if (num <= 1){
            return Integer.toString(num);
        } else {
            return a_binario(num / 2) + num % 2;
        }

    }

    public static boolean orden_alfabetico(String palabra, int posicion){


        if (posicion == palabra.length()){
            return true;
        } else {
            return (palabra.charAt(posicion) < palabra.charAt(posicion + 1)) && orden_alfabetico(palabra,posicion + 1);
        }

    }

    public static int mostrar_suma(int num, int indice){

        if (num == indice){
            System.out.print(num + " = ");
            return num;
        } else {
            System.out.print(indice + "+");
            return indice + mostrar_suma(num,indice + 1);
        }

    }
    
}
