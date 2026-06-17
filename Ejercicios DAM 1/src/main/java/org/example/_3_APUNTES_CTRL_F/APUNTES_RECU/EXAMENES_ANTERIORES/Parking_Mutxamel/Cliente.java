package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.EXAMENES_ANTERIORES.Parking_Mutxamel;

/**
 * HERENCIA: Cliente 'es un' Ticket, pero con la capacidad de pagar.
 * Implementa 'Acciones' porque un cliente físico sí tiene un proceso de pago definido.
 */
public class Cliente extends Ticket implements Acciones {

    public Cliente(String matricula, int minutos) {
        // Llamada al constructor del padre (Ticket)
        super(matricula, minutos);
    }

    /**
     * SOBRESCRITURA (Override): Implementamos la lógica de pago específica del cliente.
     * Calculamos el importe basado en los minutos y cambiamos el estado del ticket.
     */
    @Override
    public void pagar() {
        double precioPorMinuto = 0.05;
        double total = this.minutos * precioPorMinuto;
        System.out.println(">>> PROCESO DE PAGO CLIENTE <<<");
        System.out.println("Matrícula: " + this.matricula + " | Total a pagar: " + total + "€");
        this.estado = Estado.RECOGIDO; // Marcamos como finalizado
    }
}