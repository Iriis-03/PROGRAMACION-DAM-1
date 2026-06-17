package org.example._4_EJERCICIOS;

import java.util.Scanner;

    public class Prueba_Inventada_Alquiler {

        static void main() {

            Scanner read = new Scanner(System.in);

            System.out.println("Introduce los días de alquiler: ");
            int dias = read.nextInt();

            System.out.println("Introduce el precio por día: ");
            double precio = read.nextDouble();

            System.out.println("¿Es cliente habitual?");
            boolean cliente_habitual = read.nextBoolean();

            double alquiler = precio * dias;

            if (dias > 7) {
                double descuento = alquiler * 10 / 100;
                alquiler = alquiler - descuento;
            }

            if (cliente_habitual) {
                double descuento_cliente = alquiler * 5 / 100;
                alquiler = alquiler - descuento_cliente;
            }

            System.out.println("Precio final: " + alquiler);
        }
    }