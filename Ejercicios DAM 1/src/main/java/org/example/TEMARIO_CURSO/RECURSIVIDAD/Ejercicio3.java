package org.example.TEMARIO_CURSO.RECURSIVIDAD;

public class Ejercicio3 {

    static int limite = 10;

    static void main(String[] args) {

        System.out.println(suma(10));

    }

    public static int suma(int num){

        if (num == 0){
            return num;

        } else {
            return num + suma(num - 1);
        }
    }
}
