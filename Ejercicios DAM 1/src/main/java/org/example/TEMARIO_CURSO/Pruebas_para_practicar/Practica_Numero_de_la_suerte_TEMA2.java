package org.example.TEMARIO_CURSO.Pruebas_para_practicar;

import java.util.Scanner;

public class Practica_Numero_de_la_suerte_TEMA2 {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
        String fecha = read.next();

        int longitud = fecha.length();

        String fecha_dia = fecha.substring(0,2);
        String fecha_mes = fecha.substring(3,5);
        String fecha_anyo = fecha.substring(6,longitud);

        int fecha_dia_int = Integer.parseInt(fecha_dia);
        int fecha_mes_int = Integer.parseInt(fecha_mes);
        int fecha_anyo_int = Integer.parseInt(fecha_anyo);

        int suma_fecha = fecha_dia_int + fecha_mes_int + fecha_anyo_int;

        System.out.println(fecha_dia_int + " + " + fecha_mes_int + " + " + fecha_anyo_int + " = " + suma_fecha);

        String suma_resultado = Integer.toString(suma_fecha);

        String num1_res = suma_resultado.substring(0,1);
        String num2_res = suma_resultado.substring(1,2);
        String num3_res = suma_resultado.substring(2,3);
        String num4_res = suma_resultado.substring(3,4);

        int num1_res_int = Integer.parseInt(num1_res);
        int num2_res_int = Integer.parseInt(num2_res);
        int num3_res_int = Integer.parseInt(num3_res);
        int num4_res_int = Integer.parseInt(num4_res);

        int suma_resultados_nums = num1_res_int + num2_res_int + num3_res_int + num4_res_int;

        System.out.println(num1_res_int + " + " + num2_res_int + " + " + num3_res_int + " + " + num4_res_int + " = " + suma_resultados_nums);

        System.out.println("Número de la suerte: " + suma_resultados_nums);

        suma_resultados_nums = 0 ;

        for (int i = 0; i < 4; i++) {
            int num_res_int = Integer.parseInt(suma_resultado.substring(i,i + 1));
            suma_resultados_nums += num_res_int;
        }

        System.out.println("Número de la suerte: " + suma_resultados_nums);

    }
}
