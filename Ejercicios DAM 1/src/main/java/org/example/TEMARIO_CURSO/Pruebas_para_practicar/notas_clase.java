package org.example.TEMARIO_CURSO.Pruebas_para_practicar;

import java.util.Arrays;

public class notas_clase {

    static void main(String[] args) {

        //Has de fer un programa que:
        // Calcule la mitjana de totes les notes.
        // Compte quants aprovats hi ha (nota ≥ 5).
        // Compte quants suspesos hi ha.
        // Trobe la nota més alta i la més baixa.
        // Creï un nou array només amb les notes aprovades.
        // Mostre per pantalla:
        //La mitjana (amb decimals).
        //Nombre d’aprovats i suspesos.
        //Nota màxima i mínima.
        //El contingut de l’array d’aprovats.
        // Condicions (perquè això no siga un passeig):
        //No es permet usar Arrays.sort().
        //No es permet usar col·leccions (ArrayList, etc.).
        //Tot amb arrays i bucles com Déu (i Java) manen.
        //El programa ha de funcionar encara que l’array tinga qualsevol mida.

        int[] notas = {7, 4, 9, 6, 3, 8, 10, 5, 6, 2};

        System.out.println(media(notas));
        System.out.println(aprobados(notas));
        System.out.println(suspensos(notas));
        System.out.println(Arrays.toString(nota_alta_baja(notas)));
        System.out.println(Arrays.toString(notas_aprobadas(notas)));


    }

    public static double media(int[] notas){

        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    public static int aprobados(int[] notas){

        int aprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5){
                aprobados++;
            }
        }
        return aprobados;
    }

    public static int suspensos(int[] notas) {

        int suspensos = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5) {
                suspensos++;
            }
        }
        return suspensos;
    }

    public static int[] nota_alta_baja(int[] notas) {

        int nota_mas_alta = 0;
        int nota_mas_baja = 10;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > nota_mas_alta) {
                nota_mas_alta = notas[i];
            }
            if (notas[i] < nota_mas_baja){
                nota_mas_baja = notas[i];
            }
        }
        return new int[] {nota_mas_alta, nota_mas_baja};
    }

    public static int[] notas_aprobadas(int[] notas){

        int[] notas_aprobadas = new int[notas.length];
        int aprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5){
                notas_aprobadas[aprobados++] = notas[i];
            }
        }
        int[] notas_definitivas = new int[aprobados];
        for (int i = 0; i < aprobados; i++) {

                notas_definitivas[i] = notas_aprobadas[i];

        }
        return notas_definitivas;
    }

}
