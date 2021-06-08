package mcm.personal.patrones.command;

public class OffDevice implements ICommand{

	private IDevice device;
	
	public OffDevice (IDevice device) {
		this.device = device;
	}
	
	public void operacion() {
		this.device.off();
	}
}
