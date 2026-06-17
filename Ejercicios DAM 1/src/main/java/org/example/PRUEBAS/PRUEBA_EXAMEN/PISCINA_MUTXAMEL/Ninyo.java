package org.example.PRUEBAS.PRUEBA_EXAMEN.PISCINA_MUTXAMEL;

public class Ninyo extends Banyista{

    private String telefono_contacto_adulto;

    public Ninyo(String telefono_contacto_adulto, Integer numero, String nombre, int edad, TipoUsuario tipo) {
        this.telefono_contacto_adulto = telefono_contacto_adulto;
        super(numero, nombre, edad, tipo);
    }


    @Override
    public void pagar() {
        System.out.println("Niño (abono de tipo NIÑO) pagando " + TipoUsuario.NINYO.getPrecio() + "€");
    }

    public String getTelefono_contacto_adulto() {
        return telefono_contacto_adulto;
    }

    public void setTelefono_contacto_adulto(String telefono_contacto_adulto) {
        this.telefono_contacto_adulto = telefono_contacto_adulto;
    }

    @Override
    public String toString() {
        return "Ninyo{" +
                "telefono_contacto_adulto='" + telefono_contacto_adulto;
    }
}
