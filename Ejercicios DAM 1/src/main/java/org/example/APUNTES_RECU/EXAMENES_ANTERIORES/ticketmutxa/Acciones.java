package org.example.APUNTES_RECU.EXAMENES_ANTERIORES.ticketmutxa;

import java.util.Set;

/**
 * INTERFAZ: Define un "contrato" de comportamiento.
 * Todas las clases que implementen esta interfaz ESTÁN OBLIGADAS
 * a tener estos métodos.
 */
public interface Acciones {
    // Método para gestionar el proceso de pago
    void pagar();

    // Método para verificar si un usuario existe en el sistema
    // Recibe un Set (conjunto) para evitar duplicados en la búsqueda
    boolean autenticarse(Set<Usuario> usuariosRegistrados);
}
