import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el tamaño de los arrays");
        int tamaño = scanner.nextInt();

        scanner.close();

        int array1[] = new int[tamaño];
        int array2[] = new int[tamaño];
        int array3[] = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            array1[i] = (int) (Math.random() * 100) + 1;
            array2[i] = (int) (Math.random() * 100) + 1;
            array3[i] = array1[i] * array2[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }
}
