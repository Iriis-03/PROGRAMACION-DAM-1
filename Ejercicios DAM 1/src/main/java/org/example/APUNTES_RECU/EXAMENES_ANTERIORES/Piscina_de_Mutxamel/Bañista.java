package org.example.APUNTES_RECU.EXAMENES_ANTERIORES.Piscina_de_Mutxamel;

/**
 * CLASE ABSTRACTA: Es la base de la jerarquía.
 * Se define como abstracta porque no queremos crear objetos "Bañista" genéricos,
 * sino que siempre sean Adultos, Niños o Invitados.
 */
public abstract class Bañista {
    // Protected permite que las clases hijas accedan a estos atributos sin usar getters
    protected int numero;
    protected String nombre;
    protected int edad;
    protected TipoUsuario tipo;

    // Constructor que será llamado por las clases hijas mediante super()
    public Bañista(int numero, String nombre, int edad, TipoUsuario tipo) {
        this.numero = numero;
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    // Sobrescribimos toString para que al imprimir la lista salga el formato del PDF
    @Override
    public String toString() {
        return numero + " " + nombre + " " + edad + " " + tipo;
    }

    // Método necesario para que la lógica de borrado sepa qué tipo es cada bañista
    public TipoUsuario getTipo() {
        return tipo;
    }
}
