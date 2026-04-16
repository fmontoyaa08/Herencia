package Herencia;

// 1. CLASE PADRE
public class Producto {
    protected String fechaVencimiento;

    public Producto(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void mostrar() {
        System.out.println("Fecha de Vencimiento: " + fechaVencimiento);
    }
} // <-- Aquí termina Producto

// 2. CLASE HIJA (Va afuera de las llaves de Producto)
class ProductoPerecedero extends Producto {
    
    public ProductoPerecedero(String fechaVencimiento) {
        super(fechaVencimiento);
    }

    public void estaVencido(int dias) {
        if (dias <= 0) {
            System.out.println("Estado: PRODUCTO VENCIDO");
        } else {
            System.out.println("Estado: Vigente (Faltan " + dias + " dias)");
        }
    }

    @Override
    public void mostrar() {
        super.mostrar(); // Llama al mostrar del padre para ver la fecha
        estaVencido(5);  // Probamos con 5 días de ejemplo
    }
} // <-- Aquí termina ProductoPerecedero