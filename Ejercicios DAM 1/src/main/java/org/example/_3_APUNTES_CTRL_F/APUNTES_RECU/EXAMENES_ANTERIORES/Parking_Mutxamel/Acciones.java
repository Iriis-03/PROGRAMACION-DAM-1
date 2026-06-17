package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.EXAMENES_ANTERIORES.Parking_Mutxamel;

/**
 * INTERFAZ: Representa un conjunto de capacidades que cualquier clase puede adquirir.
 * En este examen, tanto Clientes como el personal del Parking deben poder "pagar".
 * La interfaz no define CÓMO se paga, solo obliga a que el método exista.
 */
public interface Acciones {
    // Método abstracto: no tiene cuerpo {}.
    // Las clases que implementen esta interfaz deberán darle la lógica.
    void pagar();
}
