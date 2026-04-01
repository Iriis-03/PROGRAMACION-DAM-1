package org.example.APUNTES_RECU.SETS.ELIMINAR_DUPLICADOS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApuntesAppEliminarDuplicadosLista {

    static void main(String[] args) {
        // Datos de prueba con repetidos
        List<String> conRepetidos = new ArrayList<>(Arrays.asList("A", "B", "A", "C", "B", "D"));

        System.out.println("1. Lista original: " + conRepetidos);

        // Llamamos a nuestra utilidad
        List<String> listaLimpia = ApuntesEliminarDuplicadosLista.eliminarDuplicados(conRepetidos);

        System.out.println("2. Lista sin duplicados: " + listaLimpia);
    }

    /*
     * ==========================================================
     * TRUCO: LIMPIEZA DE DUPLICADOS (CONVERSIÓN LIST <-> SET)
     * ==========================================================
     * 1. ¿POR QUÉ FUNCIONA?:
     * Porque los 'Set' (especialmente HashSet) tienen una regla
     * interna inquebrantable: NO ADMITEN DUPLICADOS.
     * * 2. EL PROCESO:
     * - Al pasar la Lista al constructor del Set: 'new HashSet<>(lista)',
     * Java recorre la lista y solo añade los elementos que no ha visto antes.
     * - Al pasar el Set al constructor de la Lista: 'new ArrayList<>(set)',
     * recuperamos la flexibilidad de las listas pero ya sin los repetidos.
     * * 3. ¿QUÉ SET ELEGIR?:
     * - HashSet: Si no te importa el orden final (es el más rápido).
     * - TreeSet: Si quieres que la lista final esté ordenada de la A a la Z.
     * - LinkedHashSet: Si quieres conservar el orden en que aparecieron
     * los elementos por primera vez.
     * ==========================================================
     */
}
