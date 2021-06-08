package mcm.personal.patrones.factoryMethod;

public class Pizza {

		private int  cantidadRebanadas;
		private String especialidad;
		
		public Pizza (int cantidadReb, String especialidad) {
			this.cantidadRebanadas = cantidadReb;
			this.especialidad  = especialidad;
		}
		
		public String toString() {
			return "Cantidad rebanadas: " + this.cantidadRebanadas + 
					" Especialidad: " + this.especialidad;
		}
}

