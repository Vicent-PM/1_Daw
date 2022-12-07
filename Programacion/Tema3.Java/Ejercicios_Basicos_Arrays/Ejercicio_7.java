import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el tamaño del array");
        int tamaño = scanner.nextInt();

        scanner.close();

        int arrayNum[] = new int[tamaño];
        //Rellenando el array
        for (int i = 0; i < tamaño; i++) {
            arrayNum[i] = (int) (Math.random() * 10) + 1;
        }
        //Imprimiendo los valores
        System.out.println(Arrays.toString(arrayNum));
    }
}
