package org.example.PRUEBAS.PRUEBA_EXAMEN.ASISTENCIA_CLASES;

public class Alumno {

    private String nombre;
    private int horas;

    public Alumno(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", horas=" + horas +
                '}';
    }
}
