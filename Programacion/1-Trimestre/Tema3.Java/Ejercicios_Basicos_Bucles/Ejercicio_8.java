import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduce el numero " + i);
            int n = scanner.nextInt();

            if (n % 3 == 0) {
                System.out.println(n + " si es multiplo de 3");
            } else {
                System.out.println(n + " no es multiplo de 3");
            }
        }
        scanner.close();
    }
}
