import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_1 {
    /*
     * Escribe un programa en el que tendremos un array de tamaño 20. El array
     * deberá rellenarse con valores aleatorios del 1 al 5.
     * Tras esto, se pide al usuario un numero por consola entre el 1 y el 5.
     * El programa debe eliminar el número introducido del array original, creando
     * para ello un array nuevo con el tamaño justo.
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[20];
        int cont = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 6);
        }

        System.out.println("El array original es: " + Arrays.toString(array));

        System.out.println("Introduce el valor que quieres borrar");
        int numeroBorrar = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroBorrar) {
                cont++;
            }
        }

        int[] arrayBorrado = new int[array.length - cont];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != numeroBorrar) {
                arrayBorrado[j] = array[i];
                j++;
            }
        }

        System.out.println("El array sin el numero introducido es: " + Arrays.toString(arrayBorrado));

        scanner.close();
    }
}
