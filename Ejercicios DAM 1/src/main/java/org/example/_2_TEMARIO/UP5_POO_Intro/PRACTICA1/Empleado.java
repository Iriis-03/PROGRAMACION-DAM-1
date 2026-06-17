package org.example._2_TEMARIO.UP5_POO_Intro.PRACTICA1;

public class Empleado {

    private static int contadorID = 1; //Se crea un contador para generar los ID
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = obtenerCargo(cargo); //Se le asigna el cargo a través del método obtenerCargo
        id = obtenerID(); //Crear el ID
        contadorID++; //Se crea un contador para cada vez que se añada un empleado
        director = null; //Al principio el programa no tiene director por eso se le asigna el null

    }

    //método para devolver con un return cada cargo correspondiente
    private String obtenerCargo(String cargo){

        switch (cargo){

            case "director":
                return "director";
            case "técnico":
                return "técnico";
            case "presentador":
                return "presentador";
            case "colaborador":
                return "colaborador";
            default:
                return "pte"; //Si no hay ninguno de los cargos anteriores devolverá con un return "pte"
        }
    }

    //Método para crear el ID con el formato EP... en concreto
    private String obtenerID(){

        String num = Integer.toString(contadorID);
        int num_ceros = 3 - num.length(); //Calcular cantidad de ceros en el formato

        String ceros = "";

        for (int i = 0; i < num_ceros; i++) { //Se añaden los ceros necesarios, dependiendo del número de empleado que sea

           ceros += "0";

        }

        return "EP" + ceros + num; //Se devuelve con un return el formato completo

    }





    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = obtenerCargo(cargo);
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                '}';
    }
}
