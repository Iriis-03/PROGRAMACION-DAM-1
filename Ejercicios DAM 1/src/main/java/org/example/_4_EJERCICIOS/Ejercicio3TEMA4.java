package org.example._4_EJERCICIOS;

public class Ejercicio3TEMA4 {

    static void main(String[] args) {

        String cadena_original = "¡Juan Carlos es el millor profe del món mundial (Pese su poca paciencia)!";
        System.out.println(may_cadena(cadena_original));
        System.out.println(vocales(cadena_original));
    }

    public static String may_cadena(String cadena){

      return cadena.toUpperCase();
    }

    public static int vocales(String cadena){

        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {

            if ("aáàeéèiíoóòuú".contains(cadena.substring(i, i + 1))){

                contador++;
            }
        }

        return contador;
    }
}
