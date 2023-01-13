import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el texto 1");
        String texto1 = scanner.nextLine();
        System.out.println("Introduce el texto 2");
        String texto2 = scanner.nextLine();

        if (texto1.equals(texto2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
        scanner.close();
    }
}
