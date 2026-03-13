package org.example.TEMA7.Colecciones.mapas.Diccionario;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;

public class Diccionario {

    static HashMap<String, String> mapa_diccionario = new HashMap<>();
    static Random aleatorio = new Random();
    static ArrayList<String> clave;

    public Diccionario() {
        mapa_diccionario = new HashMap<>();
    }

    public void nuevoPar(String espanol, String ingles) {
        mapa_diccionario.put(espanol.toLowerCase(), ingles.toLowerCase());
    }

    public String traduce(String espanol) {
        return mapa_diccionario.get(espanol.toLowerCase());
    }

    public String palabraAleatoria() {
        clave = new ArrayList<>(mapa_diccionario.keySet());
        int indice = aleatorio.nextInt(clave.size());
        return clave.get(indice);
    }

    public char primeraLetraTraduccion(String espanol) {
        String traduccion = traduce(espanol);
        return traduccion.charAt(0);
    }
}