package org.example.TEMA7.Colecciones.Actividad;

public abstract class Pista {

    private TipoTechado tipo;
    private int id;

    public Pista(TipoTechado tipo, int id) {
        this.tipo = tipo;
        this.id = id;
    }

    public TipoTechado getTipo() {
        return tipo;
    }

    public void setTipo(TipoTechado tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pista{" +
                "tipo=" + tipo +
                ", id=" + id +
                '}';
    }
}
