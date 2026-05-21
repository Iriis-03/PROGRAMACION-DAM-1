    package org.example.TEMARIO_CURSO.EXAMENES_AÑOS_ANTERIORES.TEMA2;

    import java.util.Scanner;

    public class Piedra_Papel_Tijera {

        static void main() {

            Scanner read = new Scanner(System.in);



            //Piedra = 0
            //Papel = 1
            //Tijera = 2

            int marcador_ordenador = 0;
            int marcador_usuario = 0;

            do {

                for (int i = 0; i < 3; i++) {

                    System.out.println("---------------------");
                    System.out.println("[p]");
                    System.out.println("[a]");
                    System.out.println("[t]");
                    System.out.println("---------------------");

                    String menu = read.nextLine();

                    int jugada_ordenador = (int) (Math.random() * 2);

                    switch (menu) {

                        case "p":
                            System.out.println("Has elegido: Piedra");
                            if (jugada_ordenador == 1) {
                                marcador_usuario++;
                                System.out.println("¡Has ganado!");

                            }
                            if (jugada_ordenador == 2) {
                                marcador_ordenador++;
                                System.out.println("¡Has perdido!");
                            }
                            break;
                        case "a":
                            System.out.println("Has elegido: Papel");
                            if (jugada_ordenador == 0) {
                                marcador_usuario++;
                                System.out.println("¡Has ganado!");

                            }
                            if (jugada_ordenador == 2) {
                                marcador_ordenador++;
                                System.out.println("¡Has perdido!");
                            }
                            break;
                        case "t":
                            System.out.println("Has elegido: Tijera");
                            if (jugada_ordenador == 1) {
                                marcador_usuario++;
                                System.out.println("¡Has ganado!");

                            }
                            if (jugada_ordenador == 0) {
                                marcador_ordenador++;
                                System.out.println("¡Has perdido!");
                            }
                            break;
                    }
                    System.out.println("Marcador actual (PC-usuario): " + marcador_usuario + " - " + marcador_ordenador);
                }
                if (marcador_usuario > marcador_ordenador) {
                    System.out.println("¡GANA EL USUARIO!");
                }
                if (marcador_usuario < marcador_ordenador) {
                    System.out.println("¡GANA EL PC!");
                }

                if (marcador_ordenador == marcador_usuario){
                    System.out.println("Empate, se repite la ronda");
                }

            }while (marcador_ordenador == marcador_usuario);

            System.out.println("Marcador final (PC-usuario): " + marcador_usuario + " - " + marcador_ordenador);

        }
    }
