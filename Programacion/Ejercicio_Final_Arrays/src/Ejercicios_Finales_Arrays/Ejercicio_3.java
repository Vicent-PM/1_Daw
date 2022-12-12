import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_3 {
    /*
     * Crear un array de 10 números enteros introducidos por el teclado. A
     * continuación,
     * desplazar los valores en el mismo array una posición hacia abajo, y el número
     * de la última
     * posición pasando a estar en la primera posición. Después imprimirlo.
     * Por ejemplo, tenemos {1,2,3,4,5,6,7,8,9,10], el resultado sería
     * 10,1,2,3,4,5,6,7,8,9}
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce un valor para la posicion " + i);
            array[i] = scanner.nextInt();
        }

        int[] arrayAux = new int[array.length];

        for (int i = 0; i < arrayAux.length; i++) {
            arrayAux[i] = array[i];
        }

        array[0] = arrayAux[arrayAux.length - 1];

        for (int i = 1; i < array.length; i++) {
            array[i] = arrayAux[i - 1];
        }

        System.out.println(Arrays.toString(array));
        scanner.close();
    }
}
