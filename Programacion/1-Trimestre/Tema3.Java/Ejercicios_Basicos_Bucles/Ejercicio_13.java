import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 1;
        int suma = 0;

        while (n > 0 || n < 0) {
            System.out.println("Introduce un numero");
            n = scanner.nextInt();

            if (n != 0) {
                suma = suma + n;
            } else {
                break;
            }
        }
        System.out.println("EL resultado de la suma es = " + suma);
        scanner.close();
    }
}
