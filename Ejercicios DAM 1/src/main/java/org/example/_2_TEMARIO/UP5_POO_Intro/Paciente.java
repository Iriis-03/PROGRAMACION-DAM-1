package org.example._2_TEMARIO.UP5_POO_Intro;

import java.util.Random;

public class Paciente {

    static Random aleatorio = new Random();

    private static final char DEF_GENERO = 'X';
    private static final int INFRAPESO = -1;
    private static final int PESO_IDEAL = 0;
    private static final int SOBREPESO = 1;
    private static final int MAYOR_DE_EDAD = 18;

    private String nombre;
    private int edad;
    private String dni;
    private char genero;
    private double peso;
    private int altura;

    public Paciente(String nombre, int edad, char genero, double peso, int altura){

        this.nombre = nombre;
        this.edad = edad;
        dni = generarDNI();
        setGenero(genero);
        this.peso = peso;
        this.altura = altura;

    }

    public Paciente(){
        this(null, 0, DEF_GENERO, 0, 0);
    }

    private static String generarDNI(){

        String dni = "";

        for (int i = 0; i < 8; i++) {
            int num = aleatorio.nextInt(0,10);
            dni = dni + num;
        }


        int dni_num = Integer.parseInt(dni);

        int posicion = dni_num % 23;

        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };

        dni = dni + letras[posicion];

        return dni;
    }

    public int calcularIMC(){

        double resultado = peso / Math.pow((double) altura/100, 2);

        System.out.println(resultado);

        if (resultado < 20){
            return INFRAPESO;
        } else if (resultado > 25) {
            return SOBREPESO;
        } else {
            return PESO_IDEAL;
        }
    }

    public boolean esMayorDeEdad(){

        if (edad >= MAYOR_DE_EDAD){
            return true;
        } else {
            return false;
        }
    }

    private char validarGenero (char genero){

        if (genero == 'H' || genero == 'M'){
            return genero;
        } else {
            return DEF_GENERO;
        }
    }

    public void imprimirPaciente(){

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
        System.out.println("Género: " + genero);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);

    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getGenero() {
        return genero;
    }

    private void setGenero(char genero) {
        this.genero = validarGenero(genero);
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
       return "Paciente [Nombre: " + nombre + " Edad: " + edad + " DNI: " + dni + " Género: " + genero + " Peso: " + peso + " Altura: " + altura + "]";

    }


}
