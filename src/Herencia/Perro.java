package Herencia;
class Perro extends Animal {
	private String raza;
    
    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public void hacersonido() {
		// TODO Auto-generated method stub
		super.hacersonido();
	}

	@Override
	public String tostring() {
		// TODO Auto-generated method stub
		return super.tostring();
	}


   
}