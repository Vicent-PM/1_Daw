import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayNum[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un valor para la posicion " + (i + 1));
            arrayNum[i] = scanner.nextInt();
        }
        for (int j = 0; j < arrayNum.length / 2; j++) {
            System.out.print(arrayNum[j] + " ");
            System.out.print(arrayNum[(arrayNum.length - j) - 1] + " ");
        }
        scanner.close();
    }
}
