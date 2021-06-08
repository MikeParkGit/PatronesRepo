package mcm.personal.patrones.abstractFactory;

public class SamsungStore implements IAbstractFactory {

	public IComputadora crearComputadora() {
		return new SamsungPro();
	}
	
	public ITablet crearTablet() {
		return new TabS3();
	}
}
