package org.example._2_TEMARIO.UP5_POO_Intro;

import java.util.Scanner;

public class CuentaBancariaApp {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Cuenta_Bancaria cuenta = new Cuenta_Bancaria("JuanCarlos", 1000000 );

        System.out.println("Introduce cantidad a Ingresar: " );
        double ingreso = read.nextDouble();

        System.out.println(cuenta.Ingresar(ingreso));

        System.out.println("Introduce cantidad a Retirar: " );
        double retirada = read.nextDouble();

        System.out.println(cuenta.Retirar(retirada));

        cuenta.MostrarInformacion();



    }
}
