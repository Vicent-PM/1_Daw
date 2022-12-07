import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int cont = 0;

        while (n >= 0) {
            System.out.println("Introduce un numero");
            n = scanner.nextInt();

            if (n >= 0) {
                cont = cont + 1;
            } else {
                break;
            }
        }
        System.out.println("Se han introducido " + cont + " numeros.");
        scanner.close();
    }
}
