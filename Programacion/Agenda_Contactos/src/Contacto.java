
public class Contacto {

	private int telefono;
	private String nombre;

	public Contacto(int telefono, String nombre) {
		this.telefono = telefono;
		this.nombre = nombre;
	}

	public Contacto(String nombre) {
		this.nombre = nombre;
		this.telefono = 0;
	}

	public boolean esIgual(String name) {
		if (this.nombre.equals(name)) {
			return true;
		} else {
			return false;
		}
	}

	public void imprimirContacto() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Número: " + this.telefono);
		System.out.println();
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
