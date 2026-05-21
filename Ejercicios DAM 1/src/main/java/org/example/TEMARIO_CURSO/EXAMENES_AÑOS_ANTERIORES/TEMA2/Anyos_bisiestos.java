    package org.example.TEMARIO_CURSO.EXAMENES_AÑOS_ANTERIORES.TEMA2;

    import java.util.Scanner;

    public class Anyos_bisiestos {

        static void main() {

            Scanner read = new Scanner(System.in);

            int anyo;
            final int anyo_actual = 2025;

            System.out.println("Elige un año:");
            anyo = read.nextInt();

            int contador_anyos_bisiestos = 0;

        for (int i = anyo; i <= anyo_actual; i++){
            if (i % 4 == 0) {
                if (i % 100 == 0) {
                    if (i % 400 == 0) {
                        contador_anyos_bisiestos++;
                    }
                }
                else
                    contador_anyos_bisiestos++;
            }
        }
        System.out.println("Ha habido " + contador_anyos_bisiestos + " años bisiestos.");
    }
}