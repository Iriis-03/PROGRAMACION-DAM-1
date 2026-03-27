package org.example.TEMA7.Colecciones.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Prueba_streams {

    static void main(String[] args) {

        Stream<String> pruebaStream = Stream.of("Ibai", "IlloJuan", "Falete", "Kevin")
                .filter(persona -> persona.startsWith("I"))
                .filter(persona -> persona.contains("o"))
                .map(persona -> persona.toUpperCase());
                //.count() //el count es de tipo long
                //.anyMatch(persona -> persona.equals("IlloJuan"))  //el anyMatch es de tipo boolean

        //System.out.println(pruebaStream);

         List<String> lista = pruebaStream.toList();
         System.out.println(lista);
         List<String> lista2 = Arrays.asList("Jijona", "Yema", "Piedra", "Duro");

        System.out.println(lista2.stream().filter(turron -> turron.contains("o")).toList());

    }
}
