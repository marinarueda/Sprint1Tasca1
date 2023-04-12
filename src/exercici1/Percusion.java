package exercici1;

public class Percusion extends Instrumentomusical {
	
	
	public Percusion(String nombre, int precio) {
		super(nombre, precio);
		
	}

	void tocar(){
        System.out.println("Mi Constructor");
	}
	static{
        System.out.println("Está sonando un instrumento de percusión");
	}

	
	
	
	

	

}
