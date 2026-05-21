package org.example.TEMARIO_CURSO.TEMA6POO.excepciones.CajeroAutomatico;

public class ImportePositivoException extends RuntimeException {
    public ImportePositivoException() {
        super("Introduce una cantidad superior a 0€");
    }
}
