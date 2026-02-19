package org.example.TEMA6POO.excepciones.CajeroAutomatico;

import java.util.Scanner;

public class CuentaBancaria {

    Scanner read = new Scanner(System.in);

    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void ingresarDinero(double importe_a_ingresar){

        if (importe_a_ingresar < 0){
            throw new ImportePositivoException();
        }

        if (importe_a_ingresar > 3000){
            throw new DepositoMaximoException();
        }
    }

    public void retirarDinero(double importe_a_retirar){

        if (importe_a_retirar < 0){
            throw new ImportePositivoException();
        }

        if (importe_a_retirar > saldo){
            throw new SaldoInsuficienteException();
        }

        if (importe_a_retirar > 600){
            throw new LimiteDiarioException();
        }
    }

    public double consultarSaldo(){
        return getSaldo();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                '}';
    }
}
