package Herencia;

public class Animal {
	private String nombre;

	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void hacersonido() {
		System.out.println("El animal hace un sonido");
		
	}
	public String tostring() {
		return "Animal [nombre=" + nombre + "]";
	}

}
