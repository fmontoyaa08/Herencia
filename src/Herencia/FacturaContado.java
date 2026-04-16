package Herencia;

public class FacturaContado extends Factura {
    private double descuento;

    public FacturaContado(int numero, Cliente cliente, double total, double descuento) {
        super(numero, cliente, total);
        this.descuento = descuento;
    }

    @Override
    public void calcularTotal() {
        double totalFinal = total - descuento;
        System.out.println("FACTURA CONTADO #" + numero);
        System.out.println("Cliente: " + cliente.getNombre() + " (NIT: " + cliente.getNit() + ")");
        System.out.println("Total con descuento aplicado: Q" + totalFinal);
    }
}