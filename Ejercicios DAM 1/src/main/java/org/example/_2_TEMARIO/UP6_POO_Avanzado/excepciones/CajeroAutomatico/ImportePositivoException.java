package org.example._2_TEMARIO.UP6_POO_Avanzado.excepciones.CajeroAutomatico;

public class ImportePositivoException extends RuntimeException {
    public ImportePositivoException() {
        super("Introduce una cantidad superior a 0€");
    }
}
