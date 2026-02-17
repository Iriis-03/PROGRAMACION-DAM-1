# Práctica 1. Práctica "El Formiguero" y "La Rebelión"

## ÍNDICE
1. [Intro](#1-intro)
2. [Estructura de clases](#2-estructura-de-clases)
   - Diagrama de clases UML
   - Código de PlantUML
   - Contenido de las clases (.java)
4. [Programa principal ("El Formiguero" y "La Rebelión")](#3-programa-principal-el-formiguero-y-la-rebeli%C3%B3n)
5. [Pruebas](#4-pruebas)
6. [Entrega](#5-entrega)

### 1. Intro
> La práctica consiste en una app ...

### 2. Estructura de clases

#### Diagrama de clases UML
![](img/inmobiliaria.png)

#### Código de PlantUML

````
@startuml
package "org.example.TEMA5POO.inmobiliaria" {

class Casa {
    -direccion : String
    -listaHabitaciones : ArrayList<Habitacion>
    -propietario : Propietario
    --
    +Casa(direccion : String)
    +crearHabitacion(nombre : String, metros : double)
    +eliminarHabitaciones(nombre : String)
    +mostrarHabitaciones()
    +getHabitacionMasGrande() : Habitacion
    +getListaHabitaciones() : ArrayList<Habitacion>
    +setListaHabitaciones(lista : ArrayList<Habitacion>)
    +getDireccion() : String
    +setDireccion(direccion : String)
    +getPropietario() : Propietario
    +setPropietario()
}

class Habitacion {
    -nombre : String
    -metros : double
    --
    +Habitacion(nombre : String, metros : double)
    +getNombre() : String
    +setNombre(nombre : String)
    +getMetros() : double
    +setMetros(metros : double)
}

class Propietario {
    -nombre : String
    -edad : int
    --
    +Propietario(nombre : String, edad : int)
    +getNombre() : String
    +setNombre(nombre : String)
    +getEdad() : int
    +setEdad(edad : int)
}

class Electrodomestico {
    -nombre : String
    -consumo : double
    --
    +Electrodomestico(nombre : String, consumo : double)
    +getNombre() : String
    +setNombre(nombre : String)
    +getConsumo() : double
    +setConsumo(consumo : double)
}

Casa "1" *--> "0..*" Habitacion : contiene
Casa "1" *-- "1" Propietario : propietario
}

@enduml

````

#### Contenido de las clases (.java)
- Clase *casa.java*

````
package org.example.TEMA5POO.inmobiliaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {

    static Scanner read = new Scanner(System.in);

    private String direccion;
    private ArrayList<Habitacion> listaHabitaciones;
    private Propietario propietario;

    public Casa(String direccion) {
        this.direccion = direccion;
        listaHabitaciones = new ArrayList<>();
        setPropietario();
    }

    public void crearHabitacion(String nombre, double metros){

        for (Habitacion habitacion : listaHabitaciones){
            if (habitacion.getNombre().equals(nombre)){
                System.out.println("La habitación " + nombre + " ya existe.");
                return;
            }
        }
        Habitacion habitacion = new Habitacion(nombre, metros);
        listaHabitaciones.add(habitacion);
        System.out.println("Habitación " + nombre + " creada.");
    }

    public void eliminarHabitaciones(String nombre){

        for (Habitacion habitacion : listaHabitaciones){
            if (habitacion.getNombre().equals(nombre)){
                listaHabitaciones.remove(habitacion);
                System.out.println("Habitación " + nombre + " borrada con éxito.");
                return;
            }
        }

        System.out.println("La habitación " + nombre + " no existe.");
    }

    public void mostrarHabitaciones(){

        System.out.println("Casa en " + direccion + " y propietario " + propietario.getNombre() + " tiene " + listaHabitaciones.size() + " habitaciones:");
        for (Habitacion habitacion : listaHabitaciones){
            System.out.println("- " + habitacion.getNombre() + " (" + habitacion.getMetros() + ") m2");
        }
    }

    public Habitacion getHabitacionMasGrande(){

        Habitacion mayor = listaHabitaciones.get(0);
        for (Habitacion habitacion : listaHabitaciones) {
            if (habitacion.getMetros() > mayor.getMetros()){
                mayor = habitacion;
            }
        }
        return mayor;
    }


    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                "propietario=" + propietario +
                '}';
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        System.out.println("Introduce el nombre del propietario: ");
        String nombre = read.next();
        read.nextLine();
        System.out.println("Edad: ");
        int edad = read.nextInt();
        read.nextLine();
        Propietario propietario = new Propietario(nombre, edad);
        this.propietario = propietario;
        System.out.println("Propietario " + nombre + " añadido.");
    }


}
````
> [Link del archivo en GitHub](https://github.com/Iriis-03/PROGRAMACION-DAM-1/blob/351cc938c119b5d1a4e7f6dbc0a6178aafb8d0e2/Ejercicios%20DAM%201/src/main/java/org/example/TEMA5POO/inmobiliaria/Casa.java)
### 3. Programa principal ("El Formiguero" y "La Rebelión")

### 4. Pruebas

### 5. Entrega
- [x] Código fuente en GitHub: [link código](https://github.com/Iriis-03/PROGRAMACION-DAM-1/blob/3e1c6a329fc1c0f0f3fe38fbe28fe8eefc6ea4f5/Ejercicios%20DAM%201/src/main/java/org/example/TEMA5POO/PRACTICA1/Programa.java)
- [ ] Documentación
- [ ] Pruebas
