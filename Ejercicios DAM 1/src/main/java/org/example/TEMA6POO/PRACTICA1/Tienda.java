package org.example.TEMA6POO.PRACTICA1;

import java.util.Scanner;

/**
 * Clase para gestionar tanto el método de pago, como validar datos y procesar el pago
 */
public class Tienda{

    /**
     * El método realizarPago pide al usuario que introduzca el importe
     */
    public static void realizarPago(MetodoPago metodo) {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce el importe a pagar:");
        int importe_pagar = read.nextInt();
        metodo.procesarPago(importe_pagar);
    }

    /**
     * Pregunta al usuario que método de pago va a utilizar
     * y dependiendo del método introducido, va a validar ciertos datos u otros.
     */
    public static void iniciarPago(){
        Scanner read = new Scanner(System.in);

        System.out.println("¿Qué método de pago quieres usar? [Bizum, Paypal, Tarjeta]");
        String metodo_pago = read.nextLine();

        switch (metodo_pago){
            case "Bizum":

                Bizum bizum = new Bizum();

                if (bizum.validar()){
                    realizarPago(bizum);
                }
                break;

            case "Paypal":

                PayPal payPal = new PayPal();
                if (payPal.validar()){
                    realizarPago(payPal);
                }
                break;

            case  "Tarjeta":

                TarjetaCredito tarjetaCredito = new TarjetaCredito();
                if (tarjetaCredito.validar()){
                    realizarPago(tarjetaCredito);
                }
                break;

            default:
                System.out.println("El método de pago no existe.");
        }
    }
}

