package mcm.personal.patrones.builder;

public class Main {

	public static void main(String []args) {
		
		Usuario usuario = Usuario.make("Miguel", "Cruz")
									.setDireccion("Mar Mediterraneo 162")
									.setEmail("cruzma2005@gamil.com")
									.Build();
		
		System.out.println(usuario);
	}
}
