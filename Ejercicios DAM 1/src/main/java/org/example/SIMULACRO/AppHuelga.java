package org.example.SIMULACRO;

import org.example.TEMARIO_CURSO.TEMA6POO.PRACTICA2.Jugador;

import java.util.*;

public class AppHuelga {

    static Scanner read = new Scanner(System.in);

    public static LinkedHashSet<Docente> listaDocentes = new LinkedHashSet<>();

    static void main(String[] args) {

       CentroEducativo.generarHuelguistasAleatorios(10);
//        validacion();
//        calcularDescuentoSalarial();
        generarEstadisticas();
        listadoConselleria();



    }


    public static void verSeguimiento(){

        int num_docentes = listaDocentes.size();

        int contador_huelguistas = 0;
        int contador_trabajadores = 0;

        for (Docente docente : listaDocentes){

            if (docente.getEstado().equals(EstadoDocente.EN_HUELGA)){
                contador_huelguistas++;
            } else {
                contador_trabajadores++;
            }

        }

        if (contador_huelguistas == num_docentes ){
            System.out.println("HUELGA TOTAL");
        } else {
            System.out.println("HUELGA PARCIAL " + contador_trabajadores + " docentes trabajando");
        }

    }

    public static Docente validacion(){

        System.out.println("Introduce el DNI del docente: ");
        String dni = read.nextLine();

        Docente docente = CentroEducativo.validarDocente(dni);

        if (docente == null){
            System.out.println("El docente no existe como huelguista.");
            return new Docente(dni, 0, EstadoDocente.ACTIVO);
        } else {
            System.out.println("Docente en huelga validado correctamente.");
        }

        return docente;

    }

    public static void insertarHuelguista(){

        Docente docente = validacion();

        if (listaDocentes.contains(docente)){
            throw new DocenteEnHuelga();
        } else {
            secundar(docente);
        }

    }

    public static void secundar(Docente docente){
        docente.setDiasHuelga(1);
        docente.setEstado(EstadoDocente.EN_HUELGA);

        listaDocentes.add(docente);
    }

    public static void calcularDescuentoSalarial(){
        Docente docente = validacion();
        double descuentoSalarialDia = 95.5;

        if (listaDocentes.contains(docente)){
            System.out.println("Días: " + docente.getDiasHuelga() + " - Descuento por día: " + descuentoSalarialDia + "€");
            System.out.println("Importe a retener: " + (docente.getDiasHuelga() * descuentoSalarialDia));
        }

    }

    public static void abandonarHuelga(){

        System.out.println("Introduce el DNI del docente: ");
        String dni = read.nextLine();

        for (Docente docente1 : listaDocentes){

            if (docente1.getDni().equals(dni)){
                finalizar(docente1);
            } else {
                System.out.println("No se ha podido finalizar la huelga. El docente no existe en la lista de huelguistas");
            }

        }



    }

    public static void finalizar(Docente docente){

        docente.setEstado(EstadoDocente.ACTIVO);
        System.out.println("El docente ha finalizado la huelga.");
    }

    public static void listadoConselleria(){

        List<Docente> lista = new ArrayList<>(listaDocentes);

        lista.sort(new Comparator<Docente>() {
            @Override
            public int compare(Docente a, Docente b) {
                return b.getDiasHuelga().compareTo(a.getDiasHuelga());
            }
        });

        for (Docente docente : lista) {
            System.out.println(docente);
        }

    }

    public static void generarEstadisticas(){

        int[][] estados = new int[2][3];


        for (Docente docente : listaDocentes){
            if (docente.getEstado() == EstadoDocente.ACTIVO){
                estados[0][0]++;
            } else if (docente.getEstado() == EstadoDocente.EN_HUELGA){
                estados[0][1]++;
            } else {
                estados[0][2]++;
            }
        }

        int total = estados[0][0] + estados[0][1] + estados[0][2];

        estados[1][0] = estados[0][0] / total * 100;
        estados[1][1] = estados[0][1] / total * 100;
        estados[1][2] = estados[0][2] / total * 100;

        System.out.println();
        System.out.println("Índice          Col 0       Col 1          Col 2");
        System.out.println("                (ACTIVO)    (EN_HUELGA)    (SERVICIOS_MINIMOS)");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Fila 0          " + estados[0][0] + "            " + estados[0][1] + "            " + estados[0][2]);
        System.out.println("(Conteo)");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Fila 1          " + estados[1][0] + "            " + estados[1][1] + "           " + estados[1][2]);
        System.out.println("(Porcentaje)");

    }



}
