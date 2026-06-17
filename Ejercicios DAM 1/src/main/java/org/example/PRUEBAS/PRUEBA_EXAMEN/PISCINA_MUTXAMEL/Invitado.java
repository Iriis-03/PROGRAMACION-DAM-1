package org.example.PRUEBAS.PRUEBA_EXAMEN.PISCINA_MUTXAMEL;

import java.time.LocalDate;

public class Invitado extends Banyista{

    private LocalDate fecha_visita;

    public Invitado(LocalDate fecha_visita, Integer numero, String nombre, int edad, TipoUsuario tipo) {
        this.fecha_visita = fecha_visita;
        super(numero, nombre, edad, tipo);
    }

    @Override
    public void pagar() {
        System.out.println("Invitado (abono de tipo INVITADO) pagando " + TipoUsuario.INVITADO.getPrecio() + "€");
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "fecha_visita=" + fecha_visita;
    }
}
