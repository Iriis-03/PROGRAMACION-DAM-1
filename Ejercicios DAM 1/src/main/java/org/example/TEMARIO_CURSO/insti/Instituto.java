package org.example.TEMARIO_CURSO.insti;

import lombok.*;

import java.util.ArrayList;
import java.util.Objects;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
//@Data
public class Instituto {

    @NonNull
    private String nombre;
    private String poblacion;
    @NonNull
    private ArrayList<Curso> listaCursos;
    @NonNull
    private ArrayList<Estudiante> listaEstudiantes;

    public Instituto(@NonNull String nombre) {
        this.nombre = nombre;
        listaCursos = new ArrayList<>();
        listaEstudiantes = new ArrayList<>();
    }

    public void setNombre(String nombre){
        this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre");
    }

    public void agregarCurso(Curso curso){

        if (!listaCursos.contains(curso)){
            listaCursos.add(curso);
        } else {
            System.out.println("No puedes añadir un curso existente");
        }
    }

    public void agregarEstudiante(Estudiante estudiante){

        if (!listaEstudiantes.contains(estudiante)){
            listaEstudiantes.add(estudiante);
        } else {
            System.out.println("No puedes añadir un estudiante existente");
        }
    }




}
