package org.example.APUNTES_RECU_CLAVE_CTRL_F;

public class ResumenClave {
// ============================================================
// RESUMEN RÁPIDO – COLECCIONES SEGÚN LOS ENUNCIADOS
// ============================================================
// “no se pueden repetir los datos” → usar Set
// “mantener el orden de inserción” → LinkedHashSet
// “ordenados por fecha/minutos/clave” → Collections.sort + Comparator
// “cola de acceso / turno / posición” → Queue (LinkedList)
// “lista de elementos consultables por índice” → ArrayList
// “mapa (clave → valor)” → HashMap / LinkedHashMap
// “solo lectura desde la app” → Collections.unmodifiableList / unmodifiableSet


// ============================================================
// RESUMEN RÁPIDO – VALIDACIONES Y ERRORES SEGÚN EL PROFE
// ============================================================
// “el elemento no existe” → devolver null (NO lanzar excepción)
// “tipo no permitido” → mostrar mensaje y no hacer nada
// “edad < 0” → lanzar RuntimeException (error de datos)
// “NIÑO con edad > 16” → lanzar excepción personalizada
// “opción incorrecta del menú” → insistir hasta que sea válida (do-while)
// “formato incorrecto (Squash)” → mostrar error y volver a pedir
// “máximo permitido (ej: 7 entradas)” → validar antes de añadir
// “no se puede eliminar por debajo de 0” → mensaje de error y repetir


// ============================================================
// RESUMEN RÁPIDO – equals() / hashCode()
// ============================================================
// SIEMPRE implementar usando únicamente el identificador único:
//   - matrícula (Parking)
//   - nombre_usuario (TicketMutxa)
//   - número (Piscina)
// Sin esto, contains(), remove() y los Set NO funcionan correctamente.


// ============================================================
// PALABRAS CLAVE DEL ENUNCIADO → SOLUCIÓN DIRECTA
// ============================================================
// “no se pueden repetir las matrículas” → Set para controlar unicidad
// “ordenados por minutos/fecha” → Comparator.comparing(...)
// “cola virtual / turno / espera” → Queue + poll() + Thread.sleep()
// “se añadirá el último” → añadir al final de la cola
// “bucle hasta escribir ‘salir’” → while(true) + break
// “insistirá hasta que se escriba opción válida” → do-while
// “autoincrementar número” → static int contador++
// “fecha actual del sistema” → LocalDate.now()
// “eliminar invitados del día” → removeIf(b instanceof Invitado)
// “validar matrícula/usuario” → buscar en lista → devolver null si no existe
// “dividir sets por ‘S’” (Squash) → reiniciar contadores al ver ‘S’
// “la cadena debe terminar en F” → validar último carácter


// ============================================================
// PATRONES DE MENÚ Y FLUJO QUE SIEMPRE APARECEN
// ============================================================
// Menú con opciones 1/2/3 → switch + default (error)
// Repetir login hasta correcto → while(!autenticado)
// Mostrar lista ordenada antes de elegir → sort + imprimir
// Controlar límites (0–7, etc.) → if fuera de rango → mensaje de error
// Simular procesos → imprimir mensajes + cambiar estado
// Añadir al carrito / modificar carrito → Map<Evento, Integer>


// ============================================================
// PATRONES DE GENERACIÓN ALEATORIA (EXÁCTAMENTE COMO PIDE EL PROFE)
// ============================================================
// Matrículas: números + letras sin vocales → usar cadenas dadas en el enunciado
// Usuarios: 8 caracteres aleatorios → usar String caracteres = "..."
// Tickets: estado inicial PENDIENTE → luego GENERADO → luego RECOGIDO/PAGADO


// ============================================================
// PATRONES DE ESTADOS (ENUMS) SEGÚN LOS EXÁMENES
// ============================================================
// Parking: PENDIENTE / GENERADO / RECOGIDO / PAGADO
// Piscina: ADULTO / NIÑO / INVITADO
// Métodos que cambian estado → solo mensajes + setEstado()


// ============================================================
// RESUMEN FINAL – SI EL ENUNCIADO DICE ESTO, HAZ ESTO
// ============================================================
// “no repetir” → Set
// “ordenar” → Comparator
// “cola” → Queue
// “mapa” → Map
// “solo lectura” → unmodifiable
// “validar” → buscar → null si no existe
// “excepción” → RuntimeException (solo en casos de datos inválidos)
// “simular” → mensajes + cambios de estado
// “máximo permitido” → if > max → error
// “bucle hasta correcto” → do-while

}
