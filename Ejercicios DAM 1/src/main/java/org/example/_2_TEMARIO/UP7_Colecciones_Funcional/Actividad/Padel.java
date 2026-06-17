package org.example._2_TEMARIO.UP7_Colecciones_Funcional.Actividad;

public class Padel extends Pista {

    private TipoParedes paredes;

    public Padel(TipoTechado tipo, int id, TipoParedes paredes) {
        super(tipo, id);
        this.paredes = paredes;
    }

    public TipoParedes getParedes() {
        return paredes;
    }

    public void setParedes(TipoParedes paredes) {
        this.paredes = paredes;
    }

    @Override
    public String toString() {
        return "Tenis{" +
                "paredes=" + paredes +
                '}';
    }
}