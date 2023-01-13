import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean salir = true;

        while (salir) {
            System.out.println("Si desea salir pulse si, s, yes, y (mayuscula tambien)");
            String palabraClave = scanner.nextLine();

            palabraClave = palabraClave.toLowerCase();

            if (palabraClave.equals("si") || palabraClave.equals("s") || palabraClave.equals("yes") || palabraClave.equals("y")) {
                System.out.println("Has salido del programa");
                salir = false;
            }
        }
        scanner.close();
    }
}
