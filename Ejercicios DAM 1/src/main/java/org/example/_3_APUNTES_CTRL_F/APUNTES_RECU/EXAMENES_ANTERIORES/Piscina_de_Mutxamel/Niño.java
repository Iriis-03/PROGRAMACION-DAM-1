package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.EXAMENES_ANTERIORES.Piscina_de_Mutxamel;

public class Niño extends Bañista {
    private String telefonoPadre; // Atributo específico según el PDF

    public Niño(int numero, String nombre, int edad, TipoUsuario tipo, String telefonoPadre) {
        super(numero, nombre, edad, tipo);
        this.telefonoPadre = telefonoPadre;
    }
}