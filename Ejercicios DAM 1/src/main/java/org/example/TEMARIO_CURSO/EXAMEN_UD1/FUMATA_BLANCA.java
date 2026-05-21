package org.example.TEMARIO_CURSO.EXAMEN_UD1;

import java.util.Scanner;

public class FUMATA_BLANCA {

        public static void main()  {

            Scanner read = new Scanner(System.in);

            int max_cardenales = 200;
            int min_cardenales = 2;
            int cardenales_reunidos = 0;
            int votos_max_cardenal = 0;
            int votos_fumata_blanca = 0;

            System.out.println(("Introduce el número de cardenales"));
            cardenales_reunidos = read.nextInt();
            if ((cardenales_reunidos<min_cardenales || cardenales_reunidos>max_cardenales)) {
                System.out.println(("Error número inválido"));
            } else {
                System.out.println(("Introduce el número de votos"));
                votos_max_cardenal = read.nextInt();
                if ((votos_max_cardenal < min_cardenales || votos_max_cardenal > cardenales_reunidos)) {
                    System.out.println(("Error número inválido"));
                } else {
                    if ((cardenales_reunidos%3==0)) {
                        votos_fumata_blanca = cardenales_reunidos/3*2;
                    } else {
                        votos_fumata_blanca = cardenales_reunidos/3*2+1;
                    }
                    if ((votos_max_cardenal>=votos_fumata_blanca)) {
                        System.out.println(("FUMATA BLANCA"));
                    } else {
                        System.out.println(("FUMATA NEGRA"));
                    }
                }
            }
        }
    }

