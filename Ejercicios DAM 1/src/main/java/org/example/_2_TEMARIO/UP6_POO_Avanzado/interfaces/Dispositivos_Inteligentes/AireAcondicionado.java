package org.example._2_TEMARIO.UP6_POO_Avanzado.interfaces.Dispositivos_Inteligentes;

public class AireAcondicionado extends Dispositivo implements ControlRemoto{

    public AireAcondicionado(String nombre, boolean estado) {
        super(nombre, estado);
    }

    public AireAcondicionado(String nombre) {
        super(nombre);
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando aire acondicionado con control remoto...");
    }

    @Override
    public void encender() {
        if (super.estado){
            System.out.println("El aire acondicionado ya está encendido.");
        } else {
            System.out.println("Encendiendo aire acondicionado...");
        }

    }
}
