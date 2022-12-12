import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        int contImpares = 0;
        int contPares = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce un numero");
            array[i] = scanner.nextInt();
            if (array[i] % 2 == 0) {
                contPares++;
            } else {
                contImpares++;
            }
        }

        int[] arrayPares = new int[contPares];
        int[] arrayImpares = new int[contImpares];
        int k = 0;
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                arrayPares[k] = array[i];
                k++;
            } else {
                arrayImpares[j] = array[i];
                j++;
            }
        }

        System.out.println("Array principal: " + Arrays.toString(array));
        System.out.println("Array pares: " + Arrays.toString(arrayPares));
        System.out.println("Array impares: " + Arrays.toString(arrayImpares));

        scanner.close();
    }
}
