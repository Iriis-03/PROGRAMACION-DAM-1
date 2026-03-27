package org.example.TEMA7.Colecciones.Practica;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AppZonaClientes {

    static Scanner read = new Scanner(System.in);
    private static Cliente cliente;


    static void main(String[] args) {

        Mercadam mercadam = new Mercadam();

        mercadam.generarClientes(5);

        System.out.print(mercadam.getClientes().size() + " clientes generados."); //Se muestran los clientes para que se puedan registrar
        System.out.println(mercadam.getClientes()); //sout obtiendo los clientes para pruebas

        System.out.println("  === COMPRA ONLINE EN MERCADAM ===");
        autenticacion(mercadam.getClientes());
    }

    public static void autenticacion(Set<Cliente> clientes) {

        int intentos = 3;

        while (intentos > 0) {
            System.out.print("usuario: ");
            String usuario = read.nextLine();
            System.out.print("contraseña: ");
            String contrasenya = read.nextLine();

            for (Cliente cliente1 : clientes) {
                if (cliente1.getUsuario().equals(usuario) && cliente1.getContrasenya().equals(contrasenya)) {
                    cliente = cliente1;
                    System.out.println("Bienvenido, " + cliente.getUsuario());
                    System.out.println();
                    iniciarCompra();
                    return;
                }
            }

            intentos--;

            if (intentos > 0) {
                System.out.println("Credenciales no válidas. Intentos: " + intentos);
            }
        }
        System.out.println("ERROR DE AUTENTICACIÓN");
    }

    public static void iniciarCompra() {

        System.out.println("Creando nuevo pedido...");
        System.out.println();
        cliente.crearPedido();

        String anadir_producto = "S";

        while (anadir_producto.equalsIgnoreCase("S")) {

            imprimirProductos(); // Solo imprime

            System.out.println("===============================================");
            System.out.print("Elige un producto: ");
            String producto_elegido = read.nextLine();

            try {
                Producto producto = Producto.valueOf(producto_elegido.toUpperCase());

                cliente.insertarProducto(producto);
                System.out.println("Has añadido " + producto_elegido + " con un precio de " + producto.getPrecio());
                System.out.println("Importe actual: " + cliente.getPedido().getImporteTotal());

            } catch (Exception exception) {
                System.out.print("Producto no reconocido. Elige otro...");
                continue; //Vuelve al inicio del while
            }

            System.out.print("¿Desea añadir más productos? (S/N): ");
            anadir_producto = read.nextLine();
            System.out.println();
        }
        imprimirResumen(); //Se ve por pantalla los productos que están añadidos al pedido
    }

    public static void imprimirProductos() {
        System.out.println("Elige un producto de la lista...");

        for (Producto producto : Producto.values()) {
            System.out.println(producto.name() + ": " + producto.getPrecio() + "€");
        }
    }

    public static void imprimirResumen() {
        Pedido pedido = cliente.getPedido();

        System.out.println("=== RESUMEN DE TU CARRITO DE LA COMPRA ===");
        System.out.println("Productos:");

        for (Map.Entry<Producto, Integer> entry : pedido.getPedido().entrySet()) {
            Producto producto = entry.getKey();
            int cantidad_producto = entry.getValue();
            System.out.println(cantidad_producto + " " + producto + " " + producto.getPrecio());
        }

        System.out.println("Importe total: " + pedido.getImporteTotal() + "€");
        mostrarOpciones();
    }

    public static void mostrarOpciones() {

        int opcion;

        do {
            System.out.println("=====================================================");
            System.out.println("¿Qué desea hacer?");
            System.out.println("[1]. Aplicar promos.");
            System.out.println("[2]. Mostrar resumen ordenado por uds.");
            System.out.println("[3]. Terminar pedido.");

            System.out.println("Selecciona una opción:");
            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    cliente.getPedido().aplicarPromo3x2();
                    cliente.getPedido().aplicarPromo10();
                    break;
                case 2:
                    imprimirResumen();
                    break;
                case 3:
                    imprimirDespedida();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;

            }
        } while (opcion != 3);
    }

    public static void imprimirDespedida() {
        System.out.println("=== GRACIAS POR SU PEDIDO ===");
        System.out.println("Lo recibirá en unos días en la dirección " + cliente.getDireccion());
    }

}

