package org.example.TEMA6.PRACTICA1;

import java.util.Scanner;

public class TarjetaCredito extends MetodoPago{

    private String nro_tarjerta;
    private String tipo;

    public TarjetaCredito(String nro_tarjerta, String tipo) {
        this.nro_tarjerta = nro_tarjerta;
        this.tipo = tipo;
    }

    public TarjetaCredito() {

    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con tarjeta de crédito VISA");
    }

    @Override
    public boolean validar(){
        Scanner read = new Scanner(System.in);

        System.out.println("Introduce los datos de tu tarjeta: ");
        String num_tarjeta = read.nextLine();

        if (num_tarjeta.length() == 16){
            nro_tarjerta = num_tarjeta;
        } else {
            System.out.println("Los datos de tu tarjeta no son correctos.");
            return false;
        }

        System.out.println("Selecciona el tipo de tarjeta [VISA, MAESTRO, MASTERCARD]: ");
        String tipo_tarjeta = read.nextLine();
        System.out.println("Validando tarjeta...");

        switch (tipo_tarjeta){

            case "VISA":
            case "MAESTRO":
            case "MASTERCARD":
                tipo = tipo_tarjeta;
                break;
            default:
                System.out.println("Los datos de tu tarjeta no son correctos.");
        }
        return false;
    }

    public String getNro_tarjerta() {
        return nro_tarjerta;
    }

    public void setNro_tarjerta(String nro_tarjerta) {
        this.nro_tarjerta = nro_tarjerta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "nro_tarjerta='" + nro_tarjerta + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
