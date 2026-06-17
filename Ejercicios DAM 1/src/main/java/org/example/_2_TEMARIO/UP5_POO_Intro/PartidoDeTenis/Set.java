package org.example._2_TEMARIO.UP5_POO_Intro.PartidoDeTenis;

public class Set {

    private int puntosJ1;
    private int puntosJ2;

    public Set(int puntosJ1, int puntosJ2) {
        if (controlarPuntuacion(puntosJ1, puntosJ2)){
            this.puntosJ1 = puntosJ1;
            this.puntosJ2 = puntosJ2;
        }
    }

    public boolean controlarPuntuacion(int puntosJ1, int puntosJ2){

        if (puntosJ1 == 7 && (puntosJ2 == 6 || puntosJ2 == 5)){
            return true;
        }

        if (puntosJ2 == 7 && (puntosJ1 == 6 || puntosJ1 == 5)){
            return true;
        }

        if (puntosJ1 == 6 && (puntosJ2 < 5 && puntosJ2 >= 0)){
            return true;
        }

        if (puntosJ2 == 6 && (puntosJ1 < 5 && puntosJ1 >= 0)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return  puntosJ1 + " - " + puntosJ2;
    }

    public int getPuntosJ1() {
        return puntosJ1;
    }

    public void setPuntosJ1(int puntosJ1) {
        this.puntosJ1 = puntosJ1;
    }

    public int getPuntosJ2() {
        return puntosJ2;
    }

    public void setPuntosJ2(int puntosJ2) {
        this.puntosJ2 = puntosJ2;
    }

    public boolean correcto() {
        if (puntosJ1 < 6 && puntosJ2 < 6){
            return false;
        }

        if (puntosJ1 > 7 && puntosJ2 > 7){
            return false;
        }

        if (puntosJ1 == 6 && puntosJ2 == 6){
            return false;
        }

        if (puntosJ1 == 7 && puntosJ2 == 7){
            return false;
        }

        return true;
    }
}
