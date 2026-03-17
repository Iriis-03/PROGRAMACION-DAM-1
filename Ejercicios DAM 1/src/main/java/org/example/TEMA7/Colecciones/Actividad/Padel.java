package org.example.TEMA7.Colecciones.Actividad;

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