package Herencia;

public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

// Docente puede quedarse aquí porque NO es public
class Docente extends Persona {
    private String especialidad;

    public Docente(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Especialidad: " + especialidad);
    }
}