package org.example.TEMA7.Colecciones.HashSet;

public class PresidentesApp {

    static void main(String[] args) {

        Presidente trump = new Presidente("Donald Trump", "USA");
        System.out.println(trump.hashCode());
        Presidente milei = new Presidente("Donald Trump", "USA");
        System.out.println(milei.hashCode());

        if (trump.equals(milei)){
            System.out.println("Son iguales");
        }
    }
}
