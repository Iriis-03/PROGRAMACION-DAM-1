package org.example.PRUEBAS.PRUEBA_EXAMEN;

import java.util.ArrayList;
import java.util.Scanner;

public class ContenidoMasVisto {

    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        ArrayList<String> listaSeries = new ArrayList<>();
        ArrayList<Integer> listaMinutosSeries = new ArrayList<>();

        do {

            System.out.println("Introduce el nombre de tu serie... (o 'salir' para terminar)");
            String nombre_serie = read.nextLine();

            if (nombre_serie.equals("salir")){
                break;
            }

            System.out.println("Minutos: ");
            int minutos_serie = read.nextInt();

            read.nextLine();

            listaSeries.add(nombre_serie);
            listaMinutosSeries.add(minutos_serie);


        } while(true);

        System.out.println("Las series que has visto durante más de 30 minutos son: ");

        for (int i = 0; i < listaSeries.size(); i++) {
            listaSeries.get(i);
            listaMinutosSeries.get(i);

            if (listaMinutosSeries.get(i) > 30){
                System.out.println(listaSeries.get(i) + " con " + listaMinutosSeries.get(i) + " minutos.");
            }
        }
    }
}
