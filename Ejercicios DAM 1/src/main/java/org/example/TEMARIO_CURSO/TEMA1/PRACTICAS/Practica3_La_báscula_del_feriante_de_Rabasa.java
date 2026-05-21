package org.example.TEMARIO_CURSO.TEMA1.PRACTICAS;

import java.util.Scanner;

public class Practica3_La_báscula_del_feriante_de_Rabasa {

    public static void main() {

        int falta_cm = 0; //Tanto la variable "falta_cm" como "altura" son números enteros porque el resultado se calcula por cm.
        int altura = 0;

        final int altura_minima = 140; //Se utiliza la constante "final" para determinar que el valor tanto de la "altura_minima" como de la "altura_maxima" no va a variar.
        final int altura_maxima = 230;

        final double peso_maximo = 120; //Se utiliza la constante "final" para determinar que el valor del "peso_maximo" no va a variar y "double" para deteminar que el valor es con decimales.
        double peso = 0; //Se utiliza "double" ya que no es un número entero, sino con decimales
        double falta_kg = 0;
        double sobra_kg = 0;

        Scanner read = new Scanner(System.in); //Pongo como variable read para que pueda leer/escanear lo que introduce el usuario en el teclado.

        System.out.println("BIENVENIDO AL RATÓN JUGUETÓN"); //Se le da la bienvenida al usuario.
        System.out.println("Leyendo altura (cm)..."); //Se le pide al usuario que escriba su altura en el teclado.
        altura = read.nextInt(); //Se lee la variable "altura" asignada al numero 0 para que el usuario cuando ponga su altura (cm) en el teclado la máquina lo pueda leer.

        double peso_minimo = (altura * 2 / 8); //Se calcula el peso mínimo segun la altura que haya puesto el ususario en el teclado.

        if (altura < altura_minima) { // Se pone la condición "if" para decir que si la altura es menor a la mínima requerida se calcule cuanto cm de altura le falta al usuario para poder montarse a la atracción. Si fuese mayor a la mínima requerida pasaria a a la siguente condición.
            falta_cm = altura_minima - altura;
            System.out.println("No puedes montar en la atracción... Te faltan " + falta_cm + " cm");

        } else if (altura > altura_maxima && altura < 0) { //Se pone la condición "else if" para detectar si la altura que ha puesto el usuario en el teclaro es mayor a la máxima o es negativa. Si no es, pasaria a la siguiente condición.
            System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR…");

        } else {
            System.out.println("Leyendo peso (kg)..."); //Se pone la condición "else" para detectar si todo lo anterior cumple con lo que pide el programa (que la altura no esta por debajo de la mínima, que no sobrepase la máxima y que no de negativo) continua leyendo el programa.
            peso = read.nextDouble();

            if (peso < 0) { //Se pone la condición "if" para decir que si el peso es negativo, muestre el siguiente mensaje.
                System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR…");
            } else if (peso_maximo >= peso && peso_minimo <= peso) { //Se pone la condición "else if" para detectar si el peso que introduce el usuario en el teclado es menor o igual al "peso_maximo" y es mayor o igual al "peso_mínimo", puede subirse a la atracción.
                System.out.println("¡¡SUBE A LA ATRACCIÓN!!");
            } else if (peso < peso_minimo) { // Se pone la condición "else if" para detectar que si no se cumple lo anterior y el peso introducido por el usuario es menor al "peso_minimo", se mostrara un mensaje de que no puede subir a la atracción y que además le faltan kg.
                falta_kg = peso_minimo - peso; //Se calculan los kg que faltan para poder subirse a la atracción.
                System.out.println("No puedes montar en la atracción... Te faltan " + falta_kg + " kg");
            } else { //Se pone la condición "else" para detectar que si no cumple todo lo anterior y el peso introducido por el ususario es mayor al "peso_maximo", se mostrara un mensaje de que no puede subir a la atracción y además le sobran kg.
                sobra_kg = peso - peso_maximo; //Se calculan los kg que sobran para poder subirse a la atracción.
                System.out.println("No puedes montar en la atracción... Te sobran " + sobra_kg + " kg");
            }
        }
    }
}

