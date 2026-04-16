package Herencia;

public class Rectangulo extends Figura {
    // 1. Atributos
    private double base;
    private double altura;

    // 2. Constructor
    public Rectangulo(double base, double altura) {
        super(); // Esto llama al constructor de Figura y quita el error de la línea 7
        this.base = base;
        this.altura = altura;
    }

    // 3. Método sobrescrito
    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("Área del Rectángulo: " + area);
    }
}