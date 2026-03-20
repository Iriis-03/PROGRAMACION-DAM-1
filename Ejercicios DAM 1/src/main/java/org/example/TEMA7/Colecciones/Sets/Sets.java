package org.example.TEMA7.Colecciones.Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {

    static void main(String[] args) {

        String esquiroles[] = {"Joaquín", "Christian", "Christian", "Carlos", "Carlos", "Ángel", "Kevin", "Eric", "DavidG"};

        HashSet<String> normal = new HashSet<>(Arrays.asList(esquiroles));
        LinkedHashSet<String> respeta_add = new LinkedHashSet<>(Arrays.asList(esquiroles));
        TreeSet<String> ordenada = new TreeSet<>(Arrays.asList(esquiroles));

        System.out.println(normal); //poner el orden de más eficiente a menos
        System.out.println(respeta_add); //quita repetidos
        System.out.println(ordenada); //ordena

    }
}
