package org.example.PRUEBAS.PRUEBA_EXAMEN.PISCINA_MUTXAMEL;

public class EdadMayor16Exception extends RuntimeException {
    public EdadMayor16Exception() {
        super("ERROR al crear un NIÑO. Edad superior a 16 no permitida");
    }
}
