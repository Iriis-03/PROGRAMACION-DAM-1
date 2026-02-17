package org.example.TEMA6.PRACTICA1;

import java.util.Random;
import java.util.Scanner;

public class Bizum extends MetodoPago{

    private String telefono;
    private int pin;

    public Bizum(String telefono, int pin) {
        this.telefono = telefono;
        this.pin = pin;
    }

    public Bizum() {

    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con Bizum");
    }
    @Override
    public boolean validar(){
        Random aleatorio = new Random();
        Scanner read = new Scanner(System.in);
        int pin_generado_bizum = aleatorio.nextInt(1000000);

        System.out.println("Introduce tu número de teléfono vinculado con Bizum: ");
        String telefono_bizum = read.nextLine();
        if (telefono_bizum.length() == 9){
            telefono = telefono_bizum;
        } else {
            System.out.println("Los datos de tu Bizum no son correctos.");
            return false;
        }
        System.out.println("[chivato PIN] " + pin_generado_bizum);
        System.out.println("Introduce tu pin: ");
        int pin_bizum = read.nextInt();
        System.out.println("Validando Bizum...");
        if (pin_generado_bizum == pin_bizum){
            pin = pin_bizum;
            return true;
        } else {
            System.out.println("Los datos de tu Bizum no son correctos.");
        }
        return false;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Bizum{" +
                "telefono='" + telefono + '\'' +
                ", pin=" + pin +
                '}';
    }
}
