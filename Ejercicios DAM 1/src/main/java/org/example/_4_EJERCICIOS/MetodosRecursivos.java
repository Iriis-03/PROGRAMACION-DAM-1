package org.example._4_EJERCICIOS;

public class MetodosRecursivos {

    static void main(String[] args) {

        System.out.println(funcion_recursiva(4));
    }


    public static int funcion_recursiva(int n){
        if (n <= 0){
            return 0;
        } else {
            int r = -n + funcion_recursiva(--n);
            return r;
        }
    }


}


