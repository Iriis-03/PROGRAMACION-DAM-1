package org.example.TEMARIO_CURSO.TEMA3.ARRAYS;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class array_teoria {

    static void main() {

        Random aleatorio = new Random();
        Scanner read = new Scanner(System.in);

        int[] vector = {6, 8, 7, 3, 2};
        System.out.println(Arrays.toString(vector)); //Pasar el vector de int a String
        System.out.println("La longitud del vector es: " + vector.length);
        System.out.println("El segundo vector es: " + vector [1]);
        vector [1] = 10; //Se reemplaza el vector 8, que está en la primera posición, por 10
        System.out.println(vector [1]);
        System.out.println("El segundo vector ha cambiado a: " + vector [1]);

        String [] vector2 = new String [5]; //Cuántos elementos va a guardar
        System.out.println(Arrays.toString(vector2)); //Da null
        System.out.println(vector2); //Da la dirección de memoria (vector = vector2;)

        //Clonar un vector
        int [] vector4 = new int[5];
        vector4 = vector.clone();
        System.out.println(vector4);
        System.out.println(Arrays.toString(vector4));

        for (int i = 0; i < vector.length; i++){
            System.out.println(vector[i]);
        }

        //Imprime los vectores de la última posición a la primera
        for (int i = vector.length - 1; i >= 0; i--){
            System.out.println(vector[i]);
        }

        int [] vector_random = new int[2];

        for (int i = 0; i < vector_random.length; i++){
            vector_random[i] = aleatorio.nextInt(501);
        }
        Arrays.asList(vector).contains(6); //Comprobar si el vector contiene el número 6

        int numeros[] = {1,2,2,3,4,5,6,7};

        int numeros_limpio[] = Arrays.stream(numeros).distinct().toArray();

        System.out.println(Arrays.toString(numeros_limpio));
    }
}
