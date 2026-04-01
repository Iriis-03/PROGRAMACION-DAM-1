package org.example.APUNTES_RECU.EXCEPTIONS;

public class ApuntesLanzarExcepcion {

    // Al ser RuntimeException, ya no estamos obligados a poner 'throws' aquí
    public static void procesarDato(int valor) {
        if (valor == 0) {
            // Lanzamos nuestra excepción con el mensaje fijo "ERROR_SISTEMA..."
            throw new ApuntesExcepcionPersonalizada();
        }
        System.out.println("Dato procesado: " + valor);
    }

    public static void main(String[] args) {
        // Aunque no es obligatorio, solemos usar try-catch para que
        // el programa no se detenga bruscamente.
        try {
            System.out.println("Iniciando proceso...");
            procesarDato(0); // Esto disparará el error

        } catch (ApuntesExcepcionPersonalizada e) {
            // Imprime: "ERROR_SISTEMA: Violación de integridad..."
            System.err.println("CUIDADO: " + e.getMessage());

        } finally {
            System.out.println("Limpieza de memoria finalizada.");
        }
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