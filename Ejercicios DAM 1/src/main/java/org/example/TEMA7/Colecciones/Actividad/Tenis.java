package org.example.TEMA7.Colecciones.Actividad;

public class Tenis extends Pista {

    private TipoSuperficie superficie;

    public Tenis(TipoTechado tipo, int id, TipoSuperficie superficie) {
        super(tipo, id);
        this.superficie = superficie;
    }

    public TipoSuperficie getSuperficie() {
        return superficie;
    }

    public void setSuperficie(TipoSuperficie superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Tenis{" +
                "superficie=" + superficie +
                '}';
    }
}
