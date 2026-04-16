package Herencia;

public class Bus extends Transporte {
    private String ruta;

    public Bus(int capacidad, String ruta) {
        super(capacidad); // Le pasa la capacidad al padre
        this.ruta = ruta;
    }

    @Override
    public void descripcion() {
        // Usamos super.capacidad para traer el dato del padre sin errores
        System.out.println("Bus de ruta: " + ruta + " con capacidad de " + super.capacidad);
    }
}
