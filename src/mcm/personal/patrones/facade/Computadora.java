package mcm.personal.patrones.facade;

public class Computadora {	//Representa el sistema complejo

	private ITeclado teclado;
	private IMouse mouse;
	
	public Computadora(ITeclado teclado, IMouse mouse) {
		this.teclado = teclado;
		this.mouse = mouse;
	}
	
	public void endencer() {
		this.teclado.conectar();
		this.mouse.conectar();
	}
}
