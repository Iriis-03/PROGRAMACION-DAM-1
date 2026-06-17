package org.example._2_TEMARIO.UP3_Estructuras_Datos.PRACTICAS;

import java.util.Scanner;

public class PremiosEsland {
    static void main() {
        Scanner read = new Scanner(System.in);

        System.out.println("*** ESTADÍSTICAS PREMIOS ESLAND ***");
        System.out.println("-----------------------------------");
        System.out.print("Inserta streamer a analizar: ");
        String streaemer = read.next();
        System.out.print("Inserta los espectadores medidos: ");
        read.nextLine();
        String numeros_streamer[] = read.nextLine().split(" ");
        int long_nums = numeros_streamer.length;
        read.nextLine();

        System.out.print("Inserta el número de comentarios: ");
        String comentarios_streamer[] = read.nextLine().split(" ");
        if (comentarios_streamer.length != numeros_streamer.length) {
            System.out.println("ERROR: Longitud Incorrecta.");
            return;
        }
        System.out.println("vamono");
    }
}