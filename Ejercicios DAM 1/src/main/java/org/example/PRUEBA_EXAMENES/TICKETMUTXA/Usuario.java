package org.example.PRUEBA_EXAMENES.TICKETMUTXA;

import org.example.TEMARIO_CURSO.TEMA5POO.PartidoDeTenis.Set;

import java.util.Map;

public class Usuario implements Acciones{
    private String nombre_usuario;
    private String contrasenya;
    private Map<Evento, Integer> carritoCompra;

    public Usuario(String nombre_usuario, String contrasenya, Map<Evento, Integer> carritoCompra) {
        this.nombre_usuario = nombre_usuario;
        this.contrasenya = contrasenya;
        this.carritoCompra = carritoCompra;
    }

    public Usuario(String nombre_usuario, String contrasenya) {
        this.nombre_usuario = nombre_usuario;
        this.contrasenya = contrasenya;
    }

    public void anyadirAlCarrito(Evento evento, int cantidad){

    }

    public void setCarrito(Evento evento, int cantidad){

    }

    public void verCarrito(){

    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public Map<Evento, Integer> getCarritoCompra() {
        return carritoCompra;
    }

    public void setCarritoCompra(Map<Evento, Integer> carritoCompra) {
        this.carritoCompra = carritoCompra;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre_usuario='" + nombre_usuario + '\'' +
                ", contrasenya='" + contrasenya + '\'' +
                ", carritoCompra=" + carritoCompra +
                '}';
    }

    @Override
    public void pagar() {

    }

    @Override
    public boolean autentificarse(java.util.Set<Usuario> usuariosRegistrados) {
        return false;
    }

}
