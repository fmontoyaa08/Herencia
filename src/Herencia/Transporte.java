package Herencia;

public class Transporte {
    // PROTECTED permite que los hijos (como Bus) usen la variable
    protected int capacidad;

    public Transporte(int capacidad) {
        this.capacidad = capacidad;
    }

    public void descripcion() {
        System.out.println("Capacidad del transporte: " + capacidad);
    }
}