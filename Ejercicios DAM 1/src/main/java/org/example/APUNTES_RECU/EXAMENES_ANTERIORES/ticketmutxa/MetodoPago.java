package org.example.APUNTES_RECU.EXAMENES_ANTERIORES.ticketmutxa;

/**
 * ENUM: Define un conjunto fijo de constantes.
 * Se usa para limitar las opciones de pago y asociarles un valor (gastos).
 */
public enum MetodoPago {
    // Definimos las constantes con su valor de gestión entre paréntesis
    PAYPAL(0.5),
    BIZUM(1.0),
    APPLEPAY(1.5);

    private final double gastos;

    // Constructor del Enum: asigna el gasto a la constante seleccionada
    MetodoPago(double gastos) {
        this.gastos = gastos;
    }

    // Getter para obtener el coste adicional en el momento del pago
    public double getGastos() {
        return gastos;
    }
}