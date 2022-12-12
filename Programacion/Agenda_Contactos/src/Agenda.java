
public class Agenda {
	private Contacto listaC[];

	public Agenda() {
		listaC = new Contacto[10];
	}

	public Agenda(int c) {
		listaC = new Contacto[c];
	}

	public int nextHuecoLibre() {
		int hueco = -1;
		for (int i = 0; i < listaC.length; i++) {
			Contacto contacto = listaC[i];
			if (contacto == null) {
				hueco = i;
				return hueco;
			}
		}
		return hueco;
	}

	public int numHuecosLibres() {
		int cont = 0;
		for (int i = 0; i < listaC.length; i++) {
			if(listaC[i] == null){
				cont += 1;
			}
		}
		return cont;
	}

	public boolean agendaLlena() {
		if (numHuecosLibres() != 0) {
			return true;
		}
		return false;
	}

	public boolean existeContacto(String nombre) {
		for (int i = 0; i < listaC.length; i++) {
			if (listaC[i].getNombre().equals(nombre)) {
				return true;
			}
		}
		return false;
	}

	public void meterContacto(Contacto c) {
		if (nextHuecoLibre() != -1) {
			listaC[nextHuecoLibre()] = c;
		}
	}

	public void buscarContacto(String nombre) {
		for (int i = 0; i < listaC.length; i++) {
			if (listaC[i].getNombre().equals(nombre)) {
				listaC[i].imprimirContacto();
				break;
			}
		}
	}

	public void eliminarContacto(String nombre) {
		for (int i = 0; i < listaC.length; i++) {
			if (listaC[i].getNombre().equals(nombre)) {
				listaC[i] = null;
				System.out.println("El contacto se ha eliminado");
				break;
			}
		}
	}

	public void listarContactos() {
		for (int i = 0; i < listaC.length; i++) {
			if(listaC[i] == null){
				break;
			} else{
				listaC[i].imprimirContacto();
			}
		}
	}
}
