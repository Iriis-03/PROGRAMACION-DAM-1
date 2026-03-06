package org.example.TEMA7.Colecciones.HashSet;

import lombok.*;

import java.util.Objects;

@Getter
@ToString
public class Presidente {

    private String nombre;
    private String pais;

    public Presidente(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Presidente that = (Presidente) o;
        return Objects.equals(pais, that.pais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pais);
    }
}
