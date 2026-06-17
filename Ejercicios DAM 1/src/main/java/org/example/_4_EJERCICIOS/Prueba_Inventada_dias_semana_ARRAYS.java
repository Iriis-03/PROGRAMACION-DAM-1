package org.example._4_EJERCICIOS;

import java.util.Arrays;

public class Prueba_Inventada_dias_semana_ARRAYS {

    static void main() {

        String dias_semana[] = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
        System.out.println(Arrays.toString(dias_semana));

        for (int i = 0; i < dias_semana.length; i++){
            if (i < 5){
                System.out.print(dias_semana[i] + " ");
            }
        }

    }
}
