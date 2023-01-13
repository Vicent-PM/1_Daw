import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		imprimir("Tama�o de la agenda?");
		int size = sc.nextInt();
		Agenda agenda = new Agenda(size);

		do {
			imprimirMenu();
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				agenda.listarContactos();
				break;

			case 2:
				imprimir("Introduce nombre de usuario");
				String name = sc.nextLine();
				imprimir("Introduce n�mero de tel�fono");
				int number = sc.nextInt();
				Contacto c = new Contacto(number, name);
				System.out.println("Contacto añadido");
				agenda.meterContacto(c);
				break;

			case 3:
				imprimir("Introduce el nombre del contacto a eliminar");
				String n = sc.nextLine();
				agenda.eliminarContacto(n);
				break;

			case 4:
				imprimir("Introduce el nombre del contacto que buscas");
				String n1 = sc.nextLine();
				agenda.buscarContacto(n1);
				break;

			case 5:
				System.out.println("Huecos libres: " + agenda.numHuecosLibres());
				break;
			default:
				imprimir("Programa finalizado");
				break;
			}
		} while (opcion >= 1 && opcion <= 5);
		sc.close();

	}

	public static void imprimir(String message) {
		System.out.println(message);

	}

	public static void imprimirMenu() {
		System.out.println();
		System.out.println("Selecciona una opci�n:");
		System.out.println("1. Listar contactos");
		System.out.println("2. Meter contacto");
		System.out.println("3. Eliminar contacto");
		System.out.println("4. Buscar contacto");
		System.out.println("5. Mostrar espacios libres");
		System.out.println("Cualquier otro n�mero para salir");
	}

}
