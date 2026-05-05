package org.example.ENTORNOS_DE_DESARROLLO;

/**
 * Clase Madre que representa la NaveSpaceX de Elon Musk con operaciones
 * básicas como lanzar, aterrizar, repostar, si hay suficiente combustible, consultar cuanto combustible queda
 * y comprobar si la nave está en vuelo.
 *
 * Esta clase simula el comportamiento básico de la NaveSpaceX.
 *
 * @author Silvia Dianez
 * @version 1.0
 * @since 2026-04-24
 */

public class NaveSpaceX {

    protected String nombre;
    protected double combustible;
    protected Motor motor;
    protected boolean enVuelo;

    /**
     * Constructor para crear una NaveSpaceX con nombre, combustible,
     * se crea un nuevo objeto de tipo motor e inicializar con el booleano "false" antes de que despegue.
     *
     * @param nombre nombre de la NaveSpaceX
     * @param combustible combustible de la NaveSpaceX
     */

    public NaveSpaceX(String nombre, double combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
        this.motor = new Motor("Merlin", 845);
        this.enVuelo = false;
    }

    /**
     * Método para lanzar la NaveSpaceX
     *
     * Comprueba si el combustible es menor o igual a 0 salta una excepción,
     * de lo contrario, se lanza la NaveSpaceX.
     */

    public void lanzar() {
        if (combustible <= 0) {
            throw new IllegalArgumentException("No hay combustible para lanzar");
        }
        enVuelo = true;
        System.out.println("Lanzando nave " + nombre);
    }

    /**
     * Método para aterrizar la NaveSpaceX
     *
     * Comprueba si la NaveSpaceX no está en vuelo, si es así,
     * lanza una excepción, de lo contrario, se imprime un mensaje conforme
     * la NaveSpaceX ha aterrizado.
     *
     */

    public void aterrizar() {
        if (!enVuelo) {
            throw new IllegalArgumentException("La nave no está en vuelo");
        }
        enVuelo = false;
        System.out.println("Aterrizando nave " + nombre);
    }

    /**
     * Método para repostar la NaveSpaceX
     *
     * Comprueba si la NaveSpaceX tiene menos o igual a 0 de combustible,
     * si es así, lanza una excepción. Si está en vuelo salta una excepción
     * conforme no se puede repostar en vuelo.
     * De lo contrario, añade combustible.
     *
     * @param cantidad cantidad de combustible que hay.
     */

    public void repostar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("Cantidad inválida");
        }
        if (enVuelo) {
            throw new IllegalArgumentException("No se puede repostar en vuelo");
        }
        this.combustible += cantidad;
    }

    /**
     * Método para cuanto combustible ha consumido la NaveSpaceX
     *
     * Comprueba si la NaveSpaceX tiene menos o igual a 0 de combustible,
     * si es así, lanza una excepción. Si hay más cantidad que de combustible,
     * salta una excepción.
     * De lo contrario, quita combustible.
     *
     * @param cantidad cantidad de combustible que hay.
     */

    public void consumirCombustible(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("Cantidad inválida");
        }
        if (cantidad > combustible) {
            throw new IllegalArgumentException("Combustible insuficiente");
        }
        this.combustible -= cantidad;
    }

    /**
     * Método para consultar cuanto combustible tiene la NaveSpaceX
     *
     * Devuelve el combustible que hay en la NaveSpaceX.
     */

    public double consultarCombustible() {
        return combustible;
    }

    /**
     * Método para consultar que la NaveSpaceX está en vuelo
     *
     * Devuelve que la NaveSpaceX está en vuelo.
     */

    public boolean isEnVuelo() {
        return enVuelo;
    }
}

/**
 * Clase hija que representa quienes y cuantós tripulan la NaveSpaceX de Elon Musk con operaciones
 * básicas como embarcar, desembarcar y acoplar.
 *
 * Esta clase simula el comportamiento básico de los astronautas de la NaveSpaceX.
 *
 * @author Silvia Dianez
 * @version 1.0
 * @since 2026-04-24
 */

class NaveTripulada extends NaveSpaceX {

    private int numeroAstronautas;
    private int capacidadMaxima;

    /**
     * Constructor para la NaveTripulada con nombre, combustible, numeroAstronautas y capacidadMaxima.
     *
     * @param nombre nombre del astronauta
     * @param combustible combustible de la NaveSpaceX
     * @param numeroAstronautas número total de astronautas
     * @param capacidadMaxima capacidad máxima de la NaveSpaceX
     */

    public NaveTripulada(String nombre, double combustible, int numeroAstronautas, int capacidadMaxima) {
        super(nombre, combustible);
        this.numeroAstronautas = numeroAstronautas;
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getNumeroAstronautas() {
        return numeroAstronautas;
    }

    public void setNumeroAstronautas(int numeroAstronautas) {
        if (numeroAstronautas < 0 || numeroAstronautas > capacidadMaxima) {
            throw new IllegalArgumentException("Número de astronautas inválido");
        }
        this.numeroAstronautas = numeroAstronautas;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    /**
     * Método para comprobar la cantidad de astronautas que embarcan a NaveSpaceX.
     * Dependiendo de la cantidad se lanzan diferentes excepciones.
     *
     * @param cantidad
     */

    public void embarcar(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("Cantidad inválida");
        }
        if (numeroAstronautas + cantidad > capacidadMaxima) {
            throw new IllegalArgumentException("Capacidad excedida");
        }
        numeroAstronautas += cantidad;
    }

    /**
     * Método para comprobar la cantidad de astronautas que desembarcan a NaveSpaceX.
     * Dependiendo de la cantidad se lanzan diferentes excepciones.
     *
     * @param cantidad
     */

    public void desembarcar(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("Cantidad inválida");
        }
        if (cantidad > numeroAstronautas) {
            throw new IllegalArgumentException("No hay suficientes astronautas");
        }
        numeroAstronautas -= cantidad;
    }

    /**
     * Método para comprobar si se puede acoplar o no la NaveSpaceX.
     * Dependiendo de la cantidad se lanzan diferentes excepciones.
     */

    public void acoplar() {
        if (!enVuelo) {
            throw new IllegalArgumentException("La nave debe estar en vuelo para acoplarse");
        }
        System.out.println("La nave " + nombre + " se está acoplando en órbita.");
    }
}

/**
 * Clase que representa el motor de la NaveSpaceX de Elon Musk
 *
 * Esta clase simula las características del motor de la NaveSpaceX.
 *
 * @author Silvia Dianez
 * @version 1.0
 * @since 2026-04-24
 */

class Motor {

    private String tipo;
    private int potencia;

    /**
     * Constructor para consultar tipo y potencia del motor de la NaveSpaceX
     *
     * @param tipo tipo de motor de la NaveSpaceX
     * @param potencia potencia del motor de la NaveSpaceX
     */

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    /**
     * Método que imprime el tipo y la potencia que tiene el motor de la NaveSpaceX
     */

    public void encender() {
        System.out.println("Motor " + tipo + " encendido con potencia " + potencia);
    }

    /**
     * Método que imprime que el motor de la NaveSpaceX está apagado
     */

    public void apagar() {
        System.out.println("Motor apagado");
    }
}