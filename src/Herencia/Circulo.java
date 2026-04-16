package Herencia;

public class Circulo extends Figura {
    private double radio;

    // 1. Constructor
    public Circulo(double radio) {
        super(); // Llama al padre para que no dé error en la línea 3
        this.radio = radio;
    }

    // 2. Método para calcular el área
    @Override
    public void calcularArea() {
        // Usamos Math.PI para el valor de 3.1416...
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("Área del Círculo con radio " + radio + " es: " + area);
    }
}