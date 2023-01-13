import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean esCero = true;

        while (esCero) {
            System.out.println("Introduzca un numero");
            int n = scanner.nextInt();

            if (n > 0) {
                System.out.println("Es positivo");
            } else if (n < 0) {
                System.out.println("Es negativo");
            } else {
                esCero = false;
            }
        }
        scanner.close();
    }
}
