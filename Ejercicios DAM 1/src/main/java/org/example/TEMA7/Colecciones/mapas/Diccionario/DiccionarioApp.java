package org.example.TEMA7.Colecciones.mapas.Diccionario;

import java.util.Scanner;

public class DiccionarioApp {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        Diccionario Diccionario_esp_eng = new Diccionario();

        int preguntas = 0;
        int aciertos = 0;

        Diccionario_esp_eng.nuevoPar("Perro", "dog");
        Diccionario_esp_eng.nuevoPar("Gato", "cat");
        Diccionario_esp_eng.nuevoPar("Pájaro", "bird");
        Diccionario_esp_eng.nuevoPar("Caballo", "horse");
        Diccionario_esp_eng.nuevoPar("León", "lion");
        Diccionario_esp_eng.nuevoPar("Elefante", "elephant");
        Diccionario_esp_eng.nuevoPar("Pez", "fish");
        Diccionario_esp_eng.nuevoPar("Vaca", "cow");
        Diccionario_esp_eng.nuevoPar("Oveja", "sheep");
        Diccionario_esp_eng.nuevoPar("Ratón", "mouse");
        Diccionario_esp_eng.nuevoPar("Mesa", "table");
        Diccionario_esp_eng.nuevoPar("Silla", "chair");
        Diccionario_esp_eng.nuevoPar("Cama", "bed");
        Diccionario_esp_eng.nuevoPar("Puerta", "door");
        Diccionario_esp_eng.nuevoPar("Ventana", "window");
        Diccionario_esp_eng.nuevoPar("Cocina", "kitchen");
        Diccionario_esp_eng.nuevoPar("Baño", "bathroom");
        Diccionario_esp_eng.nuevoPar("Sofá", "sofa");
        Diccionario_esp_eng.nuevoPar("Lámpara", "lamp");
        Diccionario_esp_eng.nuevoPar("Espejo", "mirror");
        Diccionario_esp_eng.nuevoPar("Rojo", "red");
        Diccionario_esp_eng.nuevoPar("Azul", "blue");
        Diccionario_esp_eng.nuevoPar("Verde", "green");
        Diccionario_esp_eng.nuevoPar("Amarillo", "yellow");
        Diccionario_esp_eng.nuevoPar("Negro", "black");
        Diccionario_esp_eng.nuevoPar("Blanco", "white");
        Diccionario_esp_eng.nuevoPar("Naranja", "orange");
        Diccionario_esp_eng.nuevoPar("Rosa", "pink");
        Diccionario_esp_eng.nuevoPar("Gris", "gray");
        Diccionario_esp_eng.nuevoPar("Marrón", "brown");
        Diccionario_esp_eng.nuevoPar("Coche", "car");
        Diccionario_esp_eng.nuevoPar("Árbol", "tree");
        Diccionario_esp_eng.nuevoPar("Flor", "flower");
        Diccionario_esp_eng.nuevoPar("Sol", "sun");
        Diccionario_esp_eng.nuevoPar("Luna", "moon");
        Diccionario_esp_eng.nuevoPar("Calle", "street");
        Diccionario_esp_eng.nuevoPar("Ciudad", "city");
        Diccionario_esp_eng.nuevoPar("Puente", "bridge");
        Diccionario_esp_eng.nuevoPar("Río", "river");
        Diccionario_esp_eng.nuevoPar("Montaña", "mountain");
        Diccionario_esp_eng.nuevoPar("Comer", "eat");
        Diccionario_esp_eng.nuevoPar("Beber", "drink");
        Diccionario_esp_eng.nuevoPar("Correr", "run");
        Diccionario_esp_eng.nuevoPar("Dormir", "sleep");
        Diccionario_esp_eng.nuevoPar("Hablar", "speak");
        Diccionario_esp_eng.nuevoPar("Escribir", "write");
        Diccionario_esp_eng.nuevoPar("Leer", "read");
        Diccionario_esp_eng.nuevoPar("Caminar", "walk");
        Diccionario_esp_eng.nuevoPar("Saltar", "jump");
        Diccionario_esp_eng.nuevoPar("Cantar", "sing");
        Diccionario_esp_eng.nuevoPar("Libro", "book");
        Diccionario_esp_eng.nuevoPar("Lápiz", "pencil");
        Diccionario_esp_eng.nuevoPar("Bolígrafo", "pen");
        Diccionario_esp_eng.nuevoPar("Reloj", "watch");
        Diccionario_esp_eng.nuevoPar("Llave", "key");
        Diccionario_esp_eng.nuevoPar("Teléfono", "phone");
        Diccionario_esp_eng.nuevoPar("Ordenador", "computer");
        Diccionario_esp_eng.nuevoPar("Dinero", "money");
        Diccionario_esp_eng.nuevoPar("Bolsa", "bag");
        Diccionario_esp_eng.nuevoPar("Zapatos", "shoes");

        while (true) {
            String espanol = Diccionario_esp_eng.palabraAleatoria();
            char pista = Diccionario_esp_eng.primeraLetraTraduccion(espanol);

            System.out.println(espanol + ": " + Character.toLowerCase(pista) + "...");
            System.out.print("Indique la respuesta: ");
            String respuesta = read.nextLine().toLowerCase();

            if (respuesta.equals("fin")) {
                System.out.println();
                System.out.println("**************************");
                System.out.println("FIN DEL PROGRAMA");
                System.out.println("**************************");
                break;
            }

            preguntas++;
            String respuestaCorrecta = Diccionario_esp_eng.traduce(espanol);

            if (respuesta.equals(respuestaCorrecta)) {
                System.out.println("¡CORRECTO!");
                aciertos++;
            } else {
                System.out.println("¡NO! La respuesta correcta es " + respuestaCorrecta);
            }
        }

        if (preguntas > 0) {
            System.out.println("Total preguntas: " + preguntas);
            System.out.println("Total aciertos: " + aciertos);
            System.out.println("Total errores: " + (preguntas - aciertos));
            System.out.println("Aciertos: " + ((aciertos * 100) / preguntas) + "%");
        }

    }
}
