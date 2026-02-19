package org.example.TEMA6POO.excepciones.CajeroAutomatico;

public class ImportePositivoException extends RuntimeException {
    public ImportePositivoException() {
        super("Introduce una cantidad superior a 0€");
    }
}
