package org.example._2_TEMARIO.UP5_POO_Intro.inmobiliaria;

public class Propietario {

    private String nombre;

    public Propietario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    private int edad;

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
