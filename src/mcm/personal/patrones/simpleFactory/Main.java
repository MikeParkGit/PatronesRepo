package mcm.personal.patrones.simpleFactory;

public class Main {
	
	public static void main (String []args) {
		
		Pizzeria pizzeria = new Pizzeria();
		
		Pizza pizzaPeperoni = pizzeria.crearPizzaChica();
		System.out.println(pizzaPeperoni);
		
		Pizza pizzaMexicana = pizzeria.crearPizzaGrande();
		System.out.println(pizzaMexicana);
		
	}

}
