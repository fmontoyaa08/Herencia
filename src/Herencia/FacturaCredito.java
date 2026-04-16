package Herencia;

public class FacturaCredito extends Factura {
    private double recargo;
    private int cuotas;

    public FacturaCredito(int numero, Cliente cliente, double total, double recargo, int cuotas) {
        super(numero, cliente, total);
        this.recargo = recargo;
        this.cuotas = cuotas;
    }

    @Override
    public void calcularTotal() {
        double totalFinal = total + recargo;
        System.out.println("FACTURA CRÉDITO #" + numero);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Pago en " + cuotas + " cuotas de: Q" + (totalFinal/cuotas));
        System.out.println("Total con recargo: Q" + totalFinal);
    }
}