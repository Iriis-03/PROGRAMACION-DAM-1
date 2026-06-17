package org.example._2_TEMARIO.UP6_POO_Avanzado.interfaces.Dispositivos_Inteligentes;

public class Televisor extends Dispositivo implements ControlRemoto{

    public Televisor(String nombre, boolean estado) {
        super(nombre, estado);
    }

    public Televisor(String nombre) {
        super(nombre);
    }

    @Override
    public void encender(){
        if (super.estado){
            System.out.println("El televisor ya está encedido.");
        } else{
            System.out.println("Encendiendo televisor...");
            super.estado = true;
        }

    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando televisor con control remoto...");
    }
}
