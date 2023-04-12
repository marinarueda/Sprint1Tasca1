package exercici1;

public class Cuerda extends Instrumentomusical {

	public Cuerda(String nombre, int precio) {
		super(nombre, precio);
	}

	

	void tocar(){
        System.out.println("Mi Constructor");
	}
	static{
        System.out.println("Está sonando un instrumento de cuerda");
	}
	
	
}
