import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el tamaño del array");
        int tamaño = scanner.nextInt();

        int[] array = new int[tamaño];
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int j = 0; j < array.length; j++) {
            suma += array[j];
        }
        System.out.println("El array es: " + Arrays.toString(array));
        System.out.println("La suma de sus valores es: " + suma);
        scanner.close();
    }
}
