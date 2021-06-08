package mcm.personal.patrones.simpleFactory;

public class Pizza {

		private int  cantidadRebanadas;
		
		public Pizza (int cantidadReb) {
			this.cantidadRebanadas = cantidadReb;
		}
		
		public String toString() {
			return "Cantidad rebanadas: " + this.cantidadRebanadas;
		}
}
