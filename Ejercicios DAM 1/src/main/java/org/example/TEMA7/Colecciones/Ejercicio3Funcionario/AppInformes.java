package org.example.TEMA7.Colecciones.Ejercicio3Funcionario;

import java.util.HashSet;
import java.util.Stack;

public class AppInformes {

    static void main(String[] args) {

        Stack<Informe> pila = new Stack<>();

        pila.push(new Informe(8364, "Informe 02", "ADMINISTRATIVO"));
        pila.push(new Informe(2384, "Informe 29", "PERSONAL"));
        pila.push(new Informe(8374, "Informe 16", "EMPRESARIAL"));
        pila.push(new Informe(8374, "Informe 16", "EMPRESARIAL"));
        pila.push(new Informe(9367, "Informe 83", "PERSONAL"));

        System.out.println();
        System.out.println("Se están eliminando los 5 informes añadidos recientemente...");
        System.out.println("-----------------------------------------------------------------");

        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("          **** Se han eliminado correctamente. ****");
        System.out.println("-----------------------------------------------------------------");

        System.out.println();
        System.out.println("Nuevas tareas añadidas:");
        System.out.println("-----------------------------------------------------------------");

        pila.push(new Informe(9348, "Tarea 73", "EMPRESARIAL"));
        System.out.println(pila.peek());
        pila.push(new Informe(6374, "Tarea 57", "PERSONAL"));
        System.out.println(pila.peek());
        pila.push(new Informe(6374, "Tarea 57", "PERSONAL"));
        System.out.println(pila.peek());

        int tareasSinRepetir = tareasSinRepetir(pila);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("         **** Hay " + tareasSinRepetir + " tareas que no se repiten. ****");
        System.out.println("-----------------------------------------------------------------");

    }

    public static int tareasSinRepetir(Stack<Informe> pila) {

        HashSet<Informe> set = new HashSet<>(pila);
        return set.size();

    }
}
