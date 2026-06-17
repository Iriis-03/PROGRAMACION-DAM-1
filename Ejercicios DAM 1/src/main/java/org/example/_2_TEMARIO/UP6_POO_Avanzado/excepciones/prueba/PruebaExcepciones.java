package org.example._2_TEMARIO.UP6_POO_Avanzado.excepciones.prueba;

public class PruebaExcepciones {

    static void main(String[] args) {

        int edad = 15;

        if (edad < 18){
            throw new EdadValida();
        }
    }
}
