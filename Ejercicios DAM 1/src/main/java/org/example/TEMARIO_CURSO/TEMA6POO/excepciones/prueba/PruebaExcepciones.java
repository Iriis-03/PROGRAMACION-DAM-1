package org.example.TEMARIO_CURSO.TEMA6POO.excepciones.prueba;

public class PruebaExcepciones {

    static void main(String[] args) {

        int edad = 15;

        if (edad < 18){
            throw new EdadValida();
        }
    }
}
