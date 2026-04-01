package org.example.APUNTES_RECU.INTERFACES_CLASES_ANONIMAS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ApuntesClasesAnonimas {

    static void main(String[] args) {

        // ==========================================================
        // 1. USO TRADICIONAL (Con una clase física .java)
        // ==========================================================
        ApuntesInterfaz juego1 = new ApuntesClaseImplementa("Minecraft");
        juego1.jugar();

        // ==========================================================
        // 2. CLASE ANÓNIMA (Objeto "usar y tirar")
        // ==========================================================
        // ÚTIL CUANDO: Solo necesitas el objeto una vez y no quieres
        // crear un archivo nuevo en el proyecto.
        ApuntesInterfaz juegoRapido = new ApuntesInterfaz() {
            @Override
            public void jugar() {
                System.out.println("Jugando rápido: No tengo archivo propio .java");
            }

            @Override
            public void pausar() {
                System.out.println("Pausa instantánea.");
            }
        }; // IMPORTANTE: El punto y coma final es obligatorio.

        juegoRapido.jugar();

        // ==========================================================
        // 3. CASO REAL DE EXAMEN: ORDENACIÓN (Comparator)
        // ==========================================================
        // Imagina que quieres ordenar una lista de una forma rara
        // solo para este momento concreto.
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Zoe");
        nombres.add("Ana");
        nombres.add("Pedro");

        // Usamos una clase anónima para definir CÓMO comparar
        Collections.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // Ordenamos por longitud de la palabra, no por letra
                return o1.length() - o2.length();
            }
        });

        // ==========================================================
        // RESUMEN TEÓRICO: ¿CUÁNDO USARLAS?
        // ==========================================================
        /*
         * - EVENTOS: Para botones en interfaces (OnClick).
         * - FILTROS/ORDEN: Para comparadores personalizados (como el de arriba).
         * - HILOS: Para ejecutar una tarea en segundo plano rápido.
         * - SIMPLICIDAD: Evita llenar el paquete 'org.example' de mil archivos
         * que solo tienen 3 líneas de código.
         */

        System.out.println("Lista ordenada por longitud: " + nombres);
    }

    /*
     * ==========================================================
     * INTERFACES Y CLASES ANÓNIMAS
     * ==========================================================
     * 1. INTERFAZ (El Contrato):
     * - Es una colección de métodos abstractos (sin cuerpo).
     * - Define un COMPORTAMIENTO que cualquier clase puede adoptar.
     * - No se puede instanciar (no puedes hacer 'new Interfaz();').
     *
     * 2. CLASE ANÓNIMA (Implementación "Express"):
     * - Es una clase sin nombre que se crea y se instancia al mismo tiempo.
     * - Se usa para implementar una interfaz de forma rápida y única.
     * - Muy común en: Manejadores de eventos (botones), hilos (Threads)
     * o comparadores (Comparator).
     *
     * 3. VENTAJAS:
     * - Evita crear archivos .java extra para implementaciones simples.
     * - Mantiene el código relacionado en un mismo lugar.
     *
     * 4. LIMITACIONES:
     * - No puedes reutilizar la clase anónima en otro lugar del código.
     * - Solo pueden implementar UNA interfaz o heredar de UNA clase.
     * ==========================================================
     */
}