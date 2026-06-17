package org.example._2_TEMARIO.UP5_POO_Intro;

public class Main {
    static void main(String[] args) {

        Bocadillo pepito = new Bocadillo("pepito","normal","bacon","bigmac",10.0);

        pepito.ImprimirInfoBocata();

        System.out.println(pepito.getNombre() + " " + pepito.getPrecio() + "€");

        Bocadillo vacio = new Bocadillo();

        vacio.setNombre("chivito");

        vacio.ImprimirInfoBocata();
    }
}
