package org.example._6_EXAMENES_ACTUALES.EXAMEN_UD1;

import java.util.Scanner;

public class FUMATA_BLANCA {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        final int MAX_CARDENALES = 200;
        final int MIN_CARDENALES = 2;
        final int MIN_VOTOS = 1;

        int cardenales=0;

        try {
            System.out.println("Introduce el número de cardenales (2-200): ");
            cardenales = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("ERROR. Introduce un formato válido (numérico).");
        }

        if (cardenales < MIN_CARDENALES || cardenales > MAX_CARDENALES){
            System.out.println("ERROR. Número de cardenales incorrecto.");
        }else{

            int votos = 0;
            try {
                System.out.println("Introduce el número de votos para el cardenal más votado: ");
                votos = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR. Introduce un formato válido (numérico).");
                return;
            }

            if (votos > cardenales){
                System.out.println("ERROR. No pueden haber votado más cardenales (" + votos + ") de los que han acudido al cónclave: " + cardenales);
            } else if (votos < MIN_VOTOS) {
                System.out.println("ERROR. Tiene que haber votado al menos " + MIN_VOTOS + " cardenales...");
            }else{

                int ganador = (cardenales * 2)/3;

                String fumata = "FUMATA NEGRA";

                if (cardenales % 3 == 0){
                    if (votos >= ganador){
                        fumata = "FUMATA BLANCA";
                    }
                }else{
                    if (votos >= (ganador+1)){
                        fumata = "FUMATA BLANCA";
                    }
                }

                System.out.println(fumata);
            }
        }
    }
}