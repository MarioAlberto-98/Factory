package pack;

public class Fabrica {
	public static Transporte construir(String tipo) {
		switch(tipo) {
		case "Moto":
			return new Moto();
		case "Automovil":
			return new Automovil();
		default:
			System.out.println("No se encuentra ese objeto en la fabrica");
			return null;
			
		}
	}
}
