package org.example.TEMARIO_CURSO.TEMA3.BUCLES_ANIDADOS;

public class BuclesAnidados {

    static void main() {

        externo:
        for (int i = 0; i < 9; i++){
            System.out.println("Soy el externo con i = " + i);
            interno:
            for (int j = 10; j >= 0; j--){
                System.out.println("Soy el interno con j = " + j);
                if (j == 5){
                    continue;
                }

                System.out.println("Hola " + (j+i));

            }
        }
    }
}
