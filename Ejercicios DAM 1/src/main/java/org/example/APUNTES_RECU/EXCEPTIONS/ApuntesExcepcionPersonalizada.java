package org.example.APUNTES_RECU.EXCEPTIONS;

/**
 * EXCEPCIÓN PERSONALIZADA (UNCHECKED)
 * Heredar de RuntimeException permite lanzar el error sin
 * necesidad obligatoria de try-catch o throws.
 */
public class ApuntesExcepcionPersonalizada extends RuntimeException {

    // Constructor sin parámetros
    public ApuntesExcepcionPersonalizada() {
        // Mensaje fijo coherente con la jerarquía de objetos
        super("ERROR_SISTEMA: Violación de integridad en el Objeto Padre.");
    }

    /*
     * ==========================================================
     * EXCEPCIONES PERSONALIZADAS (Custom Exceptions)
     * ==========================================================
     * 1. DEFINICIÓN:
     * Son clases que creamos nosotros para representar errores
     * específicos de nuestra aplicación.
     *
     * 2. REGLA DE ORO (Herencia):
     * - Si heredas de 'Exception': Es una "Checked Exception".
     * Obligas a usar try-catch o 'throws' cada vez que se use.
     * - Si heredas de 'RuntimeException': Es una "Unchecked Exception".
     * No es obligatorio capturarla (es la más común hoy en día).
     *
     * 3. ESTRUCTURA:
     * Siempre deben tener, al menos, un constructor que reciba el
     * mensaje de error y se lo pase al padre con 'super(mensaje)'.
     *
     * 4. PALABRAS CLAVE:
     * - throw: Se usa PARA LANZAR la excepción (ej: throw new MiError();).
     * - throws: Se usa EN LA FIRMA del método para avisar que ese
     * método puede lanzar dicho error.
     * ==========================================================
     */
}