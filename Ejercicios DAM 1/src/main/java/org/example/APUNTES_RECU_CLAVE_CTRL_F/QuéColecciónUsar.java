package org.example.APUNTES_RECU_CLAVE_CTRL_F;

public class QuéColecciónUsar {
// ============================================================
// RESUMEN RÁPIDO - QUÉ COLECCIÓN USAR SEGÚN EL ENUNCIADO
// ============================================================
// "no se pueden duplicar" + "orden inserción"  → LinkedHashSet
// "ordenado por [clave]" + "mapa"              → TreeMap
// "cola" + "turno" + "posición"                → Queue/LinkedList
// "lista" + "acceso por índice"                → ArrayList
// "no se puede modificar desde fuera"          → unmodifiableList
//
// RESUMEN RÁPIDO - CUÁNDO LANZAR EXCEPCIÓN
// ============================================================
// "intenta votar de nuevo"                     → FraudeException
// "edad > 16 y es NIÑO"                        → RuntimeException
// "tipo de evento no existe"                   → return (no excepción)
// "fraude / doble uso"                         → throw + try-catch + continue
//
// RESUMEN RÁPIDO - PATRÓN equals/hashCode
// ============================================================
// SIEMPRE solo con el campo identificador único (dni, nie, matricula)
// Sin esto, contains() y remove() en colecciones NO funcionan
//
// RESUMEN RÁPIDO - PALABRAS CLAVE DEL ENUNCIADO → SOLUCIÓN
// ============================================================
// "no se pueden repetir las matrículas"        → Set para controlar unicidad
// "ordenados por fecha/minutos/clave"          → Comparator + sort / TreeMap
// "sólo se puede leer, no modificar"           → Collections.unmodifiableList
// "se añadirá el último"                       → añadir al final de la cola
// "bucle que solo termina con 'salir'"         → while(true) + if equalsIgnoreCase("salir") break
// "insistirá hasta que se escriba opción válida" → do-while con condición de validez
// "excepción personalizada"                    → extends RuntimeException
// "Fila 1: conteo. Fila 2: porcentaje"         → double[2][4], calcular al final
// ============================================================
}
