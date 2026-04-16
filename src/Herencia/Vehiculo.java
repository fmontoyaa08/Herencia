package Herencia;

public class Vehiculo {
    protected String marca;    // <--- DEBE SER PROTECTED
    protected int velocidad;   // <--- DEBE SER PROTECTED

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Velocidad: " + velocidad);
    }
}