package org.example.TEMARIO_CURSO.TEMA5POO.Biblioteca;

public class EstudianteApp {

    static void main(String[] args) {

        Estudiante iris = new Estudiante("Iris", "1DAM", "iriis.workflow@gmail.com");

        System.out.println(iris.getNia());
        System.out.println(iris);

        Estudiante david = new Estudiante("David");

        System.out.println(david.getNia());
        System.out.println(david);

        Estudiante adrian = new Estudiante("adrian");

        System.out.println("Hay " + Estudiante.obtenerTotalEstudiantes() + " estudiantes.");

        System.out.println(Estudiante.validarCorreo("iriis@mutxamel.com"));
        System.out.println(Estudiante.validarCorreo("iriis@alu.edu.gva.es"));

        Libro divina_comedia = new Libro("divina comedia", "dante ali");

        System.out.println(divina_comedia);
        divina_comedia.prestar();

        System.out.println(divina_comedia.estaDisponible());

        System.out.println("Libros disponibles: " + Libro.getLibrosDisponibles());
        System.out.println("Libros creados: " + Libro.getTotalLibros());

        divina_comedia.devolver();
        divina_comedia.devolver();

        System.out.println(divina_comedia.estaDisponible());


    }
}
