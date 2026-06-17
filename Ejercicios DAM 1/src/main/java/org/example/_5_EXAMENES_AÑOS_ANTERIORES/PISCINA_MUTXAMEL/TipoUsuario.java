package org.example._5_EXAMENES_AÑOS_ANTERIORES.PISCINA_MUTXAMEL;

public enum TipoUsuario {
    ADULTO(30), NINYO(15), INVITADO(3.5);

    private double precio;

    TipoUsuario(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}
