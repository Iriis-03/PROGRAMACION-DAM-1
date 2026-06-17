package org.example.PRUEBAS;

public class Caracteres3 {

    static void main(String[] args) {

        int n = 123456;
        int m = 2;

        String n_string = Integer.toString(n);

        int operacion = n_string.length() - m;

        System.out.println(n_string.substring(0, operacion));

    }
}
