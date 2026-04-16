package Herencia;

public class Cuenta {
    protected double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: Q" + saldo);
    }
}

class CuentaCorriente extends Cuenta {
    private double limiteSobregiro;

    public CuentaCorriente(double saldo, double limiteSobregiro) {
        super(saldo);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double monto) {
        if (saldo + limiteSobregiro >= monto) {
            saldo -= monto;
            System.out.println("Retiro exitoso con sobregiro.");
        } else {
            System.out.println("Error: Excede el limite de sobregiro.");
        }
    }
}