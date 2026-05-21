package org.example.SIMULACRO;

import org.example.APUNTES_RECU_CLAVE_CTRL_F.ResumenClave;
import org.example.TEMARIO_CURSO.TEMA2.RANDOM.random;

import javax.print.Doc;
import java.util.*;

public class CentroEducativo {

    static Random aleatorio = new Random();
    static LinkedHashSet<Docente> listaDocentes = new LinkedHashSet<>();

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


    public static void generarHuelguistasAleatorios(){



        Set<Integer> set_dni = new HashSet<>();

        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";

        StringBuilder dni = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            dni.append(aleatorio.nextInt(10));
        }

    }

    public static void mostrarHuelguistasActuales(){

        int contadorDocentes = 0;

        for (Docente docente : listaDocentes){
            System.out.println(contadorDocentes + ". DNI: " + docente.getDni() + " - días huelga: " + docente.getDiasHuelga() + " - estado: " + docente.getEstado());
            contadorDocentes++;
        }
    }

    public static Docente validarDocente(String dni){

        System.out.println("Validando...");

        for (Docente docente : listaDocentes){
            if (docente.getDni().isEmpty()){
                System.out.println("El docente no existe como huelguista.");
                return null;
            } else {
                System.out.println("El docente no existe como huelguista.");
                return docente;
            }
        }
        return null;
    }

    public static void sortearServiciosMinimos(){

    }

    public static void limpiarRegistro(){

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CentroEducativo that = (CentroEducativo) o;
        return plantillaTotal == that.plantillaTotal && Double.compare(descuentoSalarialDiario, that.descuentoSalarialDiario) == 0 && Objects.equals(aleatorio, that.aleatorio) && Objects.equals(nombre, that.nombre) && Objects.equals(huelguistas, that.huelguistas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aleatorio, nombre, plantillaTotal, descuentoSalarialDiario, huelguistas);
    }
}
