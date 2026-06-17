package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.COMPARABLE_COMPARATOR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ApuntesAppComparable {
    public static void main(String[] args) {
        ArrayList<ApuntesComparable> lista = new ArrayList<>();
        lista.add(new ApuntesComparable(3, "Zoe"));
        lista.add(new ApuntesComparable(1, "Ana"));

        // 1. USA COMPARABLE (Orden por ID)
        Collections.sort(lista);
        System.out.println("Por ID: " + lista);

        // 2. USA COMPARATOR (Clase Anónima para ordenar por nombre)
        Collections.sort(lista, new Comparator<ApuntesComparable>() {
            @Override
            public int compare(ApuntesComparable o1, ApuntesComparable o2) {
                // Usamos el compareTo de los Strings
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        System.out.println("Por Nombre: " + lista);
    }

    /*
     * ==========================================================
     * CRITERIOS DE ORDENACIÓN: COMPARABLE vs COMPARATOR
     * ==========================================================
     * * 1. COMPARABLE (Orden "Natural")
     * ----------------------------------------------------------
     * - Concepto: La clase "sabe" compararse a sí misma.
     * - Ubicación: Se implementa (interfaz) EN la propia clase (Clase Producto implements Comparable).
     * - Método: public int compareTo(Objeto o)
     * - Uso: Se define el criterio por defecto (ej: por ID o por Nombre).
     * - Inconveniente: Solo puedes tener UN criterio natural. Si quieres
     * cambiarlo, tienes que modificar el código de la clase.
     *
     * 2. COMPARATOR (Orden "Ad-hoc" o Externo)
     * ----------------------------------------------------------
     * - Concepto: Una "regla externa" que dicta cómo comparar dos objetos.
     * - Ubicación: Clase aparte o Clase Anónima en el momento de ordenar.
     * - Método: public int compare(Objeto o1, Objeto o2)
     * - Uso: Permite crear múltiples criterios (por precio, por fecha, por stock)
     * sin tocar la clase original.
     * - Flexibilidad: Ideal para clases que no puedes modificar (de librerías externas).
     *
     * 3. LA LÓGICA DEL RETORNO (El contrato del 'int')
     * ----------------------------------------------------------
     * Los métodos deben devolver un número entero:
     * - Negativo (< 0): El primero es MENOR que el segundo.
     * - Cero (0): Son IGUALES.
     * - Positivo (> 0): El primero es MAYOR que el segundo.
     *
     * TRUCO RÁPIDO PARA NÚMEROS:
     * - Ascendente:  (objeto1 - objeto2)
     * - Descendente: (objeto2 - objeto1)
     *
     * PARA STRINGS:
     * - s1.compareTo(s2) -> Usa el orden alfabético de la clase String.
     * ==========================================================
     */
}
