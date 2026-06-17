package org.example._2_TEMARIO.UP4_Prog_Modular;

public class Main {
    public static void main(String[] args) {

        int num = 10;
        int numero = funcion(num, "Iris");
        System.out.println(numero);
        procedimiento();
        System.out.println("He vuelto del procedimiento");

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }

        pintar_nombre("Iris","David","Jacobo","Adri");

    }
    public static int funcion(int numero, String nombre){

        System.out.println("Hola " + nombre);
        numero = numero + 20;
        return numero * 10;
    }

    public static void procedimiento(){
        System.out.println("Hola soy un procedimiento y hago mis cosas y no devuelvo nada");
    }

    public static void pintar_nombre(String...nombre){

        for (String nom : nombre){
            System.out.println(nom);
        }

    }

}
