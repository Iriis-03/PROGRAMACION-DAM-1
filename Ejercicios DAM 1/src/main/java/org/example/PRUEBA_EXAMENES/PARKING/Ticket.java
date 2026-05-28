package org.example.PRUEBA_EXAMENES.PARKING;

public class Ticket implements Acciones{
    private String matricula;
    private Integer minutos;
    private Estado estado;

    public Ticket(String matricula, Integer minutos, Estado estado) {
        this.matricula = matricula;
        this.minutos = minutos;
        this.estado = estado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "matricula='" + matricula + '\'' +
                ", minutos=" + minutos +
                ", estado=" + estado +
                '}';
    }

    @Override
    public void generar() {
        System.out.println("Leyendo matricula...");
        System.out.println("Matrícula: " + getMatricula());
        setEstado(Estado.GENERADO);
        System.out.println("Ticket generado.");
    }

    @Override
    public void recoger() {
        System.out.println("Recoja su ticket...");
        System.out.println("BIENVENIDO!");
        setEstado(Estado.RECOGIDO);
    }

    @Override
    public void pagar() {
        System.out.println("Buen viaje!");
        setEstado(Estado.PAGADO);
    }
}
