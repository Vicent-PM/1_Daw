import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre del equipo local");
        String nombreEquipo1 = scanner.nextLine();
        System.out.println("Introduce el nombre del equipo visitante");
        String nombreEquipo2 = scanner.nextLine();

        Partido partido1 = new Partido(nombreEquipo1, nombreEquipo2);

        int opcion;

        do {
            System.out.println("Menu");
            System.out.println("1. Informacion del jugador");
            System.out.println("2. Mostrar Resultado");
            System.out.println("3. Muestra el maximo goleador");
            System.out.println("4. Muestra el total de amonestaciones y expulsados");
            System.out.println("5. Anotar un gol a un jugador determinado");
            System.out.println("6. Anotar asistencia y gol a dos jugadores determinados");
            System.out.println("7. Amonestar a un jugador");
            System.out.println("8. Expulsar a un jugador");
            System.out.println("9. Salir del menu");
            System.out.print("Introduce una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    partido1.getInfoJugador(preguntaNombre(), preguntaDorsal());

                    break;
                case 2:
                    partido1.muestraResultado();

                    break;
                case 3:
                    partido1.muestraMaxGoleador();

                    break;
                case 4:
                    partido1.muestraTotalAmonestaciones();

                    break;
                case 5:
                    partido1.anotarGol(preguntaDorsal(), preguntaNombre());
                    break;
                case 6:
                    System.out.println("Introduce el dorsal del jugador del gol");
                    int dorsal2 = scanner.nextInt();

                    partido1.anotarGol(preguntaDorsal(), dorsal2, preguntaNombre());
                    break;
                case 7:
                    partido1.sumarAmarilla(preguntaDorsal(), preguntaNombre());
                    break;
                case 8:
                    partido1.expulsarJugador(preguntaDorsal(), preguntaNombre());
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opcion != 9);
        scanner.close();
    }

    public static String preguntaNombre() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre del equipo");
        String nombre = scanner.nextLine();

        scanner.close();
        return nombre;
    }

    public static int preguntaDorsal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce dorsal del jugador");
        int dorsal = scanner.nextInt();

        scanner.close();
        return dorsal;
    }
}
