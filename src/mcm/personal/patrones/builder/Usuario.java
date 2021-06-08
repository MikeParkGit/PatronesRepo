package mcm.personal.patrones.builder;

public class Usuario {

	private String nombre;		//requerido
	private String apellido;	//requerido
	
	private String email;
	private String telefono;
	private String direccion;
	
	private Usuario(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = "";
		this.telefono = "";
		this.direccion = "";
	}
	
	public static Usuario make(String nombre, String apellido) {
		return new Usuario(nombre, apellido);
	}

	public Usuario Build() {
		return this;
	}
	
	public Usuario setEmail(String email) {
		this.email = email;
		return this;
	}

	public Usuario setTelefono(String telefono) {
		this.telefono = telefono;
		return this;
	}
	
	public Usuario setDireccion(String direccion) {
		this.direccion = direccion;
		return this;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public String toString() {
		return this.nombre + " " + this.apellido + " " + this.direccion + " " + this.email + " " + this.telefono;
	}
	
}
