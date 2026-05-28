package org.example.SIMULACRO;

import java.util.*;

import static org.example.SIMULACRO.AppHuelga.listaDocentes;

public class CentroEducativo {

    private String nombre;
    private int plantillaTotal;
    private double descuentoSalarialDiario;
    private Collection<Docente> huelguistas;

    public CentroEducativo(String nombre, int plantillaTotal, double descuentoSalarialDiario, Collection<Docente> huelguistas) {
        this.nombre = nombre;
        this.plantillaTotal = plantillaTotal;
        this.descuentoSalarialDiario = descuentoSalarialDiario;
        this.huelguistas = huelguistas;
    }

    public CentroEducativo() {
    }


    public static void generarHuelguistasAleatorios(int cantidad){

        Random aleatorio = new Random();

        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";

        // generar 10 docentes
        while (listaDocentes.size() < 10) {

            // GENERAR DNI
            StringBuilder dni = new StringBuilder();

            // 8 números
            for (int i = 0; i < 8; i++) {
                dni.append(numeros.charAt(
                        aleatorio.nextInt(numeros.length())
                ));
            }

            // letra final
            dni.append(letras.charAt(
                    aleatorio.nextInt(letras.length())
            ));

            // días aleatorios entre 1 y 8
            int diasHuelga = aleatorio.nextInt(8) + 1;

            // crear docente
            Docente docente = new Docente(dni.toString(), diasHuelga, EstadoDocente.EN_HUELGA);

            // el Set evita repetidos
            listaDocentes.add(docente);
        }

        // mostrar resultado
        for (Docente docente : listaDocentes) {
            System.out.println(docente);
        }
    }



    public void mostrarHuelguistasActuales(){

        int contadorDocentes = 1;

        for (Docente docente : listaDocentes){
            System.out.println(contadorDocentes + ". DNI: " + docente.getDni() + " - días huelga: " + docente.getDiasHuelga() + " - estado: " + docente.getEstado());
            contadorDocentes++;
        }
    }

    public static Docente validarDocente(String dni){

        System.out.println("Validando...");

        for (Docente docente : listaDocentes){
            if (docente.getDni().equals(dni)){
                return docente;
            }
        }

        return null;
    }

    public Docente sortearServiciosMinimos(){

        Random aleatorio = new Random();
        int tamanyo = listaDocentes.size();
        int contador = 0;

        int premiado = aleatorio.nextInt(tamanyo);

        for (Docente docente : listaDocentes){

            if (contador == premiado){
                docente.asignarServiciosMinimos();
                return docente;
            }
            contador++;
        }
        return new Docente();
    }

    public void limpiarRegistro(){
        Iterator<Docente> iterator = listaDocentes.iterator();

        while (iterator.hasNext()) {
            Docente docente = iterator.next();
            if (docente.getEstado().equals(EstadoDocente.ACTIVO)) {
                iterator.remove(); // forma segura de eliminar durante iteración
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPlantillaTotal() {
        return plantillaTotal;
    }

    public void setPlantillaTotal(int plantillaTotal) {
        this.plantillaTotal = plantillaTotal;
    }

    public double getDescuentoSalarialDiario() {
        return descuentoSalarialDiario;
    }

    public void setDescuentoSalarialDiario(double descuentoSalarialDiario) {
        this.descuentoSalarialDiario = descuentoSalarialDiario;
    }

    public Collection<Docente> getHuelguistas() {
        return huelguistas;
    }

    public void setHuelguistas(Collection<Docente> huelguistas) {
        this.huelguistas = huelguistas;
    }

    @Override
    public String toString() {
        return "CentroEducativo{" +
                "nombre='" + nombre + '\'' +
                ", plantillaTotal=" + plantillaTotal +
                ", descuentoSalarialDiario=" + descuentoSalarialDiario +
                ", huelguistas=" + huelguistas +
                '}';
    }

}
