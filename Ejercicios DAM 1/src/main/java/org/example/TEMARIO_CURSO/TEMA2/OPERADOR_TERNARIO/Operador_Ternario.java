package org.example.TEMARIO_CURSO.TEMA2.OPERADOR_TERNARIO;

public class Operador_Ternario {

    static void main() {

        int a = 1, b = 2, c = 3;
        int resultado = a++ == 2 && c > b++ ? a += b :
                a > 0 && a == b ? a += c :
                        a == c ? a++ : a--;

        System.out.println(resultado);


        a = 1;
        b = 2;
        c = 3;

        int resultado2 = a++ == 1 && a > b++ ? a += b :
                a > 0 && a == b ? a += c :
                        a == c ? a++ : a--;

        System.out.println(resultado2);


        a = 5;
        b = 3;
        c = 1;

        int resultado3 = c++ == 1 && b > c++ ? c + a :
                b > 2 && c == b ? c + b :
                        c == b ? b : b++;

        System.out.println(resultado3);
    }
}

