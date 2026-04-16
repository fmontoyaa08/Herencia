package Herencia;

public class Factura {
    protected int numero;
    protected Cliente cliente;
    protected double total;

    public Factura(int numero, Cliente cliente, double total) {
        this.numero = numero;
        this.cliente = cliente;
        // Validación: que el total no sea negativo
        this.total = (total < 0) ? 0 : total;
    }

    public void calcularTotal() {
        System.out.println("Total base: Q" + total);
    }
}