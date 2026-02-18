package org.example.TEMA6POO.enums.Ejercicio1;

public enum Semaforo {

    AMARILLO, ROJO, VERDE;

    public Semaforo siguiente(){
        switch (this){
            case AMARILLO:
                return ROJO;
            case ROJO:
                return VERDE;
        }
        return AMARILLO;
    }


}
