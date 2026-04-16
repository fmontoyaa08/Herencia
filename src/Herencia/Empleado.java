package Herencia;

public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void calcularSalario() {
        System.out.println("Salario de " + nombre + ": Q" + salario);
    }
}

class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }

    @Override
    public void calcularSalario() {
        double total = salario + bono;
        System.out.println("Salario total del Gerente (con bono): Q" + total);
    }
}