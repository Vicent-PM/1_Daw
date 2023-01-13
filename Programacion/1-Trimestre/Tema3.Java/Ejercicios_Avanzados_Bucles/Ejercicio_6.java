import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 17;
        int n = 0;
        boolean noEsCorrecto = true;

        while (noEsCorrecto) {
            System.out.println("Introduce un numero");
            n = scanner.nextInt();

            if (n == numero) {
                System.out.println("Numero correcto");
                noEsCorrecto = false;
                break;
            } else if (n < numero) {
                System.out.println("El numero que has introducido es mas pequeño");
            } else {
                System.out.println("El numero que has introducido es mas grande");
            }
        }
        scanner.close();
    }
}
