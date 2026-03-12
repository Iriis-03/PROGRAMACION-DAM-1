package org.example.TEMA7.Colecciones.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3Mapas {

    static HashMap<String, Double> mapa = new HashMap<>();
    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        System.out.println("**** REGISTRO DE TEMPERATURAS ****");

        while (true){
            System.out.println("Elige una opción [insertar, actualizar, consultar, ver todas, salir]");
            String opcion = read.nextLine().toLowerCase();

            switch (opcion){
                case "insertar":
                    insertar();
                    break;
                case "actualizar":
                    actualizar();
                    break;
                case "consultar":
                    consultar();
                    break;
                case "ver todas":
                    verTodas();
                    break;
                case "salir":
                    return;
                default:
                    System.out.println("No existe la opción. Vuelve a elegir una...");
            }

            System.out.println("*** mapa temporal ***");
            for (Map.Entry<String, Double> mapa2 : mapa.entrySet()){
                System.out.println(mapa2.getKey() + " - " + mapa2.getValue());
            }
        }
    }

    public static void insertar(){
        System.out.println("Introduce los datos (ciudad-temperatura): ");
        String[] ciudad = read.nextLine().split("/");

        mapa.put(ciudad[0],Double.valueOf(ciudad[1]));

    }

    public static void actualizar(){

        System.out.println("¿Qué ciudad deseas actualizar?");
        String[] actualizar_ciudad = read.nextLine().split("/");

        if (!mapa.get(actualizar_ciudad[0]).equals(Double.valueOf(actualizar_ciudad[1]))){
            System.out.println();
        } else {
            insertar();
        }

    }

    public static void consultar(){

    }

    public static void verTodas(){

    }
}
