package org.example.TEMA7.Colecciones.lambdas;

public class PruebaApp {

    static void main(String[] args) {

        Prueba anonima = new Prueba() {
            @Override
            public String aprobar(int nota) {
                System.out.println("Aprobando programación desde una anónima con un " + nota);
                if (nota >= 5){
                    return "APROBADO";
                } else {
                    return "AL MIÉRCOLES CON ANÓNIMAS";
                }
            }
        };

        Prueba lambda = (nota) -> {System.out.println("Aprobando programación desde una lambda con un " + nota);
            if (nota >= 5){
                return "APROBADO";
            } else {
                return "AL MIÉRCOLES CON LAMBDAS";
            }
        };

        System.out.println(anonima.aprobar(5));
        System.out.println(lambda.aprobar(4));
    }
}
