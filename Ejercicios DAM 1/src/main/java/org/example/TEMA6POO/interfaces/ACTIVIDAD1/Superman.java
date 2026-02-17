package org.example.TEMA6POO.interfaces.ACTIVIDAD1;

public class Superman extends Superheroe implements Volador, Ataques{

    @Override
    public void volar(){
        System.out.println("Volando por la ciudad");
    }

    @Override
    public void rayoLaser(){
        System.out.println("Disparando rayos");
    }

    @Override
    public void alientoHelado(){

        System.out.println("Congelando a la gente");
    }
}
