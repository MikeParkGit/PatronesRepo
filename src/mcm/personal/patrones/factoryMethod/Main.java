package mcm.personal.patrones.factoryMethod;

public class Main {

	public static void main(String[] args) {
		
		PizzeriaMiguelito pm = new PizzeriaMiguelito();
		Pizza peperoni = pm.crearPizza("Peperoni");
		Pizza hawaiana = pm.crearPizza("Hawaiana");
		Pizza pizzaOrillaRellena = pm.crearPizza("Peperoni orilla rellena");
		
		System.out.println(peperoni);
		System.out.println(hawaiana);
		System.out.println(pizzaOrillaRellena);
	}

}
