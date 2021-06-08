package mcm.personal.patrones.command;

public class OnDevice implements ICommand{
	
	private IDevice device;
	
	public OnDevice(IDevice device) {
		this.device = device;
	}
	
	public void operacion() {
		this.device.on();
	}

}
