package mcm.personal.patrones.command;

public class Main {

	public static void main(String[] args) {
		IDevice tv = new TV();

		ICommand on = new OnDevice(tv);
		ICommand off = new OffDevice(tv);
		
		on.operacion();
		off.operacion();
	}

}
