package mcm.personal.patrones.simpleFactory;

public class Pizzeria {

	public Pizza crearPizzaChica() {
		//Otras acciones u operaciones
		return new Pizza(6);			//Se pueden establecer reglas especificas a cada objeto 
	}
	
	public Pizza crearPizzaMediana() {
		return new Pizza(8);
	}
	
	public Pizza crearPizzaGrande() {
		return new Pizza(12);
	}
}
