package org.example.APUNTES_RECU.EXAMENES_ANTERIORES.Parking_Mutxamel;

import java.util.Objects;

/**
 * CLASE BASE: Contiene los atributos comunes de cualquier vehículo en el parking.
 * Implementa 'Comparable' para definir la "Ordenación Natural" (por matrícula).
 */
public class Ticket implements Comparable<Ticket> {
    // Atributos protected para que las clases hijas (como Cliente) puedan verlos
    protected String matricula;
    protected int minutos;
    protected Estado estado;

    public Ticket(String matricula, int minutos) {
        this.matricula = matricula;
        this.minutos = minutos;
        this.estado = Estado.ENTRADA; // Todo ticket empieza en estado ENTRADA
    }

    /**
     * EQUALS Y HASHCODE: Obligatorios para que las colecciones (como Set o List)
     * sepan cuándo dos tickets son iguales. En este caso, por la matrícula.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket)) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(matricula, ticket.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    /**
     * COMPARETO: Define cómo se ordena una lista de tickets por defecto.
     * Aquí usamos el método compareTo de la clase String para ordenar alfabéticamente.
     */
    @Override
    public int compareTo(Ticket o) {
        return this.matricula.compareTo(o.matricula);
    }

    // Getters y Setters: Necesarios para el Encapsulamiento
    public String getMatricula() { return matricula; }
    public int getMinutos() { return minutos; }
    public void setEstado(Estado estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + " | Minutos: " + minutos + " | Estado: " + estado;
    }
}
