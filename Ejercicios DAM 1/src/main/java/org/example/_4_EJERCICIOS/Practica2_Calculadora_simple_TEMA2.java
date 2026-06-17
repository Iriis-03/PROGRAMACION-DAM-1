package org.example._4_EJERCICIOS;

import java.util.Scanner;

public class Practica2_Calculadora_simple_TEMA2 {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("**** BIENVENIDO A LA CALCULADORA RÁPIDA ****");
        System.out.println("> Introduce operando: ");
        int operando1 = read.nextInt();

        System.out.println("-------------------------");
        System.out.println("[+] ->  sumar ");
        System.out.println("[-] ->  restar ");
        System.out.println("[x] ->  multiplicar ");
        System.out.println("[/] ->  dividir ");
        System.out.println("[R] ->  raíz cuadrada ");
        System.out.println("[S] ->  Salir ");
        System.out.println("-------------------------");

        System.out.println("Elige una operación: ");
        String operacion = read.next();

        int operando2 = 0;

        if (!operacion.equals("R")){
            System.out.println("> Introduce el segundo operando: ");
            operando2 = read.nextInt();
        }

        switch (operacion){

            case "+":
                System.out.println("El resultado de " + operando1 + " + " + operando2 + " es " + (operando1 + operando2));
                break;

            case "-":
                System.out.println("El resultado de " + operando1 + " - " + operando2 + " es " + (operando1 - operando2));
                break;

            case "x":
                System.out.println("El resultado de " + operando1 + " x " + operando2 + " es " + (operando1 * operando2));
                break;

            case "/":
                System.out.println("El resultado de " + operando1 + " / " + operando2 + " es " + (operando1 / operando2));
                break;

            case "R":
                System.out.println("El resultado de " + operando1 + " es " + Math.sqrt(operando1));
                break;

            case "S":
                break;

        }
    }
}
