import java.util.Scanner;

public class PartidoCompleto {

	public static final int NUM_EQUIPOS = 2;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Equipo[] equipos = new Equipo[NUM_EQUIPOS];

		printTexto("Introduce el equipo de casa");
		String name = leerTexto();
		equipos[0] = new Equipo(name);
		printTexto("Introduce el equipo visitante");
		name = leerTexto();
		equipos[1] = new Equipo(name);

		printTexto("Bienvenido al partido: " + equipos[0].getNombre() + " vs " + equipos[1].getNombre());

		int opt = 0;
		do {
			printTexto("\n**MENU**");
			printTexto("1. Mostrar resultado");
			printTexto("2. M�ximos goleadores");
			printTexto("3. Informaci�n de jugador");
			printTexto("4. Total amonestaciones");
			printTexto("5. Anotar gol");
			printTexto("6. Anotar gol con asistencia");
			printTexto("7. Tarjeta amarilla");
			printTexto("8. Tarjeta roja");
			printTexto("Cualquier otro n�mero para salir");
			printTexto("\n");

			opt = leerEntero();

			switch (opt) {
				case 1:
					muestraResultado(equipos);
					break;

				case 2:
					muestraMaxGoleadores(equipos);
					break;

				case 3:
					int numEquipo = selectTeam();
					int numJugador = selectPlayer("");
					getInfoJugador(equipos[numEquipo], numJugador);
					break;

				case 4:
					numEquipo = selectTeam();
					muestraTotalAmonestaciones(equipos[numEquipo]);
					break;

				case 5:
					numEquipo = selectTeam();
					int dorsal = selectPlayer("que marca");
					anotarGol(equipos[numEquipo], dorsal);
					break;

				case 6:
					numEquipo = selectTeam();
					int dorsal1 = selectPlayer("que marca");
					int dorsal2 = selectPlayer("que asiste");
					anotarGol(equipos[numEquipo], dorsal1, dorsal2);

					break;

				case 7:
					numEquipo = selectTeam();
					dorsal = selectPlayer("");
					sumarAmarilla(equipos[numEquipo], dorsal);
					break;

				case 8:
					numEquipo = selectTeam();
					dorsal = selectPlayer("");
					expulsarJugador(equipos[numEquipo], dorsal);
					break;
			}

		} while (opt > 0 && opt < 9);
		printTexto("Fin del partido");

