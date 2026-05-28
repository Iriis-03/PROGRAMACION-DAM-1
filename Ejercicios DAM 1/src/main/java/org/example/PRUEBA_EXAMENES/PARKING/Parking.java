package org.example.PRUEBA_EXAMENES.PARKING;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Parking {

    private String ciudad;
    private int plazas_totales;
    private double precio_minuto;
    private List<Ticket> clientesActuales = new ArrayList<>();

    public Parking(String ciudad, int plazas_totales, double precio_minuto, List<Ticket> clientesActuales) {
        this.ciudad = ciudad;
        this.plazas_totales = plazas_totales;
        this.precio_minuto = precio_minuto;
        this.clientesActuales = clientesActuales;
    }

    public Parking(String ciudad, int plazas_totales, double precio_minuto) {
        this.ciudad = ciudad;
        this.plazas_totales = plazas_totales;
        this.precio_minuto = precio_minuto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getPlazas_totales() {
        return plazas_totales;
    }

    public void setPlazas_totales(int plazas_totales) {
        this.plazas_totales = plazas_totales;
    }

    public double getPrecio_minuto() {
        return precio_minuto;
    }

    public void setPrecio_minuto(double precio_minuto) {
        this.precio_minuto = precio_minuto;
    }

    public List<Ticket> getClientesActuales() {
        return clientesActuales;
    }

    public void setClientesActuales(List<Ticket> clientesActuales) {
        this.clientesActuales = clientesActuales;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "ciudad='" + ciudad + '\'' +
                ", plazas_totales=" + plazas_totales +
                ", precio_minuto=" + precio_minuto +
                ", clientesActuales=" + clientesActuales +
                '}';
    }

    public void generarClientesAleatorios(){
        Random aleatorio = new Random();

        String letras = "BCDFGHJKLMNPQRSTVWXYZ";
        String numeros = "0123456789";

        for (int j = 0; j < 10; j++) {
            StringBuilder matricula = new StringBuilder();
            // 4 números
            for (int i = 0; i < 4; i++) {
                matricula.append(numeros.charAt(aleatorio.nextInt(numeros.length())));
            }
            // 3 letras
            for (int i = 0; i < 3; i++) {
                matricula.append(letras.charAt(aleatorio.nextInt(letras.length())));
            }

            Ticket ticket = new Ticket(matricula.toString(), 0, Estado.RECOGIDO);

            anyadirCliente(ticket);

        }

    }

    public void mostrarClientesActuales(){

        int contador = 0;

        System.out.println("*** PARKING MUTXAMEL ***");

        for (Ticket ticket : clientesActuales){
            System.out.println(contador + ". Matrícula: " + ticket.getMatricula() + " - minutos: " + ticket.getMinutos() + " - estado: " + ticket.getEstado());
            contador++;
        }

    }

    public void anyadirCliente(Ticket ticket){

        clientesActuales.add(ticket);

    }

    public Ticket validarTicket(String matricula){

        for (Ticket ticket : clientesActuales){
            if (ticket.getMatricula().equals(matricula)){
                return ticket;
            }
        }
        return null;
    }
}
