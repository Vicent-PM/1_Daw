public class Partido {
	private Equipo equipo1;
	private Equipo equipo2;

	public Partido(String nombreEquipo1, String nombreEquipo2) {
		equipo1 = new Equipo(nombreEquipo1);
		equipo2 = new Equipo(nombreEquipo2);
	}

	public void getInfoJugador(String nombreEquipo, int dorsal) {
		if (equipo1.getNombre() == nombreEquipo) {
			System.out.println(equipo1.getJugador(dorsal).toString());
		}

		if (equipo2.getNombre() == nombreEquipo) {
			System.out.println(equipo2.getJugador(dorsal).toString());
		}
	}

	public void muestraResultado() {
		System.out.println("EL partido va: " + equipo1.totalGoles() + " - " + equipo2.totalGoles());
	}

	public void muestraMaxGoleador() {
		System.out.println("El maximo goleador del equipo 1: \n" + equipo1.maximoGoleador());
		System.out.println("El maximo goleador del equipo 2: \n" + equipo2.maximoGoleador());
	}

	public void muestraTotalAmonestaciones() {
		System.out.println("Hay " + equipo1.totalAmonestaciones() + " amarillas en el equipo 1 y "
				+ equipo2.totalAmonestaciones() + " amarillas en el equipo dos");
		System.out.println("Hay " + equipo1.totalExpulsiones() + " expulsados en el equipo 1 y "
				+ equipo2.totalExpulsiones() + " expulsados en el equipo 2");
	}

	public void anotarGol(int dorsal, String nombreEquipo) {
		if (nombreEquipo == equipo1.getNombre()) {
			equipo1.getJugador(dorsal).gol();
		}
		if (nombreEquipo == equipo2.getNombre()) {
			equipo2.getJugador(dorsal).gol();
		}
	}

	public void anotarGol(int dorsalAsistencia, int dorsalGol, String nombreEquipo) {
		if (nombreEquipo == equipo1.getNombre()) {
			equipo1.getJugador(dorsalAsistencia).asistencia();
			equipo1.getJugador(dorsalGol).gol();
		}
		if (nombreEquipo == equipo2.getNombre()) {
			equipo2.getJugador(dorsalAsistencia).asistencia();
			equipo2.getJugador(dorsalGol).gol();
		}
	}

	public void sumarAmarilla(int dorsal, String nombreEquipo) {
		if (nombreEquipo == equipo1.getNombre()) {
			equipo1.getJugador(dorsal).amarilla();
		}
		if (nombreEquipo == equipo2.getNombre()) {
			equipo2.getJugador(dorsal).amarilla();
		}
	}

	public void expulsarJugador(int dorsal, String nombreEquipo) {
		if (nombreEquipo == equipo1.getNombre()) {
			equipo1.getJugador(dorsal).haSidoExpulsado();
		}
		if (nombreEquipo == equipo2.getNombre()) {
			equipo2.getJugador(dorsal).haSidoExpulsado();
		}
	}
}
