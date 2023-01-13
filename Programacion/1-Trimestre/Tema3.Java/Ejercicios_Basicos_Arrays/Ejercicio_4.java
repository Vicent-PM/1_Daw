import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayNum[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un valor para la posicion " + (i + 1));
            arrayNum[i] = scanner.nextInt();
        }
        scanner.close();
    }
}
