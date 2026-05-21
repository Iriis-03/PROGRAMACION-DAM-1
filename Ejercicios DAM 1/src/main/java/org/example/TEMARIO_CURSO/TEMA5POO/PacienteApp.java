package org.example.TEMARIO_CURSO.TEMA5POO;

import java.util.Scanner;

public class PacienteApp {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);
//
//        System.out.println(iris.getDni());
//
//        Paciente prueba = new Paciente("Iris", 22, 'G', 59, 155);
//
//        System.out.println(prueba.calcularIMC());
//
//        if (prueba.esMayorDeEdad()){
//            System.out.println("Es mayor");
//        } else {
//            System.out.println("Es menor");
//        }
//        System.out.println(iris.esMayorDeEdad());
//        System.out.println(prueba.getGenero());

        System.out.println("Introduce tu nombre: ");
        String nombre = read.next();

        System.out.println("Introduce tu edad: ");
        int edad = read.nextInt();

        System.out.println("Introduce tu género: ");
        char genero = read.next().charAt(0);

        System.out.println("Introduce tu peso: ");
        double peso = read.nextDouble();

        System.out.println("Introduce tu altura: ");
        int altura = read.nextInt();

        Paciente prueba = new Paciente(nombre, edad, genero, peso, altura);

        prueba.imprimirPaciente();
        System.out.println(prueba.calcularIMC());
        System.out.println(prueba.esMayorDeEdad());

        System.out.println(prueba);
    }
}
