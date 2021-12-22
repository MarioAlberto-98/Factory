package pack;

public class Moto implements Transporte {
	
	@Override
	public void arrancar() {
		System.out.println("Estoy arrancando la Moto");
		
	}
	
	@Override
	public void detener() {
		System.out.println("Estoy deteniendo la Moto");
		
	}
	
	@Override
	public String tipo() {
		return "Moto";
		
	}
	
}
