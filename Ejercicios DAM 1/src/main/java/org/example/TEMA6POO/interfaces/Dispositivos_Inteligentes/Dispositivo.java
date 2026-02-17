package org.example.TEMA6POO.interfaces.Dispositivos_Inteligentes;

public abstract class Dispositivo {

    protected String nombre;
    protected boolean estado;

    public Dispositivo(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public Dispositivo(String nombre) {
        this.nombre = nombre;
    }

    public abstract void encender();

    public void apagar(){

        if (!estado){
            System.out.println(nombre + " apagado.");
        } else {

            estado = false;
            System.out.println(nombre + " ya está apagado.");
        }
    }

    public void mostrarEstado(){
        if (estado){
            System.out.println(nombre + " encendido.");
        } else {
            System.out.println(nombre + " apagado.");
        }

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "nombre='" + nombre + '\'' +
                ", estado=" + estado +
                '}';
    }
}
