package org.example.TEMA6.PRACTICA1;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase que representa el método de pago PayPal.
 *
 * Utiliza herencia, polimorfismo y abstracción al extender MetodoPago
 * e implementar su propia validación y procesamiento del pago.
 */
public class PayPal extends MetodoPago{

    private String cuenta;
    private double saldo;

    public PayPal(String cuenta) {
        this.cuenta = cuenta;
        saldo = 23;
    }

    public PayPal() {

    }

    /**
     * El usuario una vez introduce por pantalla que desea realizar el pago con Paypal
     * e introduce todos los datos correctamente, se utilizaria este método para finalizar con el pago
     * @param importe importe a pagar
     */
    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con Paypal");
    }

    /**
     * Valida el formato del correo electrónico y el saldo introducidos por el usuario
     * @return true si los datos estan introducidos correctamente, de lo contrario, devolverá un false
     */
    @Override
    public boolean validar(){
        Scanner read = new Scanner(System.in);

        System.out.println("Introduce tu cuenta vinculado con Paypal: ");
        String cuenta_paypal = read.nextLine();
        if (cuenta_paypal.matches("^[a-zA-Z0-9.]+@[a-zA-Z0-9.]+\\.com$")){
            cuenta = cuenta_paypal;
        } else {
            System.out.println("Los datos de tu Paypal no son correctos.");
            return false;
        }
        System.out.println("Introduce tu saldo: ");
        double saldo_paypal = read.nextDouble();
        System.out.println("Validando Paypal...");
        if (saldo_paypal > 0){
            saldo = saldo_paypal;
            return true;
        } else {
            System.out.println("Los datos de tu Paypal no son correctos.");
        }
        return false;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "PayPal{" +
                "cuenta='" + cuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

