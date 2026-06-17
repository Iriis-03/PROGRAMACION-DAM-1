package org.example._2_TEMARIO.UP2_Estructuras_Control.BUCLES;

public class Ejercicio3_Bucles {

    static void main() {

        for (int i = 1;i <= 50;i++) {

            if (i % 3 != 0){
                continue;
            }

            System.out.println(i);
        }
    }
}
