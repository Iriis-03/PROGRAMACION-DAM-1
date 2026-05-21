package org.example.TEMARIO_CURSO.TEMA5POO;

public class Persona {

    private String nombre;
    private String dni;
    private int edad;

    public Persona(String nombre, String dni, int edad){

        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona(){

    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDni(){
        return dni;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void ImprimirDatos(){

        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
    }
}
