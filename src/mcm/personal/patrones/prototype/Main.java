package mcm.personal.patrones.prototype;

public class Main {

	public static void main(String [] args) {
		
		Enemigo enemigoBase = new Enemigo("Imagen01.jpg", 0, 100, 2);
		
		Enemigo enemigo01 = new Enemigo(enemigoBase);
		Enemigo enemigo02 = new Enemigo(enemigoBase);
		Enemigo enemigo03 = new Enemigo(enemigoBase);
		
		enemigo01.setPosX(100);
		enemigo02.setPosX(150);
		enemigo03.setPosX(200);
		
		//Otra forma de hacerlo
		Enemigo enemigoBase2 = new Enemigo("Imagen01.jpg", 0, 200, 2);
		
		Enemigo enemigo04 = enemigoBase2.clone();
		Enemigo enemigo05 = enemigoBase2.clone();
		Enemigo enemigo06 = enemigoBase2.clone();
		
		enemigo04.setPosX(100);
		enemigo05.setPosX(150);
		enemigo06.setPosX(200);
		
		
	}
}
