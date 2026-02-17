package org.example.TEMA6POO.interfaces.Dispositivos_Inteligentes;

import java.util.ArrayList;

public class DispositivosApp {

    static void main(String[] args) {

        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();

        Televisor samsung = new Televisor("Samsung");
        ParlanteInteligente alexa = new ParlanteInteligente("Alexa");

        samsung.apagar();
        alexa.encender();
        samsung.encender();
        alexa.apagar();

        for (Dispositivo dispositivo : listaDispositivos){
            dispositivo.encender();
            if (dispositivo instanceof Televisor){
                ((Televisor) dispositivo).sincronizar();
            }

            dispositivo.mostrarEstado();
            dispositivo.apagar();
            dispositivo.apagar();
        }

        Dispositivo proyector = new Dispositivo("Optoma") {
            @Override
            public void encender() {
                if (estado){
                    System.out.println("El proyector ya está encendido");
                } else {
                    System.out.println("Encendiendo proyector con ajuste automático de brillo.");
                    estado = true;
                }

            }
        };

        proyector.encender();
        proyector.encender();

        ControlRemoto proyector_sinc = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto.");
            }
        };

        proyector_sinc.sincronizar();

        Dispositivo horno_ia = new Dispositivo("Horno LG") {
            @Override
            public void encender() {
                if (estado){
                    System.out.println("El horno ya está encendido");
                } else {
                    System.out.println("Calentando horno con ajuste automático de temperatura...");
                    estado = true;
                }
            }
        };

        horno_ia.encender();
        horno_ia.encender();

        listaDispositivos.add(proyector);
        listaDispositivos.add(horno_ia);

        for (Dispositivo dispositivo : listaDispositivos){
            dispositivo.encender();
            if (dispositivo instanceof ControlRemoto){
                ((Televisor) dispositivo).sincronizar();
            } else if (dispositivo.nombre.equals("Optoma")) {
                proyector_sinc.sincronizar();
            }

            dispositivo.mostrarEstado();
            dispositivo.apagar();
        }
    }
}
