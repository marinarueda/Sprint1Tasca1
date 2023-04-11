package exercici1;

public class Cuerda extends Instrumentomusical{
	
	private String nombre;
	private int precio;
	
	
	public Cuerda(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public void tocar() {
		System.out.println("Está sonando un instrumento de cuerda");
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Cuerda [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	

	

}
