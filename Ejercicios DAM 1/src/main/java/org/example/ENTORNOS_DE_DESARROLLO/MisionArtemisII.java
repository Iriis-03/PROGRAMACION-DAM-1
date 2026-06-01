package org.example.ENTORNOS_DE_DESARROLLO;

/**
 * @file MisionArtemisII.java
 * @brief Clase que representa la misión espacial Artemis II.
 *
 * @details Clase en la que se inicia la misión,
 * se actualiza la altitud y se consulta su estado.
 *
 * @author Iri
 * @version 1.0
 * @since 01/06/2026
 */
public class MisionArtemisII {

    /**
     * @brief Estado actual de la misión.
     */
    private String estado;

    /**
     * @brief Altitud actual de la misión en kilómetros.
     */
    private double altitud;

    /**
     * @param estadoInicial  Estado inicial de la misión.
     * @param altitudInicial Altitud inicial de la misión.
     * @brief Constructor para crear una misión con estado y altitud inicial.
     */
    public MisionArtemisII(String estadoInicial, double altitudInicial) {
        this.estado = estadoInicial;
        this.altitud = altitudInicial;
    }

    /**
     * @brief Inicia la misión cambiando el estado a "En curso".
     */
    public void iniciarMision() {
        this.estado = "En curso";
    }

    /**
     * @param nuevaAltitud Nueva altitud de la misión.
     * @throws IllegalArgumentException Si la altitud es negativa lanzaría esta excepción.
     * @brief Actualiza la altitud de la misión.
     */
    public void actualizarAltitud(double nuevaAltitud) {
        if (nuevaAltitud < 0) {
            throw new IllegalArgumentException("La altitud no puede ser negativa");
        }
        this.altitud = nuevaAltitud;
    }

    /**
     * @return Estado actual de la misión.
     * @brief Devuelve el estado actual de la misión.
     */
    public String consultarEstado() {
        return this.estado;
    }

    /**
     * @return Altitud actual de la misión.
     * @brief Devuelve la altitud actual de la misión.
     */
    public double consultarAltitud() {
        return this.altitud;
    }

}