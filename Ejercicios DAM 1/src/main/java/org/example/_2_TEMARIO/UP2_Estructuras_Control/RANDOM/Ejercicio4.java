    package org.example._2_TEMARIO.UP2_Estructuras_Control.RANDOM;

    import java.util.Random;

    public class Ejercicio4 {

        static void main() {

            Random aleatorio = new Random();

            String caracteres_Mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String caracteres_Minusculas = "abcdefghijklmnopqrstuvwxyz";
            String numeros = "0123456789";

            String contrasenya = "";
            int longitud = aleatorio.nextInt(8, 13);

            for (int i = 0; i <= longitud; i++) {
                if (contrasenya.length() == longitud) {
                    break;
                }
                contrasenya += caracteres_Mayusculas.charAt(aleatorio.nextInt(caracteres_Mayusculas.length() - 1));
                contrasenya += caracteres_Minusculas.charAt(aleatorio.nextInt(caracteres_Minusculas.length() - 1));
                contrasenya += numeros.charAt(aleatorio.nextInt(numeros.length() - 1));
                System.out.println(contrasenya);
                break;
            }
        }
    }