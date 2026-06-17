package org.example._2_TEMARIO.UP5_POO_Intro.Biblioteca;

public class Libro {

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;

    private static final String CADENA_ID = "LIB";

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;

    public Libro (String titulo, String autor){

        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
        cantidadLibros++;
        librosDisponibles++;
        id = CalcularId();
    }

    private String CalcularId(){
        return CADENA_ID + cantidadLibros;
    }

    public void prestar(){

        if (disponible){
            disponible = false;
            System.out.println("El libro " + titulo + " ha sido prestado con éxito");
            librosDisponibles--;
        } else {
            System.out.println("El libro " + titulo + " no está disponible");
        }
    }

    public void devolver(){

        if (!disponible){
            disponible = true;
            System.out.println("El libro " + titulo + " ha sido devuelto");
            librosDisponibles++;
        } else {
            System.out.println("El libro " + titulo + " está disponible. No se puede devolver.");
        }
    }

    public boolean estaDisponible(){
        return disponible;
    }

    public static int getTotalLibros(){
        return cantidadLibros;
    }

    public static int getLibrosDisponibles(){
        return librosDisponibles;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
       this.id = id;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }



    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", id='" + id + '\'' +
                ", disponible=" + disponible +
                '}';
    }





}
