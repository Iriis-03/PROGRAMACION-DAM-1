package org.example.SIMULACRO;

public class Docente {

    private String dni;
    private Integer diasHuelga;
    private EstadoDocente estado;

    public Docente(String dni, Integer diasHuelga, EstadoDocente estado) {
        this.dni = dni;
        this.diasHuelga = diasHuelga;
        this.estado = estado;
    }

    public Docente(String dni, EstadoDocente estado) {
        this.dni = dni;
        this.diasHuelga = null;
        this.estado = estado;
    }

    public Docente() {

    }

    public void asignarServiciosMinimos(){
        setEstado(EstadoDocente.SERVICIOS_MINIMOS);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getDiasHuelga() {
        return diasHuelga;
    }

    public void setDiasHuelga(Integer diasHuelga) {
        this.diasHuelga = diasHuelga;
    }

    public EstadoDocente getEstado() {
        return estado;
    }

    public void setEstado(EstadoDocente estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "dni='" + dni + '\'' +
                ", diasHuelga=" + diasHuelga +
                ", estado=" + estado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Docente)) return false;

        Docente docente = (Docente) o;

        return dni.equals(docente.dni);
    }

    @Override
    public int hashCode() {
        return dni.hashCode();
    }
}
