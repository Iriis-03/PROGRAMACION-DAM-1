package org.example.TEMA7.Colecciones.mapas;

import java.util.HashMap;
import java.util.Map;

public class Pruebas_mapas {

    static void main(String[] args) {

        HashMap<String, String> concejales = new HashMap<>(); //key, value

        concejales.put("Enrique Pastor", "Juventud y tiempo libre");
        concejales.put("Mónica Gil", "Familia, fiestas y jardines");

        System.out.println(concejales.keySet()); //nombres
        System.out.println(concejales.values()); //cargos
        System.out.println(concejales.get("Enrique Pastor")); //cargo de Enrique Pastor

        for (Map.Entry<String, String> mapa : concejales.entrySet()){

            System.out.println("El concejal " + mapa.getKey() + " tiene el cargo " + mapa.getValue());
        }



    }
}
