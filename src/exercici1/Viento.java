package exercici1;

public class Viento extends Instrumentomusical{
	 
	private String nombre;
	private int precio;
	
	
	
	public Viento(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public void tocar() {
		System.out.println("Está sonando un instrumento de viento");
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
		return "Viento [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	

}