		sc.close();
	}

	static String leerTexto() {
		String texto = sc.nextLine();
		return texto;
	}

	static int leerEntero() {
		int num = sc.nextInt();
		return num;
	}

	static void printTexto(String message) {
		System.out.println(message);
	}

	static int selectTeam() {
		printTexto("Introduce 0 para el equipo que juega en casa, cualquier otro n�mero para el equipo visitante");
		int num = leerEntero();
		if (num != 0) {
			num = 1;
		}

		return num;
	}

	static int selectPlayer(String msg) {
		printTexto("Introduce el dorsal del jugador " + msg);
		return leerEntero();
	}

	/**
	 * M�todo para obtener la informaci�n del jugador
	 * 
	 * @param equipo: (tipo Equipo) equipo al que pertenece el jugador
	 * @param dorsal: (tipo entero) dorsal del jugador
	 */
	public static void getInfoJugador(Equipo equipo, int dorsal) {
		// se obtienen el jugador haciendo uso del m�todo getJugador() implementado en
		// la clase Equipo
		Jugador jugador = equipo.getJugador(dorsal);
		System.out.println(jugador.toString());// se hace uso del m�todo toString(), implementado en la clase del
												// Jugador
	}

	/**
	 * M�todo que muestra el resultado del partido
	 * 
	 * @param equipos (array Equipo)
	 */
	public static void muestraResultado(Equipo[] equipos) {

		// TODO el m�todo imprime el resultado en el formato: equipo1 5 - 0 equipo2
		System.out.println(equipos[0].getNombre() + " " + equipos[0].totalGoles() + " - " + equipos[1].totalGoles()
				+ " " + equipos[1].getNombre());
	}

	/**
	 * M�todo que muestra el m�ximo goleador de cada equipo
	 * 
	 * @param equipos (array Equipo)
	 */
	public static void muestraMaxGoleadores(Equipo[] equipos) {

		// TODO imprime el maximo goleador de cada equipo. tener en cuenta que un equipo
		// puede llevar el marcador a 0
		if(equipos[0].totalGoles() != 0){
			equipos[0].maximoGoleador();
		} else{
			System.out.println("El " + equipos[0].getNombre() + " va a 0 goles");
		}

		if(equipos[1].totalGoles() != 0){
			equipos[1].maximoGoleador();
		} else{
			System.out.println("El " + equipos[1].getNombre() + " va a 0 goles");
		}
	}

	/**
	 * M�todo que imprime el total de amonestaciones del equipo
	 * 
	 * @param equipo (tipo Equipo): equipo del que se quieren saber las
	 *               amonestaciones
	 */
	public static void muestraTotalAmonestaciones(Equipo equipo) {
		System.out.println(
				"Total amonestados en equipo " + equipo.getNombre() + " es:\n - " + equipo.totalAmonestaciones()
						+ " tarjetas amarillas");
		System.out.println(" - " + equipo.totalExpulsiones() + " tarjetas rojas");
	}

	/**
	 * M�todo para expulsar a un jugador
	 * 
	 * @param equipo (tipo Equipo): equipo al que pertenece el jugador
	 * @param dorsal (tipo entero): dorsal del jugador expulsado
	 */
	public static void expulsarJugador(Equipo equipo, int dorsal) {

		// se obtienen el jugador haciendo uso del m�todo getJugador() implementado en
		// la clase Equipo
		Jugador jugador = equipo.getJugador(dorsal);

		if (jugador != null) { // si es distinto de null, puede pasar si el periodista indica un dorsal err�neo
			// TODO implementar la expulsi�n del jugador
			System.out.println("El jugador con dorsal " + jugador + " ha sido expulsado");
			jugador.haSidoExpulsado();
		} else {
			System.out.println("N�mero de jugador incorrecto");
		}

	}

	/**
	 * M�todo para sacar amarilla a un jugador
	 * 
	 * @param equipo (tipo Equipo): equipo que recibe a amonestaci�n
	 * @param dorsal (tipo entero): dorsal del jugador amonestado
	 */
	public static void sumarAmarilla(Equipo equipo, int dorsal) {

		Jugador jugador = equipo.getJugador(dorsal);

		// TODO implementar la amonestaci�n a un jugador.
		System.out.println("El jugador con dorsal " + dorsal + " ha recibido una amarilla");
		jugador.amarilla();
	}

	/**
	 * M�todo para anotar un gol
	 * 
	 * @param equipo    (tipo Equipo): equipo que mete el gol
	 * @param dorsalGol (tipo entero): dorsal del jugador que mete el gol
	 */
	public static void anotarGol(Equipo equipo, int dorsalGol) {

		// TODO implementar el c�digo
		System.out.println("Ha marcado gol el jugador con dorsal " + dorsalGol);
		equipo.getJugador(dorsalGol).gol();
	}

	/**
	 * M�todo para anotar un gol con asistencia de otro jugador
	 * 
	 * @param equipo           (tipo Equipo): equipo que mete el gol
	 * @param dorsalGol        (tipo entero): dorsal del jugador que mete el gol
	 * @param dorsalAsistencia (tipo entero): dorsal del jugador que da la
	 *                         asistencia
	 */
	public static void anotarGol(Equipo equipo, int dorsalGol, int dorsalAsistencia) {

		// TODO implementar el c�digo
		System.out.println("Ha marcado gol el jugador con dorsal " + dorsalGol
				+ " y ha dado la asistencia el jugador con dorsal " + dorsalAsistencia);
		equipo.getJugador(dorsalGol).gol();
		equipo.getJugador(dorsalAsistencia).asistencia();
	}

}
