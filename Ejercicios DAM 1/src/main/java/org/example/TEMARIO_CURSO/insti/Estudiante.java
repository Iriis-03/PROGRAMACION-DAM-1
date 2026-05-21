package org.example.TEMARIO_CURSO.insti;

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
