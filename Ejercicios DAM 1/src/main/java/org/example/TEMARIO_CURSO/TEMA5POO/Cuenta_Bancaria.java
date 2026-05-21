package org.example.TEMARIO_CURSO.TEMA5POO;

public class Cuenta_Bancaria {

    private String titular;
    private double saldo;

    public Cuenta_Bancaria(String titular, double saldo){

        this.titular = titular;
        this.saldo = saldo;

    }

    public boolean Ingresar(double ingreso){

        if (ingreso > 0){
            saldo = saldo + ingreso;
            return true;
        } else {
            return false;
        }
    }

    public boolean Retirar(double retirada){

        if (retirada > 0 && retirada < saldo){
            saldo = saldo - retirada;
            return true;
        } else {
            return false;
        }

    }

    public void MostrarInformacion(){
        System.out.println(titular + saldo);
    }
}
