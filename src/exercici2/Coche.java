package exercici2;

public class Coche {
	
	private static final String marca = "Seat"; //damos valor final al atributo
	private static String modelo;
	private final int potencia;
	
	
	public Coche(String marca, String modelo, int potencia) {
		this.potencia = potencia;
	}
	
	public static void frenar(){
		System.out.println("El vehículo está frenando");
	}
	
	public void acelerar() {
		System.out.println("El vehículo está acelerando");
	}


	public static String getModelo() {
		return modelo;
	}


	public static void setModelo(String modelo) {
		Coche.modelo = modelo;
	}


	public static String getMarca() {
		return marca;
	}


	public int getPotencia() {
		return potencia;
	}


	@Override
	public String toString() {
		return "El coche:"+marca+" "+modelo+". Tiene una potencia de: " + potencia + "CV";
	}
	
	
	
	
	

}
