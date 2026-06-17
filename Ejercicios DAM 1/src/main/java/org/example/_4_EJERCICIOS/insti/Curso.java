package org.example._4_EJERCICIOS.insti;

import lombok.*;

@Getter @Setter
@ToString
@NoArgsConstructor
public class Curso {

    @NonNull
    private String nombre;
    private int horas;

    public Curso(@NonNull String nombre) {
        this.nombre = nombre;
    }

    public Curso(@NonNull String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
    }
}

