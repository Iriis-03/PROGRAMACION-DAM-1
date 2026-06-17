package org.example._4_EJERCICIOS.insti;

import lombok.*;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor

public class Estudiante {

    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;


    public Estudiante(@NonNull String nombre) {
        this.nombre = nombre;
    }


}
