package mcm.personal.patrones.facade;

public class Fachada {

	private Computadora computadora;
	
	public Fachada () {
		ITeclado teclado = new Teclado();
		IMouse mouse = new Mouse();
		//Otras acciones necesarias previas a crear computadora 
		this.computadora = new Computadora(teclado, mouse);
	}
	
	public void encender() {
		// Operaciones complejas
		this.computadora.endencer();
	}
}
