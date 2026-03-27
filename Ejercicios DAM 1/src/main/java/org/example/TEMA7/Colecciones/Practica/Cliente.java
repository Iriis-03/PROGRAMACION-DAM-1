package org.example.TEMA7.Colecciones.Practica;

public class Cliente {

    private String usuario;
    private String contrasenya;
    private String direccion;
    private Pedido pedido;
    private boolean promociones;

    public Cliente(String usuario, String contrasenya) {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        this.direccion = "Calle falsa, 123";
        this.pedido = null;
        this.promociones = false;
    }

    public void crearPedido(){ //Se crea un pedido a través de este método
        pedido = new Pedido();
    }

    public void insertarProducto(Producto producto){

        if (this.pedido == null) { //Evita cualquier tipo de error al verificar que el pedido está vacío, si es así crea un nuevo pedido a través del otro método
            this.crearPedido();
        }

        int producto_total = this.pedido.getPedido().getOrDefault(producto, 0); //El GetOrDefault actúa en función de si, en este caso, recibe el valor del producto y no lo encuentra, devuelve un 0 en vez de null
        this.pedido.getPedido().put(producto, producto_total + 1); //Se suma 1 y se guarda
        this.pedido.actualizarImporteTotal(producto.getPrecio()); //Se le suma el precio del producto al total
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public boolean isPromociones() {
        return promociones;
    }

    public void setPromociones(boolean promociones) {
        this.promociones = promociones;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "usuario='" + usuario + '\'' +
                ", contrasenya='" + contrasenya + '\'' +
                ", direccion='" + direccion + '\'' +
                ", pedido=" + pedido +
                ", promociones=" + promociones +
                '}';
    }
}
