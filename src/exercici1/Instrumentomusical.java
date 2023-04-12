package exercici1;

public abstract class Instrumentomusical {
	
	protected static String nombre;
	protected static int precio;
	
	
	
	public Instrumentomusical(String nombre, int precio) {
		Instrumentomusical.nombre = nombre;
		Instrumentomusical.precio = precio;
	}

	void tocar() {
	}


	

	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Instrumentomusical.nombre = nombre;
	}

	public static int getPrecio() {
		return precio;
	}

	public static void setPrecio(int precio) {
		Instrumentomusical.precio = precio;
	}

	@Override
	public String toString() {
		return "El instrumento:" + nombre + ", tiene un precio de " + precio + "€";
	}



	
	
	

}
