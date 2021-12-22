package pack;

public class Automovil implements Transporte {
	
	@Override
	public void arrancar() {
		System.out.println("Estoy arrancando la Automovil");
		
	}
	
	@Override
	public void detener() {
		System.out.println("Estoy deteniendo la Automovil");
		
	}
	
	@Override
	public String tipo() {
		return "Automovil";
		
	}
	
}
