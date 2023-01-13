import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int suma = 0;
        do {
            System.out.println("Introduce el numero 1");
            int n1 = scanner.nextInt();
            System.out.println("Introduce el numero 2");
            int n2 = scanner.nextInt();

            suma = n1 + n2;
            System.out.println("La suma es " + suma);
        } while (suma != 0);

        scanner.close();
    }
}
