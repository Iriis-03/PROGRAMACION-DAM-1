package org.example._2_TEMARIO.UP7_Colecciones_Funcional.lambdas.Ejercicio1;

public class EjecutorApp {

    static void main(String[] args) {

        Ejecutor lambda = (num) ->{
            System.out.println("Comparando para " + num + ":");
            if (num > 10){
                return true;
            } else {
                return false;
            }
        };

        System.out.println(lambda.ejecutar(15));

    }
}