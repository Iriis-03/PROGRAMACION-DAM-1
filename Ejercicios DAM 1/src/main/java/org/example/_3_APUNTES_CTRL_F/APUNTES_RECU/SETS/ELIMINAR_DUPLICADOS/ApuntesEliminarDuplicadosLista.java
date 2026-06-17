package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.SETS.ELIMINAR_DUPLICADOS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ApuntesEliminarDuplicadosLista {

    /**
     * MÉTODO PARA LIMPIAR DUPLICADOS
     * Recibe una lista con repetidos y devuelve una nueva lista limpia.
     */
    public static List<String> eliminarDuplicados(List<String> listaOriginal) {
        // 1. "Magia": Metemos la lista en un HashSet.
        // El constructor del HashSet acepta una colección y filtra los repetidos automáticamente.
        Set<String> conjuntoSinRepetidos = new HashSet<>(listaOriginal);

        // 2. Convertimos el Set de vuelta a una Lista (porque el método devuelve List)
        return new ArrayList<>(conjuntoSinRepetidos);
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
