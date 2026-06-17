package org.example._5_EXAMENES_AÑOS_ANTERIORES.TEMA1; // Define el paquete donde se encuentra esta clase

import java.util.Scanner; // Importa la clase Scanner para poder leer datos desde el teclado

public class Delegado { // Declaración de la clase principal llamada Delegado

    static void main() {
        Scanner read = new Scanner(System.in); // Crea un objeto Scanner llamado 'read' para leer entradas del usuario

        int votosA = 0, votosB = 0, votosC = 0; // Inicializa los contadores de votos de cada candidato en 0
        int totalVotantes; // Variable para almacenar el número total de personas que van a votar

        System.out.print("Ingrese el número total de votantes: "); // Pide al usuario que ingrese el total de votantes
        totalVotantes = read.nextInt(); // Lee el número ingresado y lo guarda en totalVotantes

        System.out.println("Candidatos:"); // Muestra la lista de candidatos disponibles
        System.out.println("1. Ana"); // Candidato 1
        System.out.println("2. Bruno"); // Candidato 2
        System.out.println("3. Carla"); // Candidato 3

        // Bucle que se repite tantas veces como votantes hay
        for (int i = 1; i <= totalVotantes; i++) {
            System.out.print("Voto #" + i + " (1-3): "); // Indica el número del voto actual y pide la opción (1, 2 o 3)
            int voto = read.nextInt(); // Lee el voto ingresado por el usuario

            if (voto == 1) { // Si el usuario vota por Ana
                votosA++; // Incrementa el contador de Ana en 1
            } else if (voto == 2) { // Si el usuario vota por Bruno
                votosB++; // Incrementa el contador de Bruno en 1
            } else if (voto == 3) { // Si el usuario vota por Carla
                votosC++; // Incrementa el contador de Carla en 1
            } else { // Si el usuario ingresa un número diferente de 1, 2 o 3
                System.out.println("Voto inválido, no se contará."); // Muestra mensaje de error y no cuenta el voto
            }
        }

        // Mostrar los resultados de la votación
        System.out.println("Resultados");
        System.out.println("Ana: " + votosA + " votos"); // Muestra los votos de Ana
        System.out.println("Bruno: " + votosB + " votos"); // Muestra los votos de Bruno
        System.out.println("Carla: " + votosC + " votos"); // Muestra los votos de Carla

        // Determinar quién es el ganador
        if (votosA > votosB && votosA > votosC) { // Si Ana tiene más votos que los otros dos
            System.out.println("Ganadora: Ana"); // Muestra que Ana ganó
        } else if (votosB > votosA && votosB > votosC) { // Si Bruno tiene más votos que los otros dos
            System.out.println("Ganador: Bruno"); // Muestra que Bruno ganó
        } else if (votosC > votosA && votosC > votosB) { // Si Carla tiene más votos que los otros dos
            System.out.println("Ganadora: Carla"); // Muestra que Carla ganó
        } else { // Si hay empate entre dos o más candidatos
            System.out.println("Hay un empate. Hay que volver a votar."); // Mensaje de empate
        }
    }
}

