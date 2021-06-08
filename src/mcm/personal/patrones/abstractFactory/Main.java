package mcm.personal.patrones.abstractFactory;

public class Main {

	public static void main(String[] args) {
		
		SamsungStore samsung = new SamsungStore();
		AppleStore apple = new AppleStore();
		
		IComputadora spro = samsung.crearComputadora();
		ITablet tabS3 = samsung.crearTablet();
		
		IComputadora mpro = apple.crearComputadora();
		ITablet ipad = apple.crearTablet();
		

	}

}
