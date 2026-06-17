package org.example._5_EXAMENES_AÑOS_ANTERIORES.PISCINA_MUTXAMEL;

public abstract class Banyista implements Comparable<Banyista>{
    private Integer numero;
    private String nombre;
    private int edad;
    private TipoUsuario tipo;

    public Banyista(Integer numero, String nombre, int edad, TipoUsuario tipo) {
        this.numero = numero;
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    public abstract void pagar();

    @Override
    public int compareTo(Banyista otro) {
        return this.numero.compareTo(otro.numero);
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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

        if (edad < 0){
            System.out.println("ERROR. No puede insertar bañistas que no han nacido.");
        } else {
            this.edad = edad;
        }
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Banyista{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", tipo=" + tipo +
                '}';
    }
}
