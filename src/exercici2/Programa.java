package exercici2;

public class Programa {

	public static void main(String[] args) {
		
		//Invocar un método estático.
		System.out.println("Vamos a sacar el coche al circuito.\nEmpieza la carrera:");
		System.out.println("Se acerca una curva cerrada y ");
		Coche.frenar();
		
		//invocar un método no estático:
		//instanciamos objeto de la clase coche para poder llamar al método acelerar
		Coche coche1 = new Coche("Seat", "Ibiza", 150);
		Coche.setModelo("Ibiza");
		System.out.println(coche1);
		coche1.acelerar();
		
		
		
		

	}

}
