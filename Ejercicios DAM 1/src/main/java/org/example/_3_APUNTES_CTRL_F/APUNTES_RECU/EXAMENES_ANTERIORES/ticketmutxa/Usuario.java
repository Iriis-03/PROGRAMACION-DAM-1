package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.EXAMENES_ANTERIORES.ticketmutxa;

import java.util.*;

/**
 * CLASE USUARIO: Representa al cliente.
 * Implementa 'Acciones' para cumplir el contrato de login y pago.
 */
public class Usuario implements Acciones {
    private String nombre_usuario;
    private String contraseña;

    // MAPA: Relaciona un Evento (clave) con la cantidad de entradas (valor).
    // Es el "Carrito de la compra".
    private Map<Evento, Integer> carritoCompra = new HashMap<>();

    public Usuario(String nombre, String pass) {
        this.nombre_usuario = nombre;
        this.contraseña = pass;
    }

    /**
     * LÓGICA DE LOGIN: Pide datos por consola y los busca en el Set global.
     */
    @Override
    public boolean autenticarse(Set<Usuario> registrados) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce usuario: "); String u = sc.nextLine();
        System.out.print("Introduce pass: "); String p = sc.nextLine();

        for (Usuario user : registrados) {
            if (user.nombre_usuario.equals(u) && user.contraseña.equals(p)) return true;
        }
        return false;
    }

    /**
     * GESTIÓN DEL CARRITO: Controla que no se superen las 7 entradas.
     * Usa getOrDefault para manejar casos donde el evento aún no está en el mapa.
     */
    public void setCarrito(Evento e, int cant) {
        int actual = carritoCompra.getOrDefault(e, 0);
        int nueva = actual + cant; // cant puede ser negativa si estamos borrando

        if (nueva >= 0 && nueva <= 7) {
            carritoCompra.put(e, nueva);
            System.out.println("Carrito actualizado: " + nueva + " entradas.");
        } else {
            System.out.println("Error: Máximo 7 entradas permitidas.");
        }
    }

    /**
     * LÓGICA DE PAGO: Muestra el total y suma los gastos del Enum.
     */
    @Override
    public void pagar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione método de pago (PAYPAL, BIZUM, APPLEPAY):");
        try {
            MetodoPago mp = MetodoPago.valueOf(sc.nextLine().toUpperCase());
            System.out.println("Pago realizado con " + mp + ". Gastos gestión: " + mp.getGastos() + "€");
            System.out.println("¡Gracias por tu compra!");
        } catch (IllegalArgumentException e) {
            System.out.println("Método no reconocido.");
        }
    }

    public String getNombre() { return nombre_usuario; }
}
