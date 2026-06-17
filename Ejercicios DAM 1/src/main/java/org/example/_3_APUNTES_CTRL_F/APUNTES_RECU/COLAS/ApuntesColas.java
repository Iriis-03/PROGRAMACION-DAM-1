package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.COLAS;

import java.util.LinkedList;
import java.util.Queue;

public class ApuntesColas {

    public static void main(String[] args) {

        // 1. CREACIÓN: Una cola de clientes
        Queue<String> cola = new LinkedList<>();

        // 2. OFFER / ADD (Añadir): Se ponen al final de la cola
        cola.offer("Cliente 1");
        cola.offer("Cliente 2");
        cola.offer("Cliente 3");

        // 3. PEEK (Mirar): Vemos quién es el primero en ser atendido
        System.out.println("El primero en la cola es: " + cola.peek());

        // 4. POLL (Sacar): Atendemos al primero y lo quitamos
        String atendido = cola.poll();
        System.out.println("Atendido y fuera: " + atendido);

        // 5. RECORRER: Salen en el orden en que llegaron
        System.out.println("Esperando en la cola:");
        for (String cliente : cola) {
            System.out.println("- " + cliente);
        }
    }

    /*
     * ==========================================================
     * COLAS (QUEUE) Y DOBLES COLAS (DEQUE)
     * ==========================================================
     * 1. FILOSOFÍA FIFO (Queue):
     * First In, First Out. El primero que entra es el primero que sale.
     * * 2. MÉTODOS DE COLA (Queue):
     * - offer(e): Añade al final (retorna false si falla).
     * - poll(): Retira y devuelve el primero (retorna null si está vacía).
     * - peek(): Mira el primero sin quitarlo.
     * * 3. DOBLE COLA (Deque):
     * - Es una "Cola de dos puntas". Permite métodos 'First' y 'Last'.
     * - addFirst() / addLast()
     * - removeFirst() / removeLast()
     * - peekFirst() / peekLast()
     * * 4. TRUCO DE EXAMEN:
     * - Una Deque puede funcionar como PILA (usando push/pop)
     * o como COLA (usando offer/poll). ¡Es la navaja suiza!
     * ==========================================================
     */
}
