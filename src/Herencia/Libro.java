package Herencia;

public class Libro {
	protected String titulo;
	protected String autor;
	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public void mostrarInfo() {
		System.out.println("Libro:" + titulo +", Autor:" + autor);
	}

}
