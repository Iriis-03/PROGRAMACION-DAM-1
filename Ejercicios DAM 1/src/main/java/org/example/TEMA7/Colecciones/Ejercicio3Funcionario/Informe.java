package org.example.TEMA7.Colecciones.Ejercicio3Funcionario;

import java.util.Objects;

public class Informe {

    private int codigo;
    private String descripcion;
    private Tipo tipo;

    public Informe(int codigo, String descripcion, String tipo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = Tipo.valueOf(tipo.toUpperCase());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Informe{" +
                "codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Informe informe = (Informe) o;
        return codigo == informe.codigo && Objects.equals(descripcion, informe.descripcion) && tipo == informe.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, descripcion, tipo);
    }
}
