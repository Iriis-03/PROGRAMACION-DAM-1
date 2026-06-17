package org.example._2_TEMARIO.UP6_POO_Avanzado.interfaces.Dispositivos_Inteligentes;

public class ParlanteInteligente extends Dispositivo{

    public ParlanteInteligente(String nombre, boolean estado) {
        super(nombre, estado);
    }

    public ParlanteInteligente(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        if (super.estado){
            System.out.println("El parlante ya está encendido.");
        } else {
            System.out.println("Activando parlante con comando de voz...");
        }


    }
}
