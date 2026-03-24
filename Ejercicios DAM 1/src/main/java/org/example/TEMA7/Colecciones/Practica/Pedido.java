package org.example.TEMA7.Colecciones.Practica;

import java.util.HashMap;

public class Pedido {

    private HashMap<Producto, Integer> pedido = new HashMap<>();
    private double importeTotal;

    public Pedido(HashMap<Producto, Integer> pedido, double importeTotal) {
        this.pedido = pedido;
        this.importeTotal = importeTotal;
    }

    public Pedido() { //Constructor vacio que utiliza la clase cliente
        this.pedido = new HashMap<>();
        this.importeTotal = 0;
    }

    public void actualizarImporteTotal(double importeTotal){
        this.importeTotal += importeTotal; // Se le suma el precio del producto que se acaba de añadir al total
    }

    public void aplicarPromo3x2(){
        for (Producto producto : pedido.keySet()) { //Se recorre solo la llave, en este caso, el producto

            int cantidad = pedido.get(producto); // Se obtiene la cantidad del producto
            int productoGratis = cantidad / 3; //Se calcula las veces que se aplica la promo del 3x2

            if (productoGratis > 0) { //Si hay algún producto gratis, se le resta su precio del total
                double descuento = productoGratis * producto.getPrecio();
                this.importeTotal -= descuento;
            }
        }
    }

    public void aplicarPromo10(){
        this.importeTotal *= 0.90; //Se le resta el 10% del importe
    }

    public HashMap<Producto, Integer> getPedido() {
        return pedido;
    }

    public void setPedido_mapa(HashMap<Producto, Integer> pedido) {
        this.pedido = pedido;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    @Override
    public String  toString() {
        return "Pedido{" +
                "pedido_mapa=" + pedido +
                ", importeTotal=" + importeTotal +
                '}';
    }
}
