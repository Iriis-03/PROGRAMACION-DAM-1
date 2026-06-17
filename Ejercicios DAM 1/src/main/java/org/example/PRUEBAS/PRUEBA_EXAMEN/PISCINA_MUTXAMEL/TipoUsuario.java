package org.example.PRUEBAS.PRUEBA_EXAMEN.PISCINA_MUTXAMEL;

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
